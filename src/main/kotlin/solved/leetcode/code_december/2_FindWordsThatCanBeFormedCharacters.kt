package solved.leetcode.code_december

/**
 *  Problem = 109
 *
 *  *** Find Words That Can Be Formed by Characters
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

    val words = arrayOf("cat", "bt", "hat", "tree")

    val chars = "atach"

    val ans = countCharacters(words, chars)

    println("Ans ==> $ans")

}

fun countCharacters(words: Array<String>, chars: String): Int {
    var ans = 0
    val chrMap: Map<Char, Int> = chars.groupingBy { it }.eachCount()

    for (word in words) {
        if (word.length <= chars.length) {

            val chMapCopy = chrMap.toMutableMap()

            var isValidString = true

            for (ch in word) {
                if (!chMapCopy.containsKey(ch) || chMapCopy[ch]!! <= 0) {
                    isValidString = false
                    break
                }
                chMapCopy[ch] = chMapCopy[ch]!! - 1
            }

            if (isValidString) ans += word.length
        }
    }
    return ans
}


///////////////////////////

fun countCharacters2(words: Array<String>, chars: String): Int {
    // Pair - word : no of occurrence
    val wordMap = mutableMapOf<String, Int>()

    for (word in words) {
        val w = word.toCharArray()
        val ww = w.sorted().joinToString("")
        wordMap[ww] = wordMap.getOrDefault(ww, 0) + 1
    }

    println(wordMap)

    val chrMap: Map<Char, Int> = chars.groupingBy { it }.eachCount()

    var ans = 0
    wordMap.forEach { (word, u) ->
        if (word.length <= chars.length && canForString2(word, chrMap)) {
            ans += word.length * u
        }
    }

    return ans
}

fun canForString2(word: String, chMap: Map<Char, Int>): Boolean {
    val map = chMap.toMutableMap()
    for (i in word) {
        if (map.containsKey(i) && map[i]!! > 0) {
            map[i] = (map[i]!! - 1)
        } else {
            return false
        }
    }
    return true
}