package solved.leetcode.code_november

/**
 *  Problem = 100
 *
 *  *** Arithmetic Subarrays
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 * # Code =>
 */
fun main() {

    val nums = intArrayOf(4, 6, 5, 9, 3, 7)
    val l = intArrayOf(0, 0, 2)
    val r = intArrayOf(2, 3, 5)

    val ans = checkArithmeticSubarrays(nums, l, r)

    println("Ans ==> $ans")

}

fun checkArithmeticSubarrays(nums: IntArray, l: IntArray, r: IntArray): List<Boolean> {
    val ans = mutableListOf<Boolean>()

    for (i in l.indices) {
        val s = l[i]
        val k = r[i]
        val subArr = nums.copyOfRange(s, k + 1).sorted()
        ans.add(isArithmetic(subArr))
    }

    return ans
}

fun isArithmetic(nums: List<Int>): Boolean {
    val diff = nums[1] - nums[0]
    for (i in 2..nums.lastIndex) {
        if (nums[i] - nums[i - 1] != diff) return false
    }
    return true
}