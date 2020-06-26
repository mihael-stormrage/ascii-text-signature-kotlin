package signature

fun main() {
    val name = readLine()!!
    val asteriskLine = "*".repeat(name.length + 4)
    println(asteriskLine)
    println("* $name *")
    println(asteriskLine)
}