package solved.leetcode.code_january

/**
 *  Problem = 6
 *
 *  *** Valid Anagram (leetcode)
 *
 *  # Intuition
 *
 *
 *  # Approach :
 *
 *
 *  # Complexity
 *      - Time complexity: O()
 *
 *
 *      - Space complexity: O(1)
 *
 *
 *
 * # Code =>
 */
fun main() {

    val s = "rohitt"
    val t = "ohitrt"

    println(isAnagram(s, t))

}

fun isAnagram(s: String, t: String): Boolean {

    if (s == t) {
        return true
    }

    if (s.length != t.length) {
        return false
    }

    val tt = t.toList().sorted()
    val ss = s.toList().sorted()

    return ss == tt
}

// able to solve but reached time limit
fun isAnagramTwo(s: String, t: String): Boolean {

    if (s == t) {
        return true
    }

    if (s.length != t.length) {
        return false
    }

    var remainingStr = t
    var anagram = ""

    for (element in s) {

        if ("$anagram$remainingStr" == s) {
            anagram += remainingStr
            break
        }

        var holdStr = ""

        for (j in remainingStr.indices) {
            if (element == remainingStr[j]) {
                anagram += remainingStr[j]
                holdStr += remainingStr.substring(j+1)
                break
            } else {
                holdStr += remainingStr[j]
            }

        }
        remainingStr = holdStr

    }

    return s == anagram.trim()
}