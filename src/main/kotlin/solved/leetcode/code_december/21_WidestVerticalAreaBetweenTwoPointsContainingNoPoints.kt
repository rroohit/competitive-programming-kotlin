package solved.leetcode.code_december

import kotlin.math.max

/**
 *  Problem = 128
 *
 *  *** Widest Vertical Area Between Two Points Containing No Points
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (nlogn)
 *
 *      - Space complexity: (1)
 *
 * # Code =>
 */
fun main() {

    // [[8,7],[9,9],[7,4],[9,7]]

    val points = arrayOf(
        intArrayOf(8, 7),
        intArrayOf(9, 9),
        intArrayOf(7, 4),
        intArrayOf(9, 7)
    )

    val ans = maxWidthOfVerticalArea(points)

    println("Ans => $ans")

}

fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
    points.sortBy { it.first() }

    var ans = 0
    for (p in 1 until points.size) {
        val width = (points[p][0] - points[p - 1][0])
        ans = max(width, ans)
    }

    return ans
}