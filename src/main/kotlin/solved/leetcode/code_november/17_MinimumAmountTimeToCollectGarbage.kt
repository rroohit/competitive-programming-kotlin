package solved.leetcode.code_november

/**
 *  Problem = 97
 *
 *  *** Minimum Amount Of Time To Collect Garbage
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
 * # Code =>
 */
fun main() {

    //val garbage = arrayOf("MMM", "PGM", "GP")
    //val garbage = arrayOf("G", "P", "GP", "GG")
    val garbage = arrayOf("GP", "MGPPPMGGP", "MM", "GGGMPGG", "M")
    val travel = intArrayOf(3, 1, 5, 3)

    val result = garbageCollection(garbage, travel)

    println("Ans ==> $result")

}

fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
    var count = 0

    for (i in 1 until travel.size) {
        travel[i] += travel[i - 1]
    }

    val mapInd = mutableMapOf<Char, Int>()

    for (i in garbage.indices) {
        val garb = garbage[i]
        if (garb.contains('M')) {
            mapInd['M'] = i
        }
        if (garb.contains('P')) {
            mapInd['P'] = i
        }
        if (garb.contains('G')) {
            mapInd['G'] = i
        }
        count += garb.length
    }

    mapInd.forEach { (t, u) ->
        if (u - 1 > 0) {
            count += travel[u - 1]
        }
    }

    return count
}
