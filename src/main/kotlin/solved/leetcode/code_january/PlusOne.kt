package solved.leetcode.code_january


/**
 *  Problem = 41
 *
 *  *** Plus One (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val digits = intArrayOf(9,9,9,9,9,9,9,9,9,9,9,9,9)

    println(plusOne(digits).toList())

}

fun plusOne(digits: IntArray): IntArray {
    var carry = 1
    var inx = digits.size - 1

    while (carry == 1) {
        if (inx >= 0) {
            if (digits[inx] == 9) {
                digits[inx] = 0
            } else {
                digits[inx] += carry
                carry = 0
            }

        } else {
            //  On -1 one means carry has to add on first index

            return intArrayOf(1).plus(digits)
        }

        inx--
    }

    return digits

}