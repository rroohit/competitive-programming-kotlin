package solved.leetcode.code_december

/**
 *  Problem = 121
 *
 *  *** Difference Between Ones and Zeros in Row and Column
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (m*n)
 *
 *      - Space complexity: (m*n)
 *
 * # Code =>
 */
fun main() {

    val grid = arrayOf(
        intArrayOf(0, 1, 1),
        intArrayOf(1, 0, 1),
        intArrayOf(0, 0, 1)
    )

    val ans = onesMinusZeros(grid)

    ans.forEach {
        println(it.toList())
    }

}

fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
    val row = grid.size
    val col = grid[0].size
    val oneInRow = IntArray(row)
    val oneInCol = IntArray(col)

    for (r in 0 until row) {
        for (c in 0 until col) {
            if (grid[r][c] == 1) {
                oneInRow[r] += 1
                oneInCol[c] += 1
            }
        }
    }
    val ans = Array(row) { IntArray(col) }

    for (r in 0 until row) {
        for (c in 0 until col) {
            ans[r][c] = (oneInRow[r] + oneInCol[c] - (row - oneInRow[r]) - (col - oneInCol[c]))
        }
    }

    return ans
}