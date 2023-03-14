package solved.leetcode.code_march

/**
 *  Problem = 58
 *
 *  *** Symmetric Tree
 *
 *  # Intuition
 *          Running DFS on given tree and checking values to left == right and right == left in visited nodes
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(?)
 *
 *
 *      - Space complexity: O(?)
 *
 *
 * # Code =>
 */

fun main() {

    val nums = intArrayOf(1, 2, 2, 3, 4, 4, 3)
    val root = buildTree(nums)

    println("ans => ${isSymmetric(root)}")

}


fun isSymmetric(root: TreeNode?): Boolean {

    fun dfs(left:TreeNode? , right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }

        if (left == null || right == null) {
            return false
        }

        return (left.`val` == right.`val` && dfs(left.left, right.right) && dfs(left.right, right.left))
    }

    return dfs(root?.left, root?.right)

}

fun buildTree(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) {
        return null
    }
    val root = TreeNode(nums[0])
    for (i in 1 until nums.size) {
        addNode(root, nums[i])
    }
    return root
}

fun addNode(root: TreeNode?, value: Int) {
    if (root == null) {
        return
    }
    if (root.left == null) {
        root.left = TreeNode(value)
    } else if (root.right == null) {
        root.right = TreeNode(value)
    } else {
        addNode(root.left, value)
    }
}

