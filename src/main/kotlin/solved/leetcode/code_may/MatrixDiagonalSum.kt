package solved.leetcode.code_may

/**
 *  # Problem = 75
 *
 *  # *** Matrix Diagonal Sum
 *
 *  ### Intuition :
 *
 *  ### Approach :
 *
 *  ### Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
    )

    println("Ans => ${diagonalSum(matrix)}")

}

fun diagonalSum(mat: Array<IntArray>): Int {
    var ans = 0

    var row1 = 0
    var col1 = 0
    var col2 = mat[0].size - 1

    while (row1 < mat.size) {
        ans += mat[row1][col1]
        ans += mat[row1][col2]

        row1++
        col1++
        col2--

    }

    val n = mat.size

    if (n % 2 != 0) {
        ans -= mat[n / 2][n / 2]
    }


    return ans

}