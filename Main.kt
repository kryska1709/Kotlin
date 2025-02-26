//ДЗ_2

//Задание 1: Классы и Data Classes
//Создать data class Book с свойствами title, author и year. Создать несколько экземпляров этого класса
//и вывести их на экран
//Создать обычный класс Library с методом addBook, который принимает объект Book и добавляет
//его в список книг. Также реализовать метод listBooks, который выводит все книги в библиотеке
    //задача1
data class Book(
    var title: String,
    var author: String,
    var year: String
)
class Library(){
    fun addBook(book:Book, books: MutableList<Book>){
        books.add(book)
    }
    fun listBooks(list: MutableList<Book>){
        println(list)
    }
    //задача1
    //задача3
    private var secret1 = Book("жутко громко и запредельно близко","Джонатан Сафран Фоер","2005")
    private var secret2 = Book("плетёный король", "Кайла Анкрум", "2022")
    private var secretBooks = listOf(secret1, secret2)
    fun revealSecretBooks(){
        println("секретные книги: " + secretBooks)
    }
    //задача3
    //задача2
    fun findBookByAuthor(books: MutableList<Book>){
        println("введите автора для поиска книг")
        var authors  = readln()
        var foundBooks = false
        authors.let{
            for(book in books){
            if(authors == book.author){
                println(book.title)
                foundBooks = true
            }
        }
            if (!foundBooks) {
            println("У этого автора нет книг")
            }
        }
    }
}
fun calculateArea(rad: Int): Double{
    return 3.14*(rad*rad)
}
    //задача2
    //задача4
data class User(
    val name: String,
    val age : Int
)
fun printUserInfo(user: User?) {
    user?.let {
        println("имя: ${user.name}, возраст: ${user.age}")
    } ?: run {
        println("информации о данном пользователе нет")
    }
}
data class Owner(
    val car:String,
    val name: String,
    val year: Int
)
class Car(){
    var owner :Owner? = null
    fun describeOwner(owner:Owner?){
        owner?.let{
            println("информация о владельце $owner")
        } ?: run{
            println("информации о владельце нет")
        }
    }
}
//Создай класс Car с nullable полем owner. Напиши метод describeOwner, который использует let
//для вывода информации о владельце, если он не равен null
fun main() {
    //задача1
    val book1 = Book("Всё ради игры: Лисья нора ", "Нора Сакавич", "2021")
    val book2 = Book("Всё ради игры: Король воронов", "Нора Сакавич", "2021")
    val book3 = Book("Всё ради игры: Свита короля", "Нора Сакавич", "2021")
    val book4 = Book("Сильнее страха", "Марк Леви", "2013")
    val book5 = Book("Властелин колец","Дж.Р.Р.Толкин","1954")
    var listBook = mutableListOf(book1, book2, book3)
    println(listBook)
    Library().addBook(book4,listBook)
    Library().addBook(book5,listBook)
    Library().listBooks(listBook)
    //задача1

    //задача2
    Library().findBookByAuthor(listBook)
    println("введите радиус для поиска площади окружности")
    var rad = readln().toInt()
    println(calculateArea(rad))
    //задача2
    //задача3
    Library().revealSecretBooks()
    //задача3
    //задача4
    val user = User("Натаниэль ",19)
    val user1 : User? = null
    printUserInfo(user)
    printUserInfo(user1)
    val owner1 : Owner? = null
    val owner2 = Owner("Nissan","Грейсон",2011)
    Car().describeOwner(owner1)
    Car().describeOwner(owner2)
    //задача4
}
