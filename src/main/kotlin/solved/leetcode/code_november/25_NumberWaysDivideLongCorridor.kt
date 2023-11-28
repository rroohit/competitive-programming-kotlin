package solved.leetcode.code_november

/**
 *  Problem = 105
 *
 *  *** Number of Ways to Divide a Long Corridor
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(1)
 *
 * # Code =>
 */
fun main() {

    val corridor = "SSPPSPS"

    val ans = numberOfWays(corridor)

    println("Ans ==> $ans")

    println(658597520 % MOD)

}

private val MOD = 1000000007 // 10^9 + 7

fun numberOfWays(corridor: String): Int {
    val size = corridor.length
    var ans = 1L
    var seatCount = 0
    var lastInd = -1

    for (i in 0 until size) {
        if (corridor[i] == 'P') continue

        seatCount++
        if (seatCount >= 3 && seatCount % 2 == 1) {
            val div = i - lastInd
            ans = (div * ans) % MOD

        }

        lastInd = i
    }

    return if (seatCount == 0 || seatCount % 2 == 1) 0 else (ans % MOD).toInt()
}