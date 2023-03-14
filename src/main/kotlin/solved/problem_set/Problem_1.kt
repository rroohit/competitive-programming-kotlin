package solved.problem_set

/**
 * Problem = 1
 *
 * Solved =>  Immobile Knight
 *
 * (link - https://codeforces.com/problemset/problem/1739/A)
 *
 */

fun main() {

    val testCases = readln().trim().toLong()

    for (i in 1..testCases) {
        val (row, col) = readln().trim().split("\\s+".toRegex()).map(String::toLong)

        getCell(row, col)
    }


}

fun getCell(row: Long, col: Long) {

    if (row == 3L && col == 3L || row == 3L && col == 2L || row == 2L && col == 3L) {
        println("2 2")
    } else {
        val a = (1..row).random()
        val b = (1..col).random()
        println("$a $b")
    }

}

/** Input => 1
 *           1 7
 *           8 8
 *           3 3
 *
 *  Solution - Considering input row and column range 1 <= row, col <= 8
 *
 *           - If any of row or col is 1 then knight won't able to move.
 *
 *           -  In this range there are only three conditions where knight can't move.
 *             if the input bound is one of the following (2,2) || (2,3) || (3,3)
 *
 *
 */