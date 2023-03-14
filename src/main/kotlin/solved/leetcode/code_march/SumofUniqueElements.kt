package solved.leetcode.code_march

/**
 *  Problem = 44
 *
 *  *** Sum Of Unique Elements
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

//    val nums = intArrayOf(1, 2, 3, 2)
//    val nums = intArrayOf(1, 1, 1, 1)
    val nums = intArrayOf(1, 1, 1, 1, 2, 13)

    println("ans => ${sumOfUnique(nums)}")

}

fun sumOfUnique(nums: IntArray): Int {
    val map = hashMapOf<Int, Boolean>()

    var res = 0

    nums.forEach {

        if (map.containsKey(it)) {
            if (!map[it]!!) {
                map[it] = true
                res -= it
            }
        } else {
            map[it] = false
            res += it
        }

    }

    return res

}