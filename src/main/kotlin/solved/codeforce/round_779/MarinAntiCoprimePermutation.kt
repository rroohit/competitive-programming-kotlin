package solved.codeforce.round_779

/**
 * Solved => Marin and Anti-coprime Permutation (Codeforces Round #779)
 *
 * (link - https://codeforces.com/contest/1658/problem/B)
 *
 */

const val MOD = 998244353L

fun main() {

    val noOfTest = readln().toLong()

    for (i in 1..noOfTest) {

        val n = readln().toLong()

        countBeautifulPermutation(n)

    }

}

fun countBeautifulPermutation(n: Long) {
    if (n % 2 == 0L) {
        var ans = 1L
        for (i in 2L..n / 2) {
            ans *= i
            ans %= MOD
        }
        ans *= ans
        ans %= MOD

        println(ans)

    } else {
        println("0")
    }
}

/**
 * Example input
 *
 *      7
 *      1
 *      2
 *      3
 *      4
 *      5
 *      6
 *      1000
 *
 *
 */