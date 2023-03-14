package solved.leetcode.code_january


/**
 *  Problem = 7
 *
 *  *** Valid Sudoku (leetcode)
 *
 *  # Intuition
 *
 *
 *  # Approach :
 *
 *
 *  # Complexity
 *      - Time complexity: O(n^2*m)
 *          n - number of row plus number box in sudoku
 *          m - number of column
 *
 *
 *      - Space complexity: O(?)
 *
 *
 *
 * # Code =>
 */
fun main() {
    val sudokuArray = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    println(isValidSudoku(sudokuArray))
}


fun isValidSudoku(board: Array<CharArray>): Boolean {
    var isValid = true

    var boxI = 0

    for (i in 0..8) {
        if (i > 0 && i % 3 == 0) {
            boxI += 3

        }
        var boxJ = 0

        for (j in 0..8) {
            val ch = board[i][j]

            if (j > 0 && j % 3 == 0) {
                boxJ += 3
            }

            if (ch.isDigit()) {

                val listOne = mutableListOf<Char>()
                for (jj in j + 1..8) {
                    if (board[i][jj].isDigit()) {
                        listOne.add(board[i][jj])
                    }
                }
                if (listOne.contains(ch)) {
                    isValid = false
                    break
                }


                val listTwo = mutableListOf<Char>()
                for (ii in i + 1..8) {
                    if (board[ii][j].isDigit()) {
                        listTwo.add(board[ii][j])
                    }
                }
                if (listTwo.contains(ch)) {
                    isValid = false
                    break
                }

                val listThree = mutableListOf<Char>()
                for (ii in boxI..boxI + 2) {
                    for (jj in boxJ..boxJ + 2) {
                        if (i == ii && j == jj) continue
                        if (board[ii][jj].isDigit()) {
                            listThree.add(board[ii][jj])
                        }
                    }

                }
                if (listThree.contains(ch)) {
                    isValid = false
                    break
                }

            }
        }
    }

    return isValid
}