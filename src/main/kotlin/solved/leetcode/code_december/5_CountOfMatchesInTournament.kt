package solved.leetcode.code_december

/**
 *  Problem = 112
 *
 *  *** Count Of Matches In Tournament
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity 1 : (1)
 *      - Time complexity 2 : (logn)
 *
 *      - Space complexity: (1)
 *
 * # Code =>
 */
fun main() {

    val n = 14

    val ans = numberOfMatches(n)

    println("Ans ==> $ans")

}

fun numberOfMatches(n: Int): Int {
    return n - 1
}

fun numberOfMatches2(n: Int): Int {
    var ans = 0
    var remainTeam = n

    while (remainTeam > 1) {
        remainTeam = if (remainTeam % 2 == 0) {
            (remainTeam / 2)
        } else {
            ans-- // to manage remainder
            (remainTeam + 1) / 2
        }
        ans += remainTeam
    }

    return ans
}