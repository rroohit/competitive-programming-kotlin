package solved.leetcode.code_march

import kotlin.math.min

/**
 *  Problem = 68
 *
 *  *** Minimum Cost For Tickets
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(38*n)
 *          38 = 1day + 7day + 30day
 *          n = number days to travel
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */

fun main() {

    val days = intArrayOf(1, 4, 6, 7, 8, 20)
    val costs = intArrayOf(2, 7, 15)


    println("ans => ${minCostTickets(days, costs)}")

}

fun minCostTickets(days: IntArray, costs: IntArray): Int {
    val dp = mutableMapOf<Int, Int>()
    val n = days.size

    for (i in n - 1 downTo 0) {
        dp[i] = Int.MAX_VALUE

        for ((c, d) in costs.zip(intArrayOf(1, 7, 30))) {
            var j = i
            while (j < n && days[j] < days[i] + d) {
                j++
            }
            dp[i] = min(dp[i]!!, c + dp.getOrDefault(j, 0))
        }

    }

    return dp[0]!!

}