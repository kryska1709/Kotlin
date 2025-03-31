
//1. Создай список чисел. Используй лямбда-выражение для фильтрации всех четных чисел(готово)
//2. Создай список строк. Отсортируй его по длине строк с использованием лямбда-выражения(готово)
//3. Создай список чисел. Преобразуй каждое число в его квадрат с использованием лямбда-выражения(готово)
//4. Создай список объектов с полями name и age. Используйте лямбда-выражение для нахождения(готово)
// среднего возраста
//5. Создай список строк. Используй лямбда-выражение для поиска первой строки,
// которая начинается с заданной буквы(готово)
fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val filtr = {list:List<Int> ->
        for(i in 0 until list.size){
            if(list[i]%2==0){
                print("${list[i]} ")
            }
        }
    }
    filtr(numbers)
    println()

    val strings = mutableListOf("list","ghost","insidious","trost","attack","titan")
    val filterStringss = {list:List<String> ->
        list.sortedBy {
            it.length
        }
    }
    println(filterStringss(strings))
    val numbers2 = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val squares = {list:List<Int> ->
        for (i in 0 until list.size){
            print("${list[i]*list[i]} ")
        }
    }
    squares(numbers2)
    println()

    val persons = listOf(
        Person("nataniel",19),
        Person("andrew",20),
        Person("jean",21),
        Person("kevin",21),
        Person("aragorn",83),
        Person("legolas",2987)
    )
    val ages = {list:List<Person> ->
        var sum = 0
        for(i in 0 until list.size){
            sum += list[i].age
        }
        println(sum/list.size)
    }
    ages(persons)

    val firstcharr = "t"
    val strings2 = mutableListOf("ghost","insidious","trost","attack","titan")
    val firstChar = {list:List<String> ->
        for (i in 0 until list.size){
            if(list[i].startsWith(firstcharr)){
                println(list[i])
                break
            }
        }
    }
    firstChar(strings2)
}

data class Person(
    val name:String,
    val age:Int
)
