package unsolved

fun main() {

    val board = arrayOf(
        intArrayOf(-1, -1, -1, -1, -1, -1),
        intArrayOf(-1, -1, -1, -1, -1, -1),
        intArrayOf(-1, -1, -1, -1, -1, -1),
        intArrayOf(-1, 35, -1, -1, 13, -1),
        intArrayOf(-1, -1, -1, -1, -1, -1),
        intArrayOf(-1, 15, -1, -1, -1, -1),
    )

    snakesAndLadders(board)

}

fun snakesAndLadders(board: Array<IntArray>): Int {
    val size = board.size - 1
    val n = (size + 1) * (size + 1)

    var r = size
    var c = 0

    val isNotReached = true

    var cell = 0

    while (isNotReached) {
        if (r <= 0 && c == 0) {
            break
        }
        cell++
        if (r % 2 == 0) {
            print("[ ${board[r][c]} ] ")

            c--
            if (c < 0) {
                c = 0
                r--
                println()
            }
        } else {
            print("[ ${board[r][c]} ] ")

            c++
            if (c > size) {
                c = size
                r--
                println()

            }
        }
    }

    return 0

}