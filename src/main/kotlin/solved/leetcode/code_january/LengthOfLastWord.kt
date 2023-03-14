package solved.leetcode.code_january


/**
 *  Problem = 35
 *
 *  *** Length Of Last Word (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

//    val s = "   fly me   to   the moon  "
    val s = "a "

    println(lengthOfLastWord(s))

}

fun lengthOfLastWord(s: String): Int {
    var i = s.length - 1

    var ans = 0

    var startCount = false

    while (i >= 0) {
        if (s[i] != ' ' && !startCount) {
            startCount = true
        }

        if (startCount) {
            if (s[i] != ' ') {
                ans++
            } else {
                break
            }
        }

        i--
    }

    return ans

}