package solved.leetcode.code_january

/**
 *  Problem = 1
 *
 *  *** Reshape the Matrix (leetcode)
 *
 *  # Intuition
 *
 *
 *  # Approach :
 *      - Looping through matrix and tracking the column size
 *      whenever filled the required column size adding that array into ans list
 *      - Also tracking the index to update the array
 *
 *
 *
 *  # Complexity
 *      - Time complexity: O(r*c)
 *          r - matrix row size
 *          m - matrix column size
 *
 *      - Space complexity: O(1)
 *          Matrix size will remain constant
 *
 *
 * # Code =>
 */
fun main() {
    val matrix: Array<IntArray> = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))

    matrixReshape(matrix, 1, 4).forEach { it.forEach { print("$it ") } }
}

fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val matrixSize = mat.size * mat[0].size
    val ansMatrix = Array(r) { IntArray(c) }

    var rIndex = 0

    if ((r * c) == matrixSize) {
        var cSize = c
        val intArr = arrayListOf<Int>()
        for (j in mat.indices) {
            for (k in mat[j].indices) {
                cSize--
                intArr.add(mat[j][k])
                if (cSize == 0) {
                    ansMatrix[rIndex]  = intArr.toIntArray()
                    intArr.clear()
                    rIndex++
                    cSize = c
                }

            }

        }

        return ansMatrix


    } else {

        return mat
    }

}
