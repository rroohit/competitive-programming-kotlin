package solved.leetcode.code_november


/**
 *  Problem = 106
 *
 *  *** Number Of 1 Bits
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(1)
 *
 *      - Space complexity: O(1)
 *
 * # Code =>
 */
fun main() {

    // ans = 3
    val n = 00000000000000000000000000001011.0

    println("Ans ==> $")

}

fun hammingWeight(n: Int): Int {
    var ans = 0
    var num = n

    while (num != 0) {
        num = num and (num - 1)
        ans++
    }

    return ans
}