package solved.leetcode.code_november

/**
 *  Problem = 95
 *
 *  *** Minimize Maximum Pair Sum in Array
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

    // val nums = intArrayOf(3, 5, 4, 2, 4, 6)
    val nums = intArrayOf(3, 5, 2, 2, 6, 2, 3, 3)

    val ans = minPairSum(nums)

    println("Result ==> $ans")

}


fun minPairSum(nums: IntArray): Int {
    if (nums.size <= 2) return (nums[0] + nums[1])
    var result = 0
    nums.sort()
    val n = nums.size
    for (l in 0 until n / 2) {
        val r = (n - 1) - l
        if ((nums[l] + nums[r]) > result) {
            result = (nums[l] + nums[r])
        }
        ///println("$l : $r")
        //if (r - 1 <= l) break
    }

    return result
}