package solved.leetcode.code_april

/**
 *  Problem = 69
 *
 *  ***  Binary Search
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(log n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
    val target = 9

    println("ans => ${search(nums, target)}")


}

fun search(nums: IntArray, target: Int): Int {

    val ans = -1

    var l = 0
    var h = nums.size

    while (l <= h) {
        val m = (l + h) / 2

        if (nums[m] == target) return m

        if (target > nums[m]) {
            l = m + 1
        } else {
            h = m - 1
        }

    }


    return ans

}