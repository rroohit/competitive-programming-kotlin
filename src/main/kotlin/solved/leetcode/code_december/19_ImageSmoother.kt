package solved.leetcode.code_december

/**
 *  Problem = 126
 *
 *  *** Image Smoother
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

    //[[1,1,1],[1,0,1],[1,1,1]]
    val img = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 0, 1),
        intArrayOf(1, 1, 1)
    )

    imageSmoother(img).forEach {
        println(it.toList())
    }

}

fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
    val row = img.size
    val col = img[0].size

    val mat = Array(row) { IntArray(col) }

    for (i in 0 until row) { // row
        for (j in 0 until col) { // col
            // for row start - end
            var rS = i - 1 // row start
            if (rS < 0) rS = 0
            var rE = i + 1 // row end
            if (rE >= row) rE = row - 1

            // for col start - end
            var cS = j - 1 // col start
            if (cS < 0) cS = 0
            var cE = j + 1 // col end
            if (cE >= col) cE = col - 1

            var countNum = 0
            var sum = 0
            for (r in rS..rE) { // row
                for (c in cS..cE) { // col
                    sum += img[r][c]
                    countNum++
                }
            }

            val avg = (sum / countNum)

            mat[i][j] = avg

        }

    }

    return mat
}