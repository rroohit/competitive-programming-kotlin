package solved.leetcode.code_november

/**
 *  Problem = 96
 *
 *  *** Reduction Operations to Make the Array Elements Equal
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

    val nums = intArrayOf(1, 1, 2, 2, 3) // 4
    //val nums = intArrayOf(5, 1, 3)
    //val nums = intArrayOf(7, 9, 10, 8, 6, 4, 1, 5, 2, 3)

    val result = reductionOperations(nums)

    println("Result ==> $result")

}

fun reductionOperations(nums: IntArray): Int {
    nums.sort()

    var r = nums.lastIndex
    var ans = 0
    var count = 1

    while (r > 0) {
        if (nums[r] != nums[r - 1]) {
            ans += count
        }
        r--
        count++
    }

    return ans
}















