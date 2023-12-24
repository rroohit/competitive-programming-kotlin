package solved.leetcode.code_december

import kotlin.math.min

/**
 *  Problem = 132
 *
 *  *** Minimum Changes To Make Alternating Binary String
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (1)
 *
 * # Code =>
 */
fun main() {

    val s = "10010100"
    //val s = "10"
    //val s = "0100"

    val ans = minOperations(s)

    println("Ans ==> $ans")

}

fun minOperations(s: String): Int {
    val op1 = if (s.first() == '0') 1 else 0
    val a = operations(s, '1', 1, op1)

    val op2 = if (s.first() == '1') 1 else 0
    val b = operations(s, '0', 1, op2)

    return min(a, b)
}

// s - string,
// last - previous char
// currP - current char position need to compare with last,
// op - operations count
fun operations(s: String, last: Char, currP: Int, op: Int): Int {
    if (currP == s.length) return op
    return if (last == s[currP]) { // if last and curr char are same need to do operation
        val newLast = getNewCh(s[currP])
        operations(s, newLast, currP + 1, op + 1)
    } else {
        operations(s, s[currP], currP + 1, op)
    }
}

fun getNewCh(char: Char): Char {
    return if (char == '0') '1'
    else '0'
}