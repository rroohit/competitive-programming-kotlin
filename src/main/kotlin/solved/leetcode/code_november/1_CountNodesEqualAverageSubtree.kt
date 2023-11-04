package solved.leetcode.code_november

import data_structures.tree.TreeNode

/**
 *  Problem = 83
 *
 *  *** Count Nodes Equal Average Subtree
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity:
 *
 *
 *      - Space complexity:
 *
 * # Code =>
 */

fun main() {

    // Ans ==> 5

    val node1 = TreeNode(4)
    val node2 = TreeNode(8)
    val node3 = TreeNode(5)
    val node4 = TreeNode(0)
    val node5 = TreeNode(1)
    val node6 = TreeNode(6)


    node1.left = node2
    node1.right = node3

    node2.left = node4
    node2.right = node5

    node3.left = null
    node3.right = node6

    val ans = averageOfSubtree(node1)
    println("Ans ==> $ans")
}

fun averageOfSubtree(root: TreeNode?): Int {
    var ans = 0

    fun postOrder(node: TreeNode?): List<Int> {
        if (node == null) return listOf(0, 0)

        val left = postOrder(node.left)
        val right = postOrder(node.right)

        val total = left[0] + right[0] + node.`val`
        val count = left[1] + right[1] + 1
        val avg = total / count
        if (avg == node.`val`) {
            ans += 1
        }
        return listOf(total, count)
    }

    postOrder(root)

    return ans

}


