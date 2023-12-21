package solved.leetcode.code_december

/**
 *  Problem = 129
 *
 *  *** Check if a String Is an Acronym of Words
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

    val words = listOf("alice", "bob", "charlie")
    val s = "afc"

    val ans = isAcronym(words, s)

    println("Ans ==> $ans")

}

fun isAcronym(words: List<String>, s: String): Boolean {
    if (s.length != words.size) return false

    for (i in words.indices) {
        val ch = words[i][0]
        if (s[i] != ch) return false
    }

    return true
}

fun isAcronym2(words: List<String>, s: String): Boolean {
    if (s.length != words.size) return false

    var a = ""
    for (i in words.indices) {
        a += words[i][0]
    }

    return (s == a)
}