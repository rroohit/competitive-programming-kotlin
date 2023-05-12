package solved.leetcode.code_may

import kotlin.math.max

/**
 *  Problem = 77
 *
 *  *** Solving Questions With Brainpower
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */

fun main() {

    val questions = arrayOf(
        intArrayOf(3, 2),
        intArrayOf(4, 3),
        intArrayOf(4, 4),
        intArrayOf(2, 5),
    )

    println("Ans => ${mostPoints(questions)}")

}

fun mostPoints(questions: Array<IntArray>): Long {
    val maxL = questions.size

    val cache = mutableMapOf<Int, Long>()

    fun dfs(i: Int): Long {
        if (i >= maxL) return 0

        if (cache.containsKey(i)) return cache[i]!!

        val solve = questions[i][0] + dfs(i + 1 + questions[i][1])
        val skip = dfs(i + 1)

        cache[i] = max(solve, skip)

        return cache[i]!!
    }


    return dfs(0)
}