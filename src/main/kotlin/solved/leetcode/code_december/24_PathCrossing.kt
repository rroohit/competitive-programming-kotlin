package solved.leetcode.code_december

/**
 *  Problem = 131
 *
 *  *** Path Crossing
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (n)
 *
 * # Code =>
 */
fun main() {

    val path = "NES"

    val ans = isPathCrossing(path)

    println("Ans ==> $ans")

}

fun isPathCrossing(path: String): Boolean {
    val visited = mutableListOf<String>()
    var x = 0
    var y = 0

    visited.add("$x,$y")

    for (ch in path) {
        when (ch) {
            'N' -> y++
            'E' -> x++
            'S' -> y--
            'W' -> x--
            else -> Unit
        }
        val v = "$x,$y"
        if (visited.contains(v)) return true
        visited.add(v)
    }

    return false
}

fun isPathCrossing2(path: String): Boolean {
    val visited = mutableListOf<List<Int>>()
    var x = 0
    var y = 0

    visited.add(listOf(x, y))

    for (ch in path) {
        when (ch) {
            'N' -> y++
            'E' -> x++
            'S' -> y--
            'W' -> x--
            else -> Unit
        }
        val v = listOf(x, y)
        if (visited.contains(v)) return true
        visited.add(v)
    }

    return false
}