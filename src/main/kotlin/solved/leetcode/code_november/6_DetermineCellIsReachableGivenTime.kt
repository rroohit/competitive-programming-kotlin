package solved.leetcode.code_november

import kotlin.math.abs
import kotlin.math.min

/**
 *  Problem = 88
 *
 *  *** Determine if a Cell Is Reachable at a Given Time
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
 *
 * # Code =>
 */
fun main() {

    val sx = 2
    val sy = 4
    val fx = 7
    val fy = 7
    val t = 6

    val ans = isReachableAtTime(sx, sy, fx, fy, t)
    println("Ans ==> $ans")

}

fun isReachableAtTime(sx: Int, sy: Int, fx: Int, fy: Int, t: Int): Boolean {
    val xDiff = abs(sx - fx)
    val yDiff = abs(sy - fy)

    if (xDiff == 0 && yDiff == 0 && t == 1) return false

    return (min(xDiff, yDiff) + abs(xDiff - yDiff)) <= t
}


var ans = false

fun isReachableAtTime2(sx: Int, sy: Int, fx: Int, fy: Int, t: Int): Boolean {
    travelInCell(sx, sy, 0, fx, fy, t)
    return ans
}

var endProcess = false
fun travelInCell(x: Int, y: Int, currT: Int, fx: Int, fy: Int, reqT: Int) {
    if (currT == reqT) {
        // required time spent check location
        if (x == fx && y == fy) {
            println("x -> $x : y -> $y")
            endProcess = true
            ans = true
        }
    }
    if (currT < reqT && !endProcess) {
        val a = travelInCell(x, y - 1, currT + 1, fx, fy, reqT)
        val b = travelInCell(x + 1, y - 1, currT + 1, fx, fy, reqT)
        val c = travelInCell(x + 1, y, currT + 1, fx, fy, reqT)
        val d = travelInCell(x + 1, y + 1, currT + 1, fx, fy, reqT)
        val e = travelInCell(x, y + 1, currT + 1, fx, fy, reqT)
        val f = travelInCell(x - 1, y + 1, currT + 1, fx, fy, reqT)
        val g = travelInCell(x - 1, y, currT + 1, fx, fy, reqT)
        val h = travelInCell(x - 1, y - 1, currT + 1, fx, fy, reqT)
    }
}