package unsolved

fun main() {

    val edges = intArrayOf(3, 3, 4, 2, 3)

    println("ans => ${longestCycle(edges)}")

}

fun longestCycle(edges: IntArray): Int {

    val reversedEdges = IntArray(edges.size) { -1 }
    for (i in edges.indices) {
        reversedEdges[edges[i]] = i
    }


    println(edges.toList())
    println(reversedEdges.toList())

    return 8
}



