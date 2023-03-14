package solved.codeforce.round_780

/**
 * Solved =>  Vasya and Coins (Codeforces Round #780)
 *
 * (link - https://codeforces.com/contest/1660/problem/A)
 *
 */

fun main() {

    val noOfTestCases = readln().toLong()

    for (i in 1..noOfTestCases) {
        val (a, b) = readln().trim().split("\\s+".toRegex())
        findMinAmountCanNotPay(a.toLong(), b.toLong())
    }
}

fun findMinAmountCanNotPay(a: Long, b: Long) {

    if (a <= 0L) {
        println(1)
    } else {
        val totalCoinsValue = a + (b * 2L)

        if (totalCoinsValue <= 0) {
            println(1)
        } else {
            println(totalCoinsValue + 1)
        }
    }

}

/**
 * Example
 *
 * input ->
 *
 *      5
 *      1 1
 *      4 0
 *      0 2
 *      0 0
 *      2314 2374
 *
 * output ->
 *
 *      4
 *      5
 *      1
 *      1
 *      7063
 */
