package unsolved

//Count Unreachable Pairs of Nodes in an Undirected Graph

fun main() {
//    n = 11, edges = [[5,0],[1,0],[10,7],[9,8],[7,2],[1,3],[0,2],[8,5],[4,6],[4,2]]
    val n = 11
    val edges = arrayOf(
        intArrayOf(5, 0),
        intArrayOf(1, 0),
        intArrayOf(10, 7),
        intArrayOf(9, 8),
        intArrayOf(7, 2),
        intArrayOf(1, 3),
        intArrayOf(0, 2),
        intArrayOf(8, 5),
        intArrayOf(4, 6),
        intArrayOf(4, 2),
    )

    println("ans => ${countPairs(n, edges)}")

}

val visited1 = mutableSetOf<Int>()

fun countPairs(n: Int, edges: Array<IntArray>): Long {
    // Build adjacency list representation of the graph

    val adjList = mutableMapOf<Int, MutableList<Int>>()

    for ((edge, dst) in edges) {
        adjList[edge] = (adjList[edge] ?: mutableListOf()).apply { add(dst) }
        adjList[dst] = (adjList[dst] ?: mutableListOf()).apply { add(edge) }
    }

    println(adjList)

    // Perform depth-first search to count unreachable nodes from each node
    val connectedEdges = getConnectedEdgesMap(adjList).toMutableMap()

    var ans = 0L

    for (i in 0 until n) {
        if (!visited1.contains(i)) {
            connectedEdges[i] = listOf(1)
        }
    }



    connectedEdges.forEach {
        val connected = it.value.size
        val notConnected = (n - 1) - connected
        ans += connected * notConnected

    }

    return ans / 2
}

fun getConnectedEdgesMap(adjList: Map<Int, MutableList<Int>>): Map<Int, List<Int>> {
    val connectedEdgesMap = mutableMapOf<Int, MutableList<Int>>()
    val visited = mutableSetOf<Int>()
    for (start in adjList.keys) {
        if (!visited.contains(start)) {
            val connectedEdges = mutableListOf<Int>()
            dfs(start, adjList, visited, connectedEdges)
            connectedEdges.forEach { edge ->
                connectedEdgesMap.getOrPut(edge) { mutableListOf() }.addAll(connectedEdges)
            }
        }
    }

    return connectedEdgesMap.mapValues { it.value.distinct() }
}

fun dfs(node: Int, adjList: Map<Int, MutableList<Int>>, visited: MutableSet<Int>, connectedEdges: MutableList<Int>) {
    visited.add(node)
    visited1.add(node)

    if (adjList[node] == null) return
    for (neighbor in adjList[node]!!) {
        if (!visited.contains(neighbor)) {
            connectedEdges.add(neighbor)
            dfs(neighbor, adjList, visited, connectedEdges)
        }
    }
}


