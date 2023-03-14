package solved.google.kick_start_c_2022

import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Solved => New Password (Google Kick-Start round C - 2022)
 *
 * (link - https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb4d1/0000000000b20f15)
 *
 */

val specialChar = listOf("@", "#", "*", "&")
fun main() {

    val noOfPasswords = readln().toLong()

    for (i in 1..noOfPasswords) {

        readln().trim()//length of password

        val strPass = readln().trim()

        println("Case #$i: ${findNewPassword(strPass)}")
    }
}

fun findNewPassword(strPass: String): String {
    val newString = arrayListOf<String>()
    if (!strPass.isHaveUppercase()) {
        newString.add(getRandomUpperCase())
    }
    if (!strPass.isHaveLowercase()) {
        newString.add(getRandomLowerCase())
    }
    if (!strPass.isHaveSpecialChar()) {
        newString.add(specialChar[Random.nextInt(specialChar.indices)])
    }
    if (!strPass.isHaveDigit()) {
        newString.add(Random.nextInt(0..9).toString())
    }
    var ans = strPass + newString.joinToString("")

    while (ans.length <= 7) {
        ans +=  Random.nextInt(0..9).toString()
    }

    return ans

}

fun String.isHaveUppercase(): Boolean {
    forEach {
        if (it.isUpperCase()) return true
    }
    return false
}

fun String.isHaveLowercase(): Boolean {
    forEach {
        if (it.isLowerCase()) return true
    }
    return false
}

fun String.isHaveDigit(): Boolean {
    forEach {
        if (it.isDigit()) return true
    }
    return false
}

fun String.isHaveSpecialChar(): Boolean {
    forEach {
        if (specialChar.contains(it.toString())) return true
    }
    return false
}

fun getRandomUpperCase(): String {
    val randomLetter = listOf("\u0041", "\u0042", "\u0043", "\u0043", "\u0045", "\u0046", "\u0047", "\u0048", "\u0049")

    return randomLetter.random()
}

fun getRandomLowerCase(): String {
    val randomLetter = listOf("\u0061", "\u0062", "\u0063", "\u0063", "\u0065", "\u0066", "\u0067", "\u0068", "\u0069")

    return randomLetter.random()
}


/**
 * Example
 *
 * input ->
 *          3 - no of tests
 *          1
 *          A
 *          2
 *          1*
 *          7
 *          1234aB&
 *
 *
 * output ->
 *          Anything accepted as defined conditions passed
 *          1 - At least 7 characters.
 *          2 - At least one uppercase English alphabet letter.
 *          3 - At least one lowercase English alphabet letter.
 *          4 - At least one digit.
 *          5 - At least one special character. There are four special characters: #, @, *, and &.
 *
 *
 **/