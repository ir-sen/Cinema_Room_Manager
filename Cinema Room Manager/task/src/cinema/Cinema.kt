
package cinema

fun main() {
    println("Enter the number of rows: ")
    val row = readLine()!!.toInt()
    println("Enter the number of seats in each row: ")
    val seat = readLine()!!.toInt()
    var temp = 1
    val seatC = Array(row) { Array(seat) { "S" } }
    println()
    var currentIncome: Int = 0
    var totalIncome: Int = 0
    var allSe = row * seat
    var tem: Int = 0
    var tem2: Int = 0
    if (allSe > 60) {
        allSe /= 2
        tem = row / 2
        tem2 = row - tem
        totalIncome = (tem * seat * 10) + (tem2 * seat * 8)
    } else {
        totalIncome = allSe * 10
    }


    var activ = true
    while (activ) {
        println(
            "1. Show the seats\n2. Buy a ticket\n3. Statistics" +
                    "\n0. Exit"
        )

        when (readLine()!!.toInt()) {
            1 -> {
                temp = 1
                println("Cinema: ")
                print(" ")
                for (i in 1..seat) {
                    print(" $i")
                }
                println()
                for (i in seatC) {
                    print("${temp++} ")
                    for (j in i) {
                        print("$j ")
                    }
                    println()
                }
                println()
            }
            2 -> {
                var activ2 = true

                while (activ2)
                    try {
                        println()
                        println("Enter a row number: ")
                        val rowS = readLine()!!.toInt()
                        println("Enter a seat number in that row: ")
                        val seatS = readLine()!!.toInt()
                        println()
                        if (currentIncome == totalIncome) break
                        if (seatC[rowS - 1][seatS - 1] == "B") {
                            println("That ticket has already been purchased!")
                        } else {
                            seatC[rowS - 1][seatS - 1] = "B"
                            var price: Int
                            val allSeat = row * seat
                            val halfRow = row / 2

                            if (allSeat <= 60) {
                                price = 10
                                currentIncome += price
                            } else {
                                if (rowS > halfRow) {
                                    price = 8
                                    currentIncome += price
                                } else {
                                    price = 10
                                    currentIncome += price
                                }
                            }


                            println("Ticket price: \$$price")
                            println()
                            activ2 = false
                        }

                    } catch (e: Exception) {
                        println("Wrong input!")
                    }
            }


            3 -> {
                //The number of purchased tickets
                var purchased = 0
                for (i in seatC) {
                    for (j in i) {
                        if (j == "B") {
                            purchased++
                        }
                    }
                }
                println()
                //Number of purchased
                println("Number of purchased tickets: $purchased")
                //Percentage:
                val allOfSeat = row * seat
                val percentage: Double = 100.0 * purchased / allOfSeat
                //println("Percentage: ${round(percentage * 100) / 100}%")
                println("Percentage: ${"%.2f".format(percentage)}%")

                //Current income
                println("Current income: \$$currentIncome")

                //Total income
                println("Total income: \$$totalIncome")
                println()

            }

            0 -> {
                activ = false
                break
            }

        }
    }

}

