package solved.leetcode.code_november

import kotlin.math.max

/**
 *  Problem = 96
 *
 *  *** Frequency Of The Mos Frequent Element
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(nlogn)
 *
 *      - Space complexity: O(n)
 *
 * # Code =>
 */
fun main() {

    val nums = intArrayOf(1, 4, 8, 13)
    //val nums = intArrayOf(1, 2, 4)

    val result = maxFrequency(nums, 5)

    println("Ans ==> $result")

}

fun maxFrequency(nums: IntArray, k: Int): Int {
    nums.sortDescending()

    val len = nums.size - 1
    var prv = -1
    var opreations = 0

    for (l in nums.indices) {
        if (prv == nums[l]) continue
        prv = nums[l]

        var kk = k
        var r = l + 1

        while (r <= len) {
            val reqK = prv - nums[r]
            kk -= reqK
            if (kk < 0) break
            r++
        }
        opreations = max(opreations, (r - l))

    }
    return opreations
}