package solved.leetcode.code_november

/**
 *  Problem = 104
 *
 *  *** Knight Dialer
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 * # Code =>
 */
fun main() {

    val ans = knightDialer(3131)

    println("Ans ==> $ans")

}

private val jumps = mapOf(
    Pair(0, listOf(4, 6)),
    Pair(1, listOf(6, 8)),
    Pair(2, listOf(7, 9)),
    Pair(3, listOf(4, 8)),
    Pair(4, listOf(0, 3, 9)),
    Pair(5, listOf()),
    Pair(6, listOf(0, 1, 7)),
    Pair(7, listOf(2, 6)),
    Pair(8, listOf(1, 3)),
    Pair(9, listOf(4, 2)),
)
private val MOD = 1000000007 // 10^9 + 7

fun knightDialer(n: Int): Int {
    if (n == 1) return 10

    val dp = List(n + 1) { MutableList(10) { -1 } }

    fun travel(rem: Int, curr: Int): Int {
        if (rem == 0) return 1

        if (dp[rem][curr] != -1) return dp[rem][curr]

        var ans = 0
        for (nextD in jumps[curr]!!) {
            ans = (ans + travel(rem - 1, nextD)) % MOD
        }
        dp[rem][curr] = ans % MOD

        return dp[rem][curr]
    }

    var ans = 0

    for (d in 0..9) {
        ans = (ans + travel(n - 1, d)) % MOD
    }


    return ans % MOD
}

class Solution {
    fun knightDialer(n: Int): Int {
        val f: Array<IntArray> = Array(2) { IntArray(10) { 0 } }
        var o = 0

        for (i in 0..9) {
            f[0][i] = 1
        }


        for (j in 2..n) {
            o = 1 - o

            for (i in 0..9) {
                f[o][i] = 0

                for (edge in edges[i]) {
                    f[o][i] = (f[o][i] + f[1 - o][edge]) % MOD
                }
            }
        }

        var res = 0

        for (i in 0..9) {
            res = (res + f[o][i]) % MOD
        }

        return res
    }

    companion object {
        private val edges = arrayOf(
            intArrayOf(4, 6),
            intArrayOf(6, 8),
            intArrayOf(7, 9),
            intArrayOf(4, 8),
            intArrayOf(0, 3, 9),
            intArrayOf(),
            intArrayOf(0, 1, 7),
            intArrayOf(2, 6),
            intArrayOf(1, 3),
            intArrayOf(2, 4)
        )

        private const val MOD = 1_000_000_007
    }
}