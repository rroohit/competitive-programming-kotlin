package solved.leetcode.code_december

import java.util.*
import kotlin.math.max
import kotlin.math.min

/**
 *  Problem = 119
 *
 *  *** Maximum Product Of Two Elements Array
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

    val nums = intArrayOf(1, 5, 4, 5)

    val ans = maxProduct(nums)

    println("Ans ==> $ans")

}

fun maxProduct(nums: IntArray): Int {
    var min = 0
    var max = 0

    for (i in nums) {
        if (i > min) min = i
        if (min > max) {
            val tm = max
            max = min
            min = tm
        }
    }
    min--
    max--

    return (min * max)
}

fun maxProduct2(nums: IntArray): Int {
    val maxHeap = PriorityQueue<Int> { a, b -> b.compareTo(a) }
    for (i in nums) {
        maxHeap.offer(i)
    }
    val max = maxHeap.poll() - 1
    val min = maxHeap.poll() - 1

    return (min * max)
}

fun maxProduct3(nums: IntArray): Int {
    var a = min(nums[0], nums[1])
    var b = max(nums[0], nums[1])
    if (nums.size <= 2) return ((a - 1) * (b - 1))

    for (i in 2 until nums.size) {
        if (nums[i] > b) {
            a = b
            b = nums[i]
        } else if (nums[i] > a) {
            a = nums[i]
        }
    }

    return ((a - 1) * (b - 1))
}