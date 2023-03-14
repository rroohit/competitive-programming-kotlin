package solved.leetcode.code_march

/**
 *  Problem = 53
 *
 *  *** Convert Sorted List To Binary Search Tree
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */

fun main() {

    //-10,-3,0,5,9

    val head = ListNode(-10)
    val node2 = ListNode(-3)
    val node3 = ListNode(0)
    val node4 = ListNode(5)
    val node5 = ListNode(9)

    head.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = null

    println("ans => ${sortedListToBST(head)!!.`val`}")

}

fun sortedListToBST(head: ListNode?): TreeNode? {
    var h = head ?: return null

    val nums = mutableListOf<Int>()
    while (h.next != null) {
        nums.add(h.`val`)

        h = h.next!!
    }
    nums.add(h.`val`)



    fun binarySearch(l: Int, r: Int): TreeNode? {
        if (l > r) {
            return null
        }
        val m = (l + r) / 2
        val root = TreeNode(nums[m])
        root.left = binarySearch(l, m - 1)
        root.right = binarySearch(m + 1, r)
        return root
    }

    return binarySearch(0, nums.size - 1)

}