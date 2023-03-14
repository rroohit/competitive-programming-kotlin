package solved.leetcode.code_march

/**
 *  Problem = 47
 *
 *  *** Most Frequent Number Following Key In Array
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

    val nums = intArrayOf(1, 1000, 2)
    val key = 1000

    println("ans => ${mostFrequent(nums, key)}")

}

fun mostFrequent(nums: IntArray, key: Int): Int {
    val mapKeyCount = hashMapOf<Int, Int>()

    for (i in 0 until nums.size - 1) {
        if (nums[i] == key) {
            mapKeyCount[nums[i + 1]] = mapKeyCount.getOrDefault(nums[i + 1], 0) + 1

        }

    }

    println(mapKeyCount)
    var max = 0
    var ans = 0

    mapKeyCount.forEach { (key, count) ->
        if (count > max) {
            max = count
            ans = key
        }
    }

    return ans

}