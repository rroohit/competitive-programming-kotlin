package solved.leetcode.code_january


/**
 *  Problem = 9
 *
 *  *** Maximum Ice Cream Bars (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *          - sort the array buy the ice cream until the coins will meet zero or ice cream will expensive than coins left
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

    val costs = intArrayOf(7, 3, 3, 6, 6, 6, 10, 5, 9, 2)

    println(maxIceCream(costs, 56))

}

fun maxIceCream(costs: IntArray, coins: Int): Int {
    var count = 0

    var coin = coins

    costs.sort()
    if (costs[0] > coin) {
        return 0
    }
    for (i in costs.indices) {
        coin -= costs[i]
        count++
        if ((i + 1) < costs.size && coin < costs[i + 1]) {
            break
        }

    }
    return count

}