package solved.leetcode.code_november

/**
 *  Problem = 98
 *
 *  *** Count Nice Pairs In An Array
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

    val nums = intArrayOf(13, 10, 35, 24, 76)

    val ans = countNicePairs(nums)

    println("Ans ==> $ans")

}

fun countNicePairs(nums: IntArray): Int {
    val MOD = 1000000007 // 10^9 + 7
    val map = mutableMapOf<Int, Int>()
    var ans = 0

    for (i in nums) {
        val curr = (i - rev(i))
        ans = (ans + map.getOrDefault(curr, 0)) % MOD
        map[curr] = map.getOrDefault(curr, 0) + 1
    }

    return ans % MOD
}

fun rev(int: Int): Int {
    var ans = 0
    var num = int
    while (num > 0) {
        val last = num % 10
        ans = (ans * 10) + last
        num /= 10
    }
    return ans
}