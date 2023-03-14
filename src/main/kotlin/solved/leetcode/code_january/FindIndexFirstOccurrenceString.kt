package solved.leetcode.code_january

/**
 *  Problem = 33
 *
 *  *** Find the Index of the First Occurrence in a String (leetcode)
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

    val haystack = "rohitkaru"
    val needle = "karu"

    println(strStr(haystack, needle))

}

fun strStr(haystack: String, needle: String): Int {
    var ans = -1

    for (i in 0..haystack.length) {
        if (i + needle.length <= haystack.length) {
            val h = haystack.subSequence(i, i+ needle.length).toString()
            if (needle == h) {
                ans = i
                break
            }


        }

    }
    return ans

}