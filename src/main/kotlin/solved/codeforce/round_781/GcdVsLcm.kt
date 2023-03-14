package solved.codeforce.round_781

/**
 * Solved =>  Gcd vs Lcm (Codeforces Round #781)
 *
 * (link - https://codeforces.com/contest/1665/problem/A)
 *
 */

fun main() {

    val noOfTestCases = readln().toLong()

    for (i in 1..noOfTestCases) {
        val n = readln().toLong()
        findGcdLcm(n)
    }

}

fun findGcdLcm(n: Long) {
    println("${n - 3} 1 1 1")
}

/**
 * Example
 *
 * input ->
 *          5 - no of tests
 *          4
 *          7
 *          8
 *          9
 *          10
 *
 * output ->
 *          1 1 1 1
 *          4 1 1 1
 *          5 1 1 1
 *          6 1 1 1
 *          7 1 1 1
 *
 *
 **/