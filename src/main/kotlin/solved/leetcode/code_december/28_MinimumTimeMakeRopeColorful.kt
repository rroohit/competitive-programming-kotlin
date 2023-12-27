package solved.leetcode.code_december

/**
 *  Problem = 135
 *
 *  *** Minimum Time to Make Rope colorful
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (1)
 *
 * # Code =>
 */
fun main() {

    val colors = "abaac"
    val neededTime = intArrayOf(1, 2, 3, 4, 5)

    val ans = minCost(colors, neededTime)

    println("Ans ==> $ans")

}

fun minCost(colors: String, neededTime: IntArray): Int {
    var ans = 0
    var l = 0

    for (r in 1 until neededTime.size) {
        if (colors[l] == colors[r]) {
            if (neededTime[l] < neededTime[r]) {
                ans += neededTime[l]
                l = r
            } else {
                ans += neededTime[r]
            }
        } else {
            l = r
        }
    }

    return ans
}