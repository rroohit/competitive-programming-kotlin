package solved.leetcode.code_december

/**
 *  Problem = 116
 *
 *  *** Binary Tree Inorder Traversal
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (n)
 *
 * # Code =>
 */
fun main() {
    val node1 = TreeNode(1)
    val node2 = TreeNode(2)
    val node3 = TreeNode(3)

    node1.right = node2
    node2.left = node3

    val ans = inorderTraversal(node1)

    println("Ans ==> $ans")
}

val list = mutableListOf<Int>()

fun inorderTraversal(root: TreeNode?): List<Int> {
    traverseOnTree(root)
    return list
}

// In order traversal
fun traverseOnTree(root: TreeNode?) {
    if (root == null) return
    traverseOnTree(root.left)
    list.add(root.`val`)
    traverseOnTree(root.right)
}