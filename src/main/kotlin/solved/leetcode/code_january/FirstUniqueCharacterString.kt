package solved.leetcode.code_january

/**
 *  Problem = 3
 *
 *  *** FirstUniqueCharacterString (leetcode)
 *
 *  # Intuition
 *
 *
 *  # Approach :
 *      - Looping through array
 *          In each loop again one loop to find unique number
 *      - If found duplicate then stop loop and go to next iteration to reduce time complexity
 *
 *
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *          n - string size
 *
 *
 *      - Space complexity: O(1)
 *
 *
 *
 * # Code =>
 */
fun main() {

    val string = "rroohit"

    println(firstUniqueChar(string))

}

fun firstUniqueChar(s: String): Int {
    var index = -1

    for (i in s.indices) {
        val str = s[i]

        val list = mutableListOf<Char>()
        for (j in s.indices) {
            if (j == i) continue
            if (str == s[j] ) {
                list.add(s[j])
                break
            }

        }
        if (list.isEmpty()) {
            index = i
            break
        }
    }

    return index

}