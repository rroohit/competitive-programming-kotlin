package solved.leetcode.code_january


/**
 *  Problem = 13
 *
 *  *** Max Points On Line (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n^2)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val points = arrayOf(
        intArrayOf(4, 5),
        intArrayOf(4, -1),
        intArrayOf(4, 0),
        intArrayOf(1, 1),
        intArrayOf(3, 2),
        intArrayOf(5, 3),
        intArrayOf(4, 1),
        intArrayOf(2, 3),
        intArrayOf(1, 4),
    )

    println(maxPoints(points))

}

fun maxPoints(points: Array<IntArray>): Int {
    if (points.size == 1) {
        return 1
    }

    var ansList = 2

    for (i in points.indices) {
        val x1 = points[i][0]
        val y1 = points[i][1]

        for (j in i + 1 until points.size) {
            val x2 = points[j][0]
            val y2 = points[j][1]

            var ans = 2

            for (k in points.indices) {
                if (k != i && k != j) {
                    val x3 = points[k][0]
                    val y3 = points[k][1]

                    val slope = (y2 - y1) * (x3 - x2)

                    val slopeTwo = (y3 - y2) * (x2 - x1)

                    if (slopeTwo == slope) {
                        ans++
                    }

                }

                ansList = if (ans > ansList) ans else ansList

            }
        }

    }

    return ansList

}