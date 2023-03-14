package solved.leetcode.code_january

import data_structures.tree.TreeNode

/**
 *  Problem = 15
 *
 *  *** Binary Tree Preorder Traversal (leetcode)
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

    val list = listOf<Int>()

}
private val list = mutableListOf<Int>()

fun preorderTraversal(root: TreeNode?): List<Int> {
    getInt(root)
    return list
}

fun getInt(node: TreeNode?) {
    if(node == null) return

    list.add(node.`val`)

//    getInt(node.left)
//    getInt(node.right)

}