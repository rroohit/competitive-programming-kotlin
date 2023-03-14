package solved.leetcode.code_january

import kotlin.math.max
import kotlin.math.min

/**
 *  Problem = 34
 *
 *  *** Max Sum Circular Array (leetcode)
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

    val nums = intArrayOf(5, -3, 5)

    println(maxSubarraySumCircular(nums))

}

fun maxSubarraySumCircular(nums: IntArray): Int {
    var globMax = nums[0]
    var globMin = nums[0]
    var curMax = 0
    var curMin = 0

    var total = 0

    for (i in nums.indices) {

        curMax = max(curMax + nums[i], nums[i])
        curMin = min(curMin + nums[i], nums[i])

        total += nums[i]

        globMax = max(globMax, curMax)
        globMin = min(globMin, curMin)


    }

    return if (globMax > 0) max(globMax, total - globMin) else globMax

}