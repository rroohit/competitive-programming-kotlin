package solved.leetcode.code_january

/**
 *  Problem = 30
 *
 *  *** Min Flips Monotone Increasing  (leetcode)
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

    val binaryStr = "011010001101001"           // ans = 6
//    val binaryStr = "0101100011"              // ans = 3
//    val binaryStr = "10011111110010111011"    // ans = 5

    println(minFlipsMonoIncreasing(binaryStr))

}

fun minFlipsMonoIncreasing(s: String): Int {

    var numFlip = 0
    var numOne = 0


    for (i in s.indices) {
        val cha = s[i]
        if (cha == '1') {
            numOne++
        } else if (numOne > 0) {
            numFlip++
            numOne--
        }
    }

    return numFlip
}