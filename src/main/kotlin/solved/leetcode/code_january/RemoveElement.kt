package solved.leetcode.code_january

/**
 *  Problem = 32
 *
 *  *** Remove Element (leetcode)
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
    val intArray = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)

//    val intArray = intArrayOf(3, 2, 2, 3)

    val `val` = 2

    println(removeElement(intArray, `val`))

    println(intArray.toList())


}
fun removeElement(nums: IntArray, `val`: Int): Int {
    var pointer = 0

    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[pointer] = nums[i]
            pointer++
        }

    }

    return pointer

}


