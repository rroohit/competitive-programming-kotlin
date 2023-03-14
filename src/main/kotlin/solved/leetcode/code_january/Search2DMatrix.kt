package solved.leetcode.code_january

/**
 *  Problem = 5
 *
 *  *** Search in 2D Matrix (leetcode)
 *
 *  # Intuition
 *
 *
 *  # Approach :
 *      - Matrix is in sorted order
 *          i.e. Only Looping through matrix which has int bound else brake and go to next iteration
 *
 *
 *
 *  # Complexity
 *      - Time complexity: O(n*m)
 *          n - matrix row size
 *          m - matrix column size
 *
 *      - Space complexity: O(1)
 *          Matrix size will remain constant
 *
 *
 * # Code =>
 */
fun main() {

    val matrix: Array<IntArray> = arrayOf(
        intArrayOf(1, 3, 5, 7),
        intArrayOf(10, 11, 16, 20),
        intArrayOf(20, 30, 34, 60)
    )

    println(searchMatrix(matrix, 34))

}

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var isInMatrix = false

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {

            if (target >= matrix[i][j] && target <= matrix[i][matrix[i].lastIndex]) {

                if (target == matrix[i][j]) {
                    isInMatrix = true
                    break
                }

            } else {

                break
            }

        }

    }

    return isInMatrix


}