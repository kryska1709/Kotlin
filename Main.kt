//дз4
fun main() {
    println("введите операцию из списка, которую вы хотите выполнить : 'сложить', 'умножить', 'разделить', 'вычесть'")
    val operation = readlnOrNull()
    println("введите два числа через enter")
    when (operation) {
        "сложить" ->
            calculator(a = readln().toInt(), b = readln().toInt()) { a, b -> a + b }

        "умножить" ->
            calculator(a = readln().toInt(), b = readln().toInt()) { a, b -> a * b }

        "разделить" ->
            calculator(a = readln().toInt(), b = readln().toInt()) { a, b -> a / b }

        "вычесть" ->
            calculator(a = readln().toInt(), b = readln().toInt()) { a, b -> a - b }
    }
    println("введите слово которое хотите проверить (палиндром или нет)")
    palindrom(option = readLine().toString())  {it == it.reversed()}
    println("введите число факториал которого хотите посчитать")
    val result = factorial(number = readln().toInt()) {it}
    println("факториал вашего числа равен: $result")
}
//задача1
fun calculator(a:Int, b:Int, calculate:(Int, Int) -> Int){
    val result = calculate(a, b)
    println(result)
}
//задача2
fun palindrom (option:String, check:(String) -> Boolean){
    when(check(option)){
        true -> println("$option является палиндромом")
        false -> println("$option не является палиндромом")
    }
}
//Задание 3: Обработка числовых последовательностей
//Напиши программу, которая использует лямбда-выражения для обработки числовых последовательностей
//Создай лямбда-выражение для вычисления факториала числа
//Запроси у пользователя число и используй лямбду для вычисления его факториала и также выведи результат
//задача3
fun factorial(number: Int, factor: (Int) -> Int): Int{
    var result = 1
    for (i in 1..number) {result *= factor(i)}
    return result
}