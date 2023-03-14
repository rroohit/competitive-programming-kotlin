package solved.leetcode.code_january

/**
 *  Problem = 36
 *
 *  *** Sub Array Divisible By Two (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val nums = intArrayOf(4, 5, 0, -2, -3, 1)

    val k = 5

    println(subarraysDivByK(nums, k))

}

fun subarraysDivByK(nums: IntArray, k: Int): Int {
    var ans = 0
    val hasMap = HashMap<Int, Int>()
    hasMap[0] = 1

    val len = nums.size - 1

    var globTotal = 0

    for (i in 0..len) {
        globTotal += nums[i]

        var reminder = globTotal % k

        if (reminder < 0) reminder += k

        if (hasMap.containsKey(reminder)) {
            ans += hasMap[reminder]!!
        }

        hasMap[reminder] = hasMap.getOrDefault(reminder, 0) + 1

    }

    return ans

}

fun subarraysDivByK2(nums: IntArray, k: Int): Int {
    var ans = 0

    val len = nums.size
    val list = nums.toList()

    for (i in 1..len) {

        for (j in 0..len) {

            if (i + j <= len) {
                if (list.subList(j, i + j).sum() % k == 0) {
                    ans++
                }
            }

        }
    }

    return ans

}