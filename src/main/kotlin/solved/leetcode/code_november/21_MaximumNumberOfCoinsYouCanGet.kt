package solved.leetcode.code_november

import java.util.*

/**
 *  Problem = 100
 *
 *  *** Maximum Number of Coins You Can Get
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 * # Code =>
 */
fun main() {

    val piles = intArrayOf(9, 8, 7, 6, 5, 1, 2, 3, 4)

    val ans = maxCoins(piles)

    println("Ans ==> $ans")

}

fun maxCoins(piles: IntArray): Int {
    Arrays.sort(piles)
    var ans = 0
    val mid = (piles.size) / 3
    var r = piles.size - 2

    while (r >= (mid)) {
        ans += piles[r]
        r -= 2
    }

    return ans
}