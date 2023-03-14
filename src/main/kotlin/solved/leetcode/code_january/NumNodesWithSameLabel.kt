package solved.leetcode.code_january


/**
 *  Problem = 21
 *
 *  *** Number of Nodes in the Sub-Tree With the Same Label (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *      - Create graph and apply DFS to it find count of character at each adjacent
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */
fun main() {

    val edges = arrayOf(
        intArrayOf(0, 1),
        intArrayOf(0, 2),
        intArrayOf(1, 4),
        intArrayOf(1, 5),
        intArrayOf(2, 3),
        intArrayOf(2, 6),
    )

    val label = "abaedcd"

    println(countSubTrees(7, edges, label).toList())

}

lateinit var ansList: IntArray

val adjacentList = arrayListOf<ArrayList<Int>>()

val visitedNode = mutableSetOf<Int>()

fun countSubTrees(n: Int, edges: Array<IntArray>, labels: String): IntArray {
    ansList = IntArray(n)

    for (i in 0 until n){
        adjacentList.add(arrayListOf())
    }

    edges.forEach {  e ->
        adjacentList[e[0]].add(e[1])
        adjacentList[e[1]].add(e[0])
    }


    dfs(0, labels)

    return ansList
}

fun dfs(node: Int, labels: String): IntArray {
    visitedNode.add(node)

    val count = IntArray(26)

    for (adj in adjacentList[node]) {

        if (!visitedNode.contains(adj)) {
            val adjCount = dfs(adj, labels)
            for (i in 0 until 26) {
                count[i] += adjCount[i]
            }

        }

    }

    val ch = labels[node]
    count[ch - 'a']++

    ansList[node] = count[ch-'a']

    return count




}
