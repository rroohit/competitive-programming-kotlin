package solved.leetcode.code_december

/**
 *  Problem = 115
 *
 *  *** Construct String From Binary Tree
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
    val node4 = TreeNode(4)

    node1.left = node2
    node1.right = node3
    node2.left = node4

    val ans = tree2str(node1)

    println("Ans ==> $ans")
    // 1(2(4)())(3()())

    // 1(2(4))(3))

}

private var builder = StringBuilder()

fun tree2str(root: TreeNode?): String {
    traverse(root)
    return builder.toString()
}

private fun traverse(node: TreeNode?) {
    if (node == null) return

    builder.append(node.`val`)

    if (node.left == null && node.right == null) return

    if (node.left != null) {
        builder.append("(")
        traverse(node.left)
        builder.append(")")
    } else {
        builder.append("()")
    }

    if (node.right != null) {
        builder.append("(")
        traverse(node.right)
        builder.append(")")
    }
}

// taking to much time
fun tree2str2(root: TreeNode?): String {
    var ans = ""

    // preorder traversal root-left-right
    fun travers(root: TreeNode?) {
        if (root == null) {
            return
        }
        ans += "${root.`val`}"

        if (root.left != null || root.right != null) {
            ans += "("
            travers(root.left)
            ans += ")"
        }
        if (root.right != null) {
            ans += "("
            travers(root.right)
            ans += ")"
        }

    }

    travers(root)

    return ans
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}