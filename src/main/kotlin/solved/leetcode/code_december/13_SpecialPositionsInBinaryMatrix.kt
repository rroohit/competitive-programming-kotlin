package solved.leetcode.code_december

/**
 *  Problem = 120
 *
 *  *** Special Positions In Binary Matrix
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

    val mat = arrayOf(
        intArrayOf(0, 0),
        intArrayOf(1, 0),
        intArrayOf(0, 0)
    )

    val ans = numSpecial(mat)

    println("Ans ==> $ans")

}

fun numSpecial(mat: Array<IntArray>): Int {
    var ans = 0
    val rowSum = mutableListOf<Int>()
    val colSum = mutableListOf<Int>()
    for (i in mat) {
        rowSum.add(i.sum())
    }

    // For Col Sum
    for (i in mat[0].indices) {
        var sum = 0
        for (j in mat.indices) {
            sum += mat[j][i]
        }
        colSum.add(sum)

    }

    for (row in mat.indices) {
        val rTotal = rowSum[row]
        if (rTotal > 1) continue
        for (col in mat[row].indices) {
            val cTotal = colSum[col]
            if (mat[row][col] == 1 && cTotal == 1) {
                ans++
            }
        }
    }

    return ans
}