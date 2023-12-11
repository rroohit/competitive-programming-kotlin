package solved.leetcode.code_december

import kotlin.math.ceil

/**
 *  Problem = 118
 *
 *  *** ElementAppearingMoreThan25%InSortedArray
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

    val arr = intArrayOf(1, 2, 2, 6, 6, 6, 6, 7, 10)

    val ans = findSpecialInteger(arr)

    println("Ans ==> $ans")

}

fun findSpecialInteger(arr: IntArray): Int {
    var ans = arr[0]
    val ceilPercentage = ceil(arr.size * 0.25).toInt()

    var count = 1

    for (i in 1 until arr.size) {
        if (arr[i] == arr[i - 1]) {
            count++
            if (count >= ceilPercentage) {
                ans = arr[i]
            }
        } else {
            count = 1
        }
    }

    return ans
}