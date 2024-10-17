fun main() {

    val first: String = "Hello, "
    var end: String = "world!"
    println(first + end)

    var count: Int = 0
    println("You have unread $count messages")


    count++//Increase by 1.
    println("You have unread $count messages")

    count-- //Decrease by 1.
    readMessage(showMessage(), count)

}

fun showMessage(): String {
    val message: String = "Hello developer!"
    return message
}
fun readMessage(message: String, countMessage: Int){
    println(message)
    println("You have unread $countMessage messages")
}