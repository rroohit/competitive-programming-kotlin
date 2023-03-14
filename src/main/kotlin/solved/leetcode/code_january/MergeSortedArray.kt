package solved.leetcode.code_january

fun main() {

    val mArray = intArrayOf(-1, 0, 0, 3, 3, 3, 0, 0, 0)
    val nArray = intArrayOf(1, 2, 2)
    val m = 3
    val n = 3

    mergeSortedArray(mArray, nArray, m, n)

}

fun mergeSortedArray(nums1: IntArray, nums2: IntArray, m: Int, n: Int) {

    var j = 0

    nums1.forEachIndexed { index, i ->
        if (index < nums2.size) {
            if (i == 0) {
                nums1[index] = nums2[j]
                j++
            }
        }
    }

    nums1.sort()
    nums1.forEach { print(it) }


}
