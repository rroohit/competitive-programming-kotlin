package solved.leetcode.code_april

/**
 *  Problem = 70
 *
 *  *** Form Smallest Number From Two Digit Array
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


    val nums1 = intArrayOf(7, 5, 6)
    val nums2 = intArrayOf(1, 4)

    println("ans => ${minNumber(nums1, nums2)}")

}

fun minNumber(nums1: IntArray, nums2: IntArray): Int {
    nums1.sort()

    nums1.forEach {
        if (nums2.contains(it)) {
            return it
        }
    }

    var ans = 0
    val min1 = nums1.minOf { it }
    val min2 = nums2.minOf { it }

    ans += if (min1 < min2) {
        (min1 * 10) + min2
    } else {
        (min2 * 10) + min1
    }

    return ans
}