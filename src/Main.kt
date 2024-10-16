//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, world!")

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