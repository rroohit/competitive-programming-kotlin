package solved.leetcode.code_december

/**
 *  Problem = 133
 *
 *  *** Decode Ways
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

    val s = "10"

    val ans = numDecodings(s)

    println("Ans ==> $ans")

}

fun numDecodings(s: String): Int {
    return solve(0, s)
}

val dp = HashMap<Int, Int>()

fun solve(i: Int, s: String): Int {
    if (i < s.length && s[i] == '0') return 0
    if (i >= s.length - 1) return 1

    if (dp.containsKey(i)) {
        return dp[i]!!
    }

    var ans = solve(i + 1, s)
    val substr = s.substring(i, i + 2).toInt()
    if (substr < 27) {
        ans += solve(i + 2, s)
    }
    dp[i] = ans

    return dp[i]!!
}