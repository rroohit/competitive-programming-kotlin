package solved.leetcode.code_january


/**
 *  Problem = 37
 *
 *  *** Word Pattern (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n*m)
 *
 *
 *      - Space complexity: O(n*m)
 *
 *
 * # Code =>
 */
fun main() {


    val pattern = "abba"
    val s = "dog cat cat dog"

    println(wordPattern(pattern, s))

}

fun wordPattern(pattern: String, s: String): Boolean {
    val ss = s.split(" ")
    val pp = pattern.split("").filter { it.isNotEmpty() }

    if (ss.size != pp.size) return false

    val charToWord = hashMapOf<String, String>()

    val zip = pp.zip(ss)

    zip.forEach {

        if (charToWord.containsKey(it.first) && charToWord[it.first] != it.second) {
            return false
        }

        charToWord[it.first] = it.second


    }


    return true

}