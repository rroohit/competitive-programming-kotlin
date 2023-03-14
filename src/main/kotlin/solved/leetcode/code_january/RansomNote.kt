package solved.leetcode.code_january

/**
 *  Problem = 4
 *
 *  *** RansomNote (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(r*m)
 *          r - first string size
 *          m - second string size
 *
 *      - Space complexity:
 *
 *
 *
 * # Code =>
 */
fun main() {

    val ransomNote = "aaba"
    val magazine = "aaab"

    println(canConstruct(ransomNote, magazine))

}

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    var canConstruct = false

    if (ransomNote == magazine) {
        return true
    }

    val visitedIndex = mutableListOf<Int>()
    var newMagazine = ""

    for (element in ransomNote) {

        for (j in magazine.indices) {

            if (visitedIndex.contains(j)) continue

            if (element == magazine[j]) {
                newMagazine += "${magazine[j]}"
                visitedIndex.add(j)
                break
            }

        }
        if (newMagazine == ransomNote) {
            canConstruct = true
            break
        }

    }

    return canConstruct
}