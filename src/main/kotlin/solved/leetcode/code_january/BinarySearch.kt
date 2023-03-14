package solved.leetcode.code_january


/**
 *  Problem = 10
 *
 *  *** Binary Search (leetcode)
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

    val nums = intArrayOf(-1,0,3,5,9,12)
    println(search(nums, 9))

}

fun search(nums: IntArray, target: Int): Int {
    var ans = -1

    for (i in nums.indices) {
        if (target == nums[i]) {
            ans = i
            break
        }

    }

    return ans

}