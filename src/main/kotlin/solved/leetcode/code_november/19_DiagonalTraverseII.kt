package solved.leetcode.code_november

/**
 *  Problem = 99
 *
 *  *** Diagonal Traversell
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
 * # Code =>
 */
fun main() {

    val nums = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    val ans = findDiagonalOrder(nums).toList()

    println("Ans ==> $ans")

}

fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
    val mapInd = mutableMapOf<Int, MutableList<Int>>()
    val n = nums.size - 1

    var size = n + 1

    for (i in 0..n) {
        val n2 = nums[i].size - 1
        size += n2
        for (j in 0..n2) {
            val key = (i + j)
            mapInd.getOrPut(key) { mutableListOf() }.add(nums[i][j])
        }
    }


    val ans = IntArray(size)
    size = 0

    mapInd.forEach { (t, u) ->
        for (i in u.size - 1 downTo 0) {
            ans[size] = u[i]
            size++
        }

    }

    return ans
}