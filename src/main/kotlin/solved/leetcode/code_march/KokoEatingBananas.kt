package solved.leetcode.code_march

import kotlin.math.max
import kotlin.math.min

/**
 *  Problem = 48
 *
 *  *** Koko eating bananas
 *
 *  # Intuition
 *          Using Binary search in min-max bound of a given array of piles we can find the min k

 *
 *  # Complexity
 *      - Time complexity: O(nlogn*n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val piles = intArrayOf(805306368,805306368,805306368)
    val h = 1000000000

    println("ans => ${minEatingSpeed(piles, h)}")


}

fun minEatingSpeed(piles: IntArray, h: Int): Int {
    var l = 1
    var r = Int.MIN_VALUE

    // Will first find minimum and maximum count that can be done in one hour
    piles.forEach {
        r = max(r, it)
    }

    var ans = r

    //  Now will perform binary search to find min possible count of `k` to eat all bananas in given `h`
    while (l <= r) {

        var mid = (l + r) / 2
        val re =  (l + r) % 2
        if (re > 0) {
            mid += 1
        }

        var totalHours = 0
        piles.forEach {
            val a = it / mid
            val rem = it % mid
            if (rem > 0) {
                totalHours += 1
            }
            totalHours += a
        }

        if (totalHours <= h) {
            r = mid - 1
            ans = min(mid, ans)
        } else {
            l = mid + 1
        }

    }
    return ans

}