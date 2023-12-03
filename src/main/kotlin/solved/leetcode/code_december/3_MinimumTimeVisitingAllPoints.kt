package solved.leetcode.code_december

import kotlin.math.abs
import kotlin.math.max

/**
 *  Problem = 110
 *
 *  *** Minimum Time Visiting All Points
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (1)
 *
 * # Code =>
 */

fun main() {

    val points = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(3, 4),
        intArrayOf(-1, 0)
    )

    val result = minTimeToVisitAllPoints(points)

    println("Ans ==> $result")

}

fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
    var ans = 0

    for (p in 1 until points.size) {
        // line - X traveling
        val from = abs(points[p][0] - points[p - 1][0])

        // line - Y traveling
        val to = abs(points[p][1] - points[p - 1][1])

        ans += max(from, to)

    }

    return ans
}