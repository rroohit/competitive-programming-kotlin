package solved.leetcode.code_april

/**
 *  Problem = 70
 *
 *  *** Successful Pairs Of Spells And Potions
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n log m)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val spells = intArrayOf(5, 1, 3)
    val potions = intArrayOf(1, 2, 3, 4, 5)
    val success = 7L

    println("ans => ${successfulPairs(spells, potions, success).toList()}")

}

fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {

    val ans = arrayListOf<Int>()

    val n = potions.size

    potions.sort()

    for (spell in spells.indices) {
        var l = 0
        var r = n - 1
        var f = n

        while (l <= r) {

            val m = (l + r) / 2

            val isSuccess = spells[spell] * potions[m].toLong()

            if (isSuccess >= success) {
                r = m - 1
                f = m
            } else {
                l = m + 1
            }

        }

        ans.add(n - f)

    }


    return ans.toIntArray()
}