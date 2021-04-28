// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val figure = readLine()!!.toString()
    when (figure) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            val s: Double = 0.5 * (a + b + c)
            println(s)
        }

        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val s: Double = a * b
            println(s)
        }

        "circle" -> {
            val a = readLine()!!.toDouble()
            val s: Double = 3.14 * (a * a)
            println(s)
        }
    }
}
