package solved.leetcode.code_december


/**
 *  Problem = 111
 *
 *  *** Largest 3-Same-Digit Number in String
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (1)
 *
 * # Code =>
 */
fun main() {

    val num = "6777133339"

    val ans = largestGoodInteger(num)

    println("Ans ==> $ans")

}

fun largestGoodInteger(num: String): String {
    var ans = ""
    var right = 2
    var lastDigit = -1

    // Sliding window
    while (right < num.length) {
        val r = num[right]     // right int
        val m = num[right - 1] // mid int
        val l = num[right - 2] // left int

        if (r == m && m == l) {
            if (r.digitToInt() > lastDigit) {
                ans = "$r".repeat(3)
                lastDigit = r.digitToInt()
                if (lastDigit == 9) break
            }
        }

        right++
    }

    return ans
}