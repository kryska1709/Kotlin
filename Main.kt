
open class Task(var title:String, var description: String, var status: TaskStatus, val priority: Priority): Loggable{
    override fun log(message: String){
        println(message = "задача $title, описание $description, приоритет $priority, статус ")
        TaskMan(status)
    }
}
class UrgentTask(var deadline: String, title: String,description: String,status: TaskStatus,priority: Priority):Task(title,description,status,priority) {}

interface Loggable {
    fun log(message:String)
}
object TaskManager{
    fun addTask(task: Task, listTasks: MutableList<Task>){
        listTasks.add(task);
    }
    fun listTask(listTasks: MutableList<Task>){
        listTasks.forEach{
            println(it.log(""))
        }
    }
}

sealed class TaskStatus()
data class Compiled(val success:String):TaskStatus()
data class Error(val error:String):TaskStatus()
fun TaskMan(taskStatus:TaskStatus){
    when (taskStatus){
        is Compiled -> println(message = "успешно")
        is Error -> println(message = "ошибка")
        }
    }
enum class Priority(){
    LOW,
    MEDIUM,
    HIGH
}

fun main() {
    val tasks = mutableListOf<Task>()
    val task1 = Task("задача1", "сделана нормально", Error("") , Priority.LOW)
    val task2 = Task("задача2","капец не понимаю ничего", Compiled(""), Priority.MEDIUM)
    val task3 = UrgentTask("завтра блин, опаздываем, Олег","задача не знаю какая","моё дз",Compiled(""), Priority.HIGH)
    TaskManager.addTask(task1,tasks)
    TaskManager.addTask(task2,tasks)
    TaskManager.addTask(task3,tasks)
    TaskManager.listTask(tasks)
}