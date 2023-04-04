package solved.leetcode.code_april

/**
 *  Problem = 73
 *
 *  *** Find The Difference
 *
 *  # Intuition :
 *          create has set count of string in given two string then map second string count with first string count
 *          if the count is 0 means string one didn't have that char in it return it
 *          of if the count is greater than string one char count it the extra char are not present in string one so return it
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
            return ch
        }
    }


    return ' '
}