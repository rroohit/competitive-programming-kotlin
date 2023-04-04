package solved.leetcode.code_april

/**
 *  Problem = 73
 *
 *  *** Intersection Of Two Arrays II
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *
 *      - Time complexity: O(n + m)
 *
 *      - Space complexity: O(min(n , m)
 *
 *      n - array one
 *      m - array two
 *
 *
 * # Code =>
 */
fun main() {

    val nums1 = intArrayOf(4, 9, 5, 9, 4)
    val nums2 = intArrayOf(9, 4, 9, 8, 4)

    println("ans => ${intersect(nums1, nums2).toList()}")

}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    if (nums1.size > nums2.size) {
        return intersect(nums2, nums1)
    }
    val ans = arrayListOf<Int>()

    val intCount = mutableMapOf<Int, Int>()
    nums1.forEach { intValue ->
        intCount[intValue] = intCount.getOrDefault(intValue, 0) + 1
    }

    nums2.forEach {

        val checkPresence = intCount.getOrDefault(it, 0)
        if (checkPresence > 0) {
            intCount[it] = checkPresence - 1
            ans.add(it)
        }

    }

    return ans.toIntArray()

}