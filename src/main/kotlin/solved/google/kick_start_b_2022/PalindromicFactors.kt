package solved.google.kick_start_b_2022

/**
 * Solved => Palindromic Factors (Google Kick-Start round B - 2022)
 *
 * (link - https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caa74/0000000000acee89)
 *
 */


fun main() {

    val numberOfTestCase = readln().toLong()

    for (i in 1..numberOfTestCase) {

        val a = readln().toLong()

        println("Case #$i: ${findPalindromicCount(a)}")

    }

}

fun findPalindromicCount(a: Long): Int {
    val ans = arrayListOf<Long>()

    findFactors(a).forEach { str ->
        if (str.toString().isPalindrome()) {
            ans.add(str)
        }
    }
    return ans.size
}


fun findFactors(x: Long): ArrayList<Long> {
    var i = 1L
    val arr = arrayListOf<Long>()

    while (i * i <= x) {

        if (x % i == 0L) {
            arr.add(i)
            if (x / i != i) {
                arr.add(x / i)
            }
        }
        i++

    }

    return arr
}


fun String.isPalindrome(): Boolean = this == this.reversed()

/**
 * Example
 *
 * input ->
 *          4 - no of tests
 *          6
 *          10
 *          144
 *          242
 *
 *
 * output ->
 *          4
 *          3
 *          7
 *          6
 *
 *
 **/