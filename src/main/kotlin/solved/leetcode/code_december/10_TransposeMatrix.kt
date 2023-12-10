package solved.leetcode.code_december

/**
 *  Problem = 117
 *
 *  *** Transpose Matrix
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


    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    val ans = transpose(matrix)

    ans.forEach {
        print(it.toList())
    }
    //[[1,4,7],[2,5,8],[3,6,9]]
}

fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val transpose = Array(matrix[0].size) { IntArray(matrix.size) }

    for (i in matrix.indices) {
        val list = matrix[i]
        for (j in list.indices) {
            val value = matrix[i][j]
            transpose[j][i] = value
        }
    }

    return transpose
}