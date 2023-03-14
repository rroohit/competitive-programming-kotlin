package solved.leetcode.code_march

/**
 *  Problem = ?
 *
 *  *** Sum Root To Leaf Numbers
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


}

fun sumNumbers(root: TreeNode?): Int {

    fun dfs(cur: TreeNode?, sum: Int): Int {
        if (cur == null) return 0

        val num = sum * 10 + cur.`val`

        if (cur.left == null && cur.right == null) return num

        return dfs(cur.left, num) + dfs(cur.right, num)

    }

    return dfs(root, 0)

}