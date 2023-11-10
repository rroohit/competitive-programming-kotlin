package solved.leetcode.code_november

/**
 *  Problem = 90
 *
 *  *** Restore The Array From Adjacent Pairs
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

    /*val adjacentPairs = arrayOf(
        intArrayOf(2, 1),
        intArrayOf(3, 4),
        intArrayOf(3, 2),
    )*/

    val adjacentPairs = arrayOf(
        intArrayOf(4, -2),
        intArrayOf(1, 4),
        intArrayOf(-3, 1),
    )

    val ans = restoreArray(adjacentPairs)

    println("Ans ==> ${ans.toList()}")

}

fun restoreArray(adjacentPairs: Array<IntArray>): IntArray {
    val pairs = mutableMapOf<Int, MutableList<Int>>()

    for (pair in adjacentPairs) {

        pairs.computeIfAbsent(pair[0]) { mutableListOf() }.add(pair[1])

        pairs.computeIfAbsent(pair[1]) { mutableListOf() }.add(pair[0])
    }
    val res = mutableListOf<Int>()
    run {
        pairs.forEach { (t, u) ->
            if (u.size == 1) {
                res.add(t)
                res.add(u[0])
                while (res.size < pairs.size) {
                    val last = res.last()
                    val sndLat = res[res.lastIndex - 1]
                    val node = pairs[last]
                    if (node!![0] != sndLat) {
                        res.add(node[0])
                    } else {
                        res.add(node[1])
                    }
                }
                return@run
            }
        }
    }

    return res.toIntArray()
}