package solved.leetcode.code_march

import kotlin.math.min

/**
 *  Problem = 67
 *
 *  *** Minimum Score of a Path Between Two Cities
 *
 *  # Intuition
 *      Using dfs
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(e * v)
 *         e - number edges
 *         v - number vertex
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */
fun main() {


    //n = 4, roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]
    val roads = arrayOf(
        intArrayOf(1, 2, 9),
        intArrayOf(2, 3, 6),
        intArrayOf(2, 4, 5),
        intArrayOf(1, 4, 7),
    )
    val n = 4

    println("ans => ${minScore(n, roads)}")

}

fun minScore(n: Int, roads: Array<IntArray>): Int {

    val adj = mutableMapOf<Int, MutableList<Pair<Int, Int>>>()

    for ((src, dst, dist) in roads) {
        adj[src] = (adj[src] ?: mutableListOf()).apply { add(Pair(dst, dist)) }
        adj[dst] = (adj[dst] ?: mutableListOf()).apply { add(Pair(src, dist)) }
    }

    println(adj)

    val visited = mutableSetOf<Int>()
    var res = Int.MAX_VALUE

    fun dfs(k: Int) {
        if (visited.contains(k)) return
        visited.add(k)

        for ((neighbor, dist) in adj[k]!!) {
            res = min(res, dist)
            dfs(neighbor)
        }


    }
    dfs(1)


    return res

}