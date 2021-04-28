fun parseCardNumber(cardNumber: String): Long {
    val temp = cardNumber.split(" ")
    var answer: String = " "
    if (cardNumber in "a".."z") {
        throw Exception("Please write digit!!!")
    } else if (temp.size != 4) {
        throw Exception("Not enough space!!!")
    }

    for (i in temp) {
        if (i.length != 4) {
            throw Exception("Not enough space!!!")
        }
    }

    for (i in temp) {
        for (j in i) {
            answer += j
        }
    }
    val fin = answer.trim(' ').toLong()
    return fin
}
