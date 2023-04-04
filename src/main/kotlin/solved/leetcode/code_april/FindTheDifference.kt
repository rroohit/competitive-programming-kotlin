package solved.leetcode.code_april

/**
 *  Problem = 73
 *
 *  *** Find The Difference
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(k)
 *
 *      - Space complexity: O(s + k)
 *
 *      s - string one length
 *      k - string two length
 *
 *
 * # Code =>
 */
fun main() {

    val s = "abcd"
    val k = "abcdd"


    println("ans => ${findTheDifference(s, k)}")

}

fun findTheDifference(s: String, k: String): Char {
    var ans = ' '

    val sCount = mutableMapOf<Char, Int>()
    val kCount = mutableMapOf<Char, Int>()

    s.forEach { ch ->
        sCount[ch] = sCount.getOrDefault(ch, 0) + 1
    }

    k.forEach { ch ->
        kCount[ch] = kCount.getOrDefault(ch, 0) + 1
    }


    kCount.forEach { (ch, count) ->
        val sCheck = sCount.getOrDefault(ch, 0)
        if (sCheck == 0 || count > sCheck) {
            ans = ch
        }
    }


    return ans
}