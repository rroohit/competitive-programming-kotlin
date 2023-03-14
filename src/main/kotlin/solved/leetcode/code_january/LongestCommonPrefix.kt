package solved.leetcode.code_january


/**
 *  Problem = 28
 *
 *  *** Longest Common Prefix (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */
fun main() {

    val listString = arrayOf("cir","car")


    longestCommonPrefix(listString)

}

fun longestCommonPrefix(strs: Array<String>): String {
    var ans = ""

    for (i in strs[0].indices) {
        val ch = strs[0][i]

        var ans2 = ""

        for (j in strs.indices) {
            if (i < strs[j].length) {
                val ch2 = strs[j][i]
                if (ch2 == ch) {
                    if (j == strs.size - 1) {
                        ans2 += ch
                    }

                } else {
                    break
                }

            } else {
                break
            }

        }

        if (ans2.isEmpty()) {
            break
        } else {
            ans += ans2
        }

    }

    println(ans)

    return ans

}