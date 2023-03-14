package solved.leetcode.code_january

import java.lang.Math.abs


/**
 *  Problem = 8
 *
 *  *** ReverseInteger (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(?)
 *
 *
 *      - Space complexity: O(?)
 *
 *
 * # Code =>
 */
fun main() {

    val num = -2147483648

    println(reverse(num))

}

fun reverse(x: Int): Int {

    return if (x >= Int.MIN_VALUE && x <= Int.MAX_VALUE) {
        val s = abs(x).toString().replace("-","").reversed().toLong()
        val a = Int.MAX_VALUE.compareTo(s)
        val b = Int.MIN_VALUE.compareTo(s)
        if (a > 0 || b > 0) {
            if (x > 0) {
                s.toInt()
            } else {
                -s.toInt()
            }
        } else {
            0
        }

    } else {
        0
    }
}