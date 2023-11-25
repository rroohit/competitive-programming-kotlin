package solved.leetcode.code_november

/**
 *  Problem = 102
 *
 *  *** Sum Of Absolute Differences Sorted Array
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

    val nums = intArrayOf(2, 3, 5)

    val result = getSumAbsoluteDifferences(nums)

    println("Ans ==> ${result.toList()}")

}

fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
    val len = nums.size
    val totalSum = nums.sum()
    var leftSum = 0

    val ans = IntArray(len)
    for (i in nums.indices) {
        val left = (nums[i] * i) - leftSum
        val right = (totalSum - leftSum - (nums[i] * (len - i)))
        leftSum += nums[i]

        ans[i] = (left + right)

    }

    return ans
}