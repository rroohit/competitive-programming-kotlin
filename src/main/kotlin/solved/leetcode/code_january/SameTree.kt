package solved.leetcode.code_january

import data_structures.tree.TreeNode

/**
 *  Problem = 18
 *
 *  *** Same Tree (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(p+q)
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

//    Input: p = [1,2,3], q = [1,2,3]
//    Output: true

}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    if (p == null || q == null || p.`val` != q.`val`) return false

    return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
}

