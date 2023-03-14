package solved.leetcode.code_march

/**
 *  Problem = 52
 *
 *  *** Convert Sorted Array To Binary Search Tree
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

    val nums = intArrayOf(-10, -3, 1, 5, 9)

    println("ans => ${sortedArrayToBST(nums)!!.`val`}")

}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    fun binarySearch(l: Int, r: Int): TreeNode? {
        if (l > r) {
            return null
        }
        val m = (l + r) / 2
        val root = TreeNode(nums[m])
        root.left = binarySearch(l, m - 1)
        root.right = binarySearch(m + 1, r)
        return  root
    }

    return binarySearch(0, nums.size - 1)

}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}