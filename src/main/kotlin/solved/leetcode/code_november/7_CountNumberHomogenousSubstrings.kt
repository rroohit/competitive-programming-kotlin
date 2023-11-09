package solved.leetcode.code_november

/**
 *  Problem = 89
 *
 *  *** Count Number of Homogenous Substrings
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(1)
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val s = "abbcccaa"

    val ans = countHomogenous(s)
    println("Ans ==> $ans")

}

fun countHomogenous(s: String): Int {
    var ans = 0
    val MOD = 1000000007 // 10^9 + 7
    var i = 0

    while (i < s.length) {
        val currCh = s[i]
        var count = 0L

        while (i < s.length && currCh == s[i]) {
            count++
            i++
        }

        ans += (((count * (count + 1)) / 2) % MOD).toInt()
    }

    return (ans % MOD)
}
