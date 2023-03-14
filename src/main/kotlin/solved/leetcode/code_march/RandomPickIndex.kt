package solved.leetcode.code_march

/**
 *  Problem = 51
 *
 *  *** Random Pick Index
 *
 *  # Intuition :
 *
 *
 *  # Approach :
 *          First will create key value pair for given array nums
 *              where key will nums[i] and value be list of key presented index in array i.e i
 *
 *          After finishing the mapping will directly get list of index target present at and will return value randomly from the list
 *  *
 *
 *  # Complexity
 *          1 -
 *          - Time complexity : O(n)
 *          - Space complexity : O(n)
 *
 *
 *
 * # Code =>
 */


fun main() {

    val nums = intArrayOf(1, 2, 3, 3, 3)

    val randomPickIndex = RandomPickIndex(nums)

    println("ans => ${randomPickIndex.pick(3)}")
    println("ans => ${randomPickIndex.pick(3)}")
    println("ans => ${randomPickIndex.pick(3)}")

}

class RandomPickIndex(val nums: IntArray) {

    val list = mutableListOf<Int>()
    val map = hashMapOf<Int, MutableList<Int>>()

    fun pick(target: Int): Int {
        if (map.isEmpty()) {
            for (i in nums.indices) {
                map.computeIfAbsent(nums[i]) { mutableListOf() }.add(i)
            }
        }

        // It must exist target in list, so we assert the - !!
        return map[target]!!.random()
    }
}