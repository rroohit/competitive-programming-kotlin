package solved.leetcode.code_december

import kotlin.math.max

/**
 *  Problem = 130
 *
 *  *** Maximum Score After Splitting String
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

    val s = "0111"

    val score = maxScore(s)

    println("Ans ==> $score")

}

fun maxScore(s: String): Int {
    var one = 0
    var zero = 0
    var ans = Int.MIN_VALUE

    for (j in 0..s.length - 2) {
        val i = s[j]
        if (i == '1') one++ else zero++
        ans = max(ans, (zero - one))
    }

    if (s.last() == '1') one++

    return (ans + one)
}


fun maxScore2(s: String): Int {
    val len = s.length - 1
    val prefZero = IntArray(s.length)
    val sufOne = IntArray(s.length)
    var l = 0
    var r = 0

    for (i in 0..len) {
        val left = s[i]
        val right = s[len - i]
        if (left == '0') l++
        prefZero[i] = l
        if (right == '1') r++
        sufOne[len - i] = r
    }

    var ans = 0
    for (i in s.indices) {
        val pref = prefZero[i]
        val suf = if (i + 1 == s.length) break else sufOne[i + 1]
        ans = max(ans, pref + suf)
    }

    return ans
}