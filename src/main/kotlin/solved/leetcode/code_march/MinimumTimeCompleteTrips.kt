package solved.leetcode.code_march

import kotlin.math.min

/**
 *  Problem = ?
 *
 *  *** Minimum Time Complete Trips
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *         Simple binary search using left and right pointer
 *         here left pointer should be min of the given array and left + totalTrips is right pointer
 *         here while computing the binary search we check where left pointer and right + pointer = mid-value will reach to given totalTrips
 *
 *
 *  # Complexity
 *      - Time complexity: O(nlogn)
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val time = intArrayOf(1, 2, 3)
    val totalTrip = 5

    println("ans => ${minimumTime(time, totalTrip)}")

}

fun minimumTime(time: IntArray, totalTrips: Int): Long {
    var l = 0L
    var min = time[0].toLong()

    time.forEach {
        min = min(it.toLong(), min)
    }

    var r= min * totalTrips

    while (l < r) {
        val mid = (l + r) / 2

        var total = 0L
        time.forEach {
            total +=  mid / it.toLong()
        }

        if (total < totalTrips) {
            l = mid + 1L
        } else {
            r = mid
        }

    }

    return l
}