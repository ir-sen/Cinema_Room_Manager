fun main() {
    val v1 = readLine()!!.toString()
    val opera = readLine()!!.toString()
    val v2 = readLine()!!.toString()
    when (opera) {
        "equals" -> println(v1 == v2)
        "plus" -> println(v1 + v2)
        "endsWith" -> println(v1.endsWith(v2))
        else -> println("Unknown operation")
    }
}
