package solved.leetcode.code_november

import java.util.*

fun main() {

    val graph = Graph(
        4, arrayOf(
            intArrayOf(0, 2, 5), // from --> to : cost
            intArrayOf(0, 1, 2),
            intArrayOf(1, 2, 1),
            intArrayOf(3, 0, 3),
        )
    )

    ///graph.addEdge(intArrayOf(1, 3, 4))

    val dist = graph.shortestPath(3, 2)

    println("short dist ==> $dist")


}

class Graph(n: Int, edges: Array<IntArray>) {
    private val graph: MutableMap<Int, MutableMap<Int, Int>> = mutableMapOf()

    init {
        for (edge in edges) {
            graph.computeIfAbsent(edge[0]) { mutableMapOf() }[edge[1]] = edge[2]
        }
        println(graph)
    }

    fun addEdge(edge: IntArray) {
        graph.computeIfAbsent(edge[0]) { mutableMapOf() }[edge[1]] = edge[2]
    }

    fun shortestPath(node1: Int, node2: Int): Int {
        //println("from $node1 --> $node2")

        val distances = mutableMapOf<Int, Int>()
        val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })

        for (node in graph.keys) {
            distances[node] = Int.MAX_VALUE
        }

        distances[node1] = 0
        priorityQueue.offer(Pair(node1, 0))

        while (priorityQueue.isNotEmpty()) {
            val (currentNode, currentDistance) = priorityQueue.poll() ?: break
            // println("($currentNode, $currentDistance)")

            if (currentDistance > distances[currentNode]!!) {
                continue
            }
            if (currentNode == node2) {
                return distances[node2]!!
            }
            for ((neighbor, weight) in graph[currentNode]!!) {
                // println("(n $neighbor, w $weight)")
                val newDistance = currentDistance + weight
                // println("new d ==> $newDistance")

                distances[neighbor] = newDistance
                priorityQueue.offer(Pair(neighbor, newDistance))
            }
        }

        return -1
    }

}
