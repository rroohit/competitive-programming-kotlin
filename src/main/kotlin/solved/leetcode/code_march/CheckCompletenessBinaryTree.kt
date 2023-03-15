package solved.leetcode.code_march

import java.util.LinkedList

/**
 *  Problem = 61
 *
 *  *** Check Completeness of a Binary Tree
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

fun isCompleteTree(root: TreeNode?): Boolean {

    val queue = LinkedList<TreeNode>()

    queue.offer(root)

    var flag = false

    while (queue.isNotEmpty()) {
        val temp = queue.poll()

        if (temp == null) flag = true
        else {
            if (flag) return false
            queue.offer(temp.left)
            queue.offer(temp.right)
        }
    }

    return true
}