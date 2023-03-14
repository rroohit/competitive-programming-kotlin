package solved.leetcode.code_march

import kotlin.math.abs
import kotlin.math.min

/**
 *  Problem = 60
 *
 *  *** Minimum Time Type Word Using Special Typewriter
 *
 *  # Intuition
 *          While iterating given string we check for each char clockwise direction and counterclockwise direction length
 *          from current pointer position add to result the min from both length
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *          n - length of given string.
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */

fun main() {

    val word = "bza"


    println("ans => ${minTimeToType(word)}")


}

fun minTimeToType(word: String): Int {
    var ans = 0
    var curPointer = 'a'

    for (ch in word) {

        if (ch == curPointer) {
            ans += 1
            continue
        }

        val clockWise = abs(ch - curPointer)
        val counterClockWise = abs(clockWise - (26))

        val minTimeToPrint = min(clockWise, counterClockWise) + 1

        ans += minTimeToPrint

        curPointer = ch
    }

    return ans

}