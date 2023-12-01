package solved.leetcode.code_december

/**
 *  Problem = 108
 *
 *  *** heck If Two String Arrays are Equivalent
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
    val word1 = arrayOf("ab", "c")
    val word2 = arrayOf("a", "bcv")

    val ans = arrayStringsAreEqual(word1, word2)

    println("Ans ==> $ans")

}

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    val w1 = word1.joinToString("")
    val w2 = word2.joinToString("")
    return w1 == w2
}