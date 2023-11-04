package solved.leetcode.code_november

import data_structures.tree.TreeNode

/**
 *  Problem = 84
 *
 *  *** Find Mode In Binary Search Tree
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

    val n1 = TreeNode(1)
    val n2 = TreeNode(2)
    val n3 = TreeNode(1)

    n1.left = null
    n1.right = n2

    n2.left = n3
    n2.right = null

    val ans = findMode(n1)
    println("Ans ==> ${ans.toList()}")

}

fun findMode(root: TreeNode?): IntArray {
    if (root == null) return intArrayOf()
    if (root.left == null && root.right == null) return intArrayOf(root.`val`)

    val mapCount = mutableMapOf<Int, Int>()

    var max = 1

    fun inOrderTravers(node: TreeNode?) {
        if (node == null) return

        // go to left
        inOrderTravers(node.left)

        // visit current node
        val key = node.`val`
        val c = mapCount.getOrDefault(key, 0)
        mapCount[key] = c + 1

        // go to right
        inOrderTravers(node.right)

    }

    inOrderTravers(root)
    val ans = mutableListOf<Int>()

    mapCount.forEach { (t, u) ->
        if (u >= max) {
            max = u
        }
    }

    mapCount.forEach { (t, u) ->
        if (u == max) {
            ans.add(t)
        }
    }

    return ans.toIntArray()
}