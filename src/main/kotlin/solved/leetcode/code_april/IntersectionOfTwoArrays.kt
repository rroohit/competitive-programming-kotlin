package solved.leetcode.code_april

/**
 *  Problem = 72
 *
 *  *** Intersection Of Two Arrays
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

    val nums1 = intArrayOf(4, 9, 5)
    val nums2 = intArrayOf(9, 4, 9, 8, 4)

    println("ans => ${intersection(nums1, nums2).toList()}")

}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val ans = arrayListOf<Int>()

    nums1.sort()
    nums2.sort()

    if (nums1.size > nums2.size) {

        nums2.forEach {
            if (nums1.contains(it) && !ans.contains(it)) {
                ans.add(it)
            }
        }

    } else {
        nums1.forEach {
            if (nums2.contains(it) && !ans.contains(it)) {
                ans.add(it)
            }
        }
    }


    return ans.toIntArray()

}