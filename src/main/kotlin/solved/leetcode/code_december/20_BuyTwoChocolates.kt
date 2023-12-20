package solved.leetcode.code_december

/**
 *  Problem = 127
 *
 *  *** Buy Two Chocolates
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

    val price = intArrayOf(1, 2, 2)

    val money = 4

    val ans = buyChoco(price, money)

    println("Ans ==> $ans")

}

fun buyChoco(prices: IntArray, money: Int): Int {
    var one = Int.MAX_VALUE
    var two = Int.MAX_VALUE

    for (i in prices) {

        if (i < one) {
            if (i < two) {
                one = two
                two = i
            } else {
                one = i
            }
        }
    }

    val remaining = money - (one + two)
    return if (remaining < 0) {
        money
    } else {
        remaining
    }

}















