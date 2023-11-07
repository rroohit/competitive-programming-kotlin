package solved.leetcode.code_november


import kotlin.math.ceil

/**
 *  Problem = 87
 *
 *  *** Eliminate Maximum Number Of Monsters
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(nlogn)
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */
fun main() {

    val dist = intArrayOf(3, 5, 7, 4, 5)
    val speed = intArrayOf(2, 3, 6, 3, 2)

    val ans = eliminateMaximum(dist, speed)
    println("Ans ==> $ans")


}

fun eliminateMaximum(dist: IntArray, speed: IntArray): Int {
    val rT = mutableListOf<Int>() // reaching time for each monster to city

    for (i in dist.indices) {
        val res = (dist[i].toFloat() / speed[i].toFloat())
        rT.add(ceil(res).toInt())
    }

    rT.sort()

    var ans = 0
    for (i in rT.indices) {
        if (i >= rT[i]) return ans
        ans++
    }

    return ans
}