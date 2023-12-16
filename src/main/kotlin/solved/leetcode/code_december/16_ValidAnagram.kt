package solved.leetcode.code_december

/**
 *  Problem = 123
 *
 *  *** Valid Anagram
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (26)
 *
 * # Code =>
 */
fun main() {

    val s = "anagram"
    val t = "ganrama"

    val ans = isAnagram(s, t)

    println("Ans ==> $ans")
}

private fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val totalCh = IntArray(26) { 0 }

    s.forEach { totalCh[it - 'a'] += 1 }

    t.forEach { totalCh[it - 'a'] -= 1 }

    totalCh.forEach { if (it != 0) return false }

    return true
}

private fun isAnagram2(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val sMap = mutableMapOf<Char, Int>()

    s.forEach {
        sMap[it] = sMap.getOrDefault(it, 0) + 1
    }

    t.forEach {
        if (!sMap.containsKey(it)) return false
        sMap[it] = sMap.getOrDefault(it, 0) - 1
        if (sMap[it]!! < 0) return false
    }

    return true
}