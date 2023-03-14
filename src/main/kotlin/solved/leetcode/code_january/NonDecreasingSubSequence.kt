package solved.leetcode.code_january

/**
 *  Problem = 37
 *
 *  *** Non Decreasing SubSequence (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */
fun main() {

    val nums = intArrayOf(4,6,7,7)

    println(findSubsequences(nums))

}

fun findSubsequences(nums: IntArray): List<List<Int>> {

    val ans = mutableSetOf<List<Int>>()

    val len = nums.size

    fun getList(index: Int, last: Int, current: MutableList<Int>) {
        if (index == len) {
            if (current.size >= 2) {
                ans.add(current.toList())

            }
            return
        }

        if (nums[index] >= last) {
            current.add(nums[index])
            getList(index + 1, nums[index], current)
            current.removeAt(current.lastIndex)
        }

        getList(index + 1, last, current)
    }

    getList(0, -10000, mutableListOf())

    return ans.toList()

}