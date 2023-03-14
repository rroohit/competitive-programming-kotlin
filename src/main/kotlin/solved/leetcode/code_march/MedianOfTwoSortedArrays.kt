package solved.leetcode.code_march

import kotlin.math.max

/**
 *  Problem = 57
 *
 *  *** Median Of Two Sorted Arrays
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n^2)
 *
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */

fun main() {

    // nums1 = [1,3], nums2 = [2]

//    val nums1 = intArrayOf(0, 0, 0, 0, 0)
//    val nums2 = intArrayOf(-1, 0, 0, 0, 0, 0, 1)

    val nums1 = intArrayOf(3)
    val nums2 = intArrayOf(-2, -1)

    println("ans => ${findMedianSortedArrays(nums1, nums2)}")

}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val list = mutableListOf<Int>()
    val n = max(nums1.size, nums2.size)

    for (i in 0 until n) {
        if (i < nums1.size) {
            list.add(nums1[i])
        }
        if (i < nums2.size) {
            list.add(nums2[i])
        }
    }
    list.sort()

    val m = list.size

    return if (m % 2 != 0) {
        list.elementAt(m / 2).toDouble()
    } else {
        val a = list.elementAt(m / 2)
        val b = list.elementAt((m / 2) - 1)

        val ans = a.toFloat() + b.toFloat()
        println(ans)
        (ans / 2).toDouble()
    }

}