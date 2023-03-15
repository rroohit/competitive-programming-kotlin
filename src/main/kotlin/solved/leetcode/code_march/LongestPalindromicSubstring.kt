package solved.leetcode.code_march

/**
 *  Problem = 62
 *
 *  *** Longest Palindromic Substring
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n*n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val s = "abcbaka"

    println("ans => ${longestPalindrome(s)}")

}

fun longestPalindrome(s: String): String {
    var res = ""
    var maxLen = 0

    for (i in s.indices) {


        var l = i
        var r = i
        while (l >= 0 && r < s.length && s[l] == s[r]){
            if (r - l + 1 > maxLen) {
                res = s.substring(l, r + 1)
                maxLen = r - l + 1
            }
            l -= 1
            r += 1
        }

        l = i
        r = i + 1
        while (l >= 0 && r < s.length && s[l] == s[r]){
            if (r - l + 1 > maxLen) {
                res = s.substring(l, r + 1)
                maxLen = r - l + 1
            }
            l -= 1
            r += 1
        }


    }

    return res
}