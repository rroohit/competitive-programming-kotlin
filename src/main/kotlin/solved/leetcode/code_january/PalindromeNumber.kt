package solved.leetcode.code_january

/**
 *  Problem = 23
 *
 *  *** Palindrome Number (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val num = -121

    println(isPalindrome(num))

}

fun isPalindrome(x: Int): Boolean {
    val xx = x.toString().reversed()

    return x.toString() == xx


}