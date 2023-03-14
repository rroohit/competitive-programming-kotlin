package solved.leetcode.code_march

import kotlin.math.max
import kotlin.math.min

/**
 *  Problem = 42
 *
 *  *** Count Subarrays With Fixed Bounds
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    //nums = [1,3,5,2,7,5], minK = 1, maxK = 5
    val nums = intArrayOf(1, 3, 5, 2, 7, 5)
    val minK = 1
    val maxK = 5

    println("ans => ${countSubarrays(nums, minK, maxK)}")

}

fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long {
    var res = 0L

    var minP = -1
    var maxP = -1
    var outBound = -1

    for (i in nums.indices) {
        if (nums[i] == minK) {
            minP = i
        }

        if (nums[i] == maxK) {
            maxP = i
        }

        if (nums[i] !in minK..maxK) {
            outBound = i
        }

        val count = min(maxP, minP) - outBound

        res += max(0, count)

    }


    return res

}