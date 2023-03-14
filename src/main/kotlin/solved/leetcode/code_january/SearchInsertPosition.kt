package solved.leetcode.code_january

/**
 *  Problem = 12
 *
 *  *** Search Insert Position (leetcode)
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

    val array = intArrayOf(1, 3, 5, 6)
    println(searchInsert(array, 0))

}

fun searchInsert(nums: IntArray, target: Int): Int {
    var index = 1

    if (nums.isEmpty()) {
        return 0
    }

    for (i in nums.indices) {
        if (target <= nums[i]) {
            index = i
            break
        } else {
            if (i + 1 < nums.size) {
                if (target > nums[i] && target < nums[i + 1]) {
                    index = i + 1
                    break
                }
            } else {
                index = i + 1
                break
            }


        }

    }
    return index
}