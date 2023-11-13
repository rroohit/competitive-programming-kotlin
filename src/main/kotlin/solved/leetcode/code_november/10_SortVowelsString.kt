package solved.leetcode.code_november

/**
 *  Problem = 92
 *
 *  *** Sort Vowels In AString
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

    val s = "EEeE"

    val ans = sortVowels(s)

    println("Ans ==> $ans")

}

fun sortVowels(s: String): String {
    if (s.isEmpty()) return ""

    val vowels = listOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
    val pVowels = mutableListOf<Char>()

    s.forEach {
        if (vowels.contains(it)) {
            pVowels.add(it)
        }
    }

    if (pVowels.isEmpty()) return s
    if (pVowels.size == s.length) {
        pVowels.sort()
        return pVowels.joinToString("")
    }

    pVowels.sort()

    var ans = ""

    s.forEach {
        ans += if (vowels.contains(it)) {
            val firstV = pVowels.removeFirstOrNull()
            firstV
        } else {
            it
        }
    }

    return ans
}