package solved.leetcode.code_may

/**
 *  Problem = 76
 *
 *  *** Spiral Matrix
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *          n - total size of matrix
 *
 *
 *      - Space complexity: O(m)
 *
 *
 * # Code =>
 */

fun main() {

    //[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]

    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(6, 7, 8, 9, 10),
        intArrayOf(11, 12, 13, 14, 15),
        intArrayOf(16, 17, 18, 19, 20),
        intArrayOf(21, 22, 23, 24, 25),
    )
    println("Ans => ${spiralOrder(matrix)}")

}


fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val matNumCount = matrix.size * matrix[0].size

    val rL = matrix.size - 1
    val cL = matrix[0].size - 1

    var moveRow = true
    var moveHor = true
    var moveDow = false

    var pR = 0
    var pC = 0


    val ans = mutableListOf<Int>()

    while (ans.size < matNumCount) {
        ans.add(matrix[pR][pC])
        matrix[pR][pC] = 0

        if (moveRow) {
            if (moveHor) {
                pC++
                if (pC > cL || matrix[pR][pC] == 0) {
                    moveRow = false
                    moveHor = false
                    moveDow = true
                    pC--
                    pR++
                }
            } else {
                pC--
                if (pC < 0 || matrix[pR][pC] == 0) {
                    moveRow = false
                    moveDow = false
                    moveHor = true
                    pC++
                    pR--


                }

            }

        } else {
            if (moveDow) {
                pR++
                if (pR > rL || matrix[pR][pC] == 0) {
                    moveRow = true
                    moveHor = false
                    moveDow = false
                    pR--
                    pC--


                }
            } else {
                pR--
                if (matrix[pR][pC] == 0) {
                    pR++
                    pC++
                    moveRow = true
                    moveHor = true
                    moveDow = true
                }
            }
        }

    }


    return ans
}

fun spiralOrder2(matrix: Array<IntArray>): List<Int> {
    val matNumCount = matrix.size * matrix[0].size

    val rL = matrix.size - 1
    val cL = matrix[0].size - 1

    var moveRow = true
    var moveHor = true
    var moveCol = false
    var moveDow = false

    var pR = 0
    var pC = 0

    val visitedRow = mutableListOf<Int>()
    val visitedCol = mutableListOf<Int>()

    val ans = mutableListOf<Int>()

    while (ans.size < matNumCount) {
        ans.add(matrix[pR][pC])

        if (moveRow) {
            visitedRow.add(pR)
            if (moveHor) {
                pC++
                if (pC > cL || visitedCol.contains(pC)) {
                    moveRow = false
                    moveHor = false
                    moveCol = true
                    moveDow = true
                    pC--
                    pR++
                }
            } else {
                pC--
                if (pC < 0 || visitedCol.contains(pC)) {
                    moveRow = false
                    moveCol = true
                    moveDow = false
                    moveHor = true
                    pC++
                    pR--


                }

            }

        } else {
            visitedCol.add(pC)
            if (moveDow) {
                pR++
                if (pR > rL || visitedRow.contains(pR)) {
                    moveRow = true
                    moveCol = false
                    moveHor = false
                    moveDow = false
                    pR--
                    pC--


                }
            } else {
                pR--
                if (visitedRow.contains(pR)) {
                    pR++
                    pC++
                    moveCol = false
                    moveRow = true
                    moveHor = true
                    moveDow = true
                }
            }
        }

    }

    return ans
}