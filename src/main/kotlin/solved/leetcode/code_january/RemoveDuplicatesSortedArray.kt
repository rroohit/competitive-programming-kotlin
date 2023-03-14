package solved.leetcode.code_january


/**
 *  Problem = 31
 *
 *  *** Remove Duplicates From Sorted Array (leetcode)
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
 *
 * # Code =>
 */
fun main() {

    val intArray = intArrayOf(0,0,0,1,1,1,2,3,4,5,5,7,7)

    println(removeDuplicates(intArray))

    println(intArray.toList())

}

fun removeDuplicates(nums: IntArray): Int {
    var l = 1
    println(nums.toList())
    println()

    for (i in 1 until  nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[l] = nums[i]
            l++
        }
        println(nums.toList())

    }
    println()

    return l

}