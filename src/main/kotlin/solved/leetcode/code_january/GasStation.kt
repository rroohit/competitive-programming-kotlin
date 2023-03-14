package solved.leetcode.code_january

/**
 *  Problem = 11
 *
 *  *** Gas Station (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *        - Actually, the reason why it works is simple, and it happens because of two factors.
 *           - First, if you moved to some value, and your total sum is greater than zero, then it means, that previous values did bring some value to the outcome.
 *              For example, we have gas = [2,3,0] and cost = [0,0,5]. If we take just solely value 3 without 2, it wouldn't be enough to pass the last station,
 *              but previous values definitely bring some value to the outcome.
 *
 *           - Second, if we know, that there's definitely has to be a solution. Then, we may assume, that it has to be the smallest possible value, as I said before it may bring the most value to the result
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

    val gas = intArrayOf(3, 1, 1)
    val cost = intArrayOf(1, 2, 2)


    println(canCompleteCircuit(gas, cost))

}

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    if (gas.sum() < cost.sum()) {
        return -1
    }

    var ansIndex = 0
    var total = 0

    for (i in gas.indices) {
        total += (gas[i] - cost[i])

        if (total < 0) {
            total = 0
            ansIndex = i + 1

        }

    }

    return ansIndex

}


//  Works but run reached time out exception
fun canCompleteCircuit2(gas: IntArray, cost: IntArray): Int {
    var ansIndex = -1

    if (gas.sum() < cost.sum()) {
        return ansIndex
    }


    for (i in gas.indices) {
        var isBreak = false

        if (gas[i] >= cost[i]) {
            val I = (i + 1) % gas.size

            var remainGas = gas[i] - cost[i] + gas[I]

            for (j in 0..cost.size) {
                val costIndex = (j + i + 1) % cost.size

                if (costIndex == i) {
                    ansIndex = i
                    isBreak = true
                    break

                }

                val gasI = (costIndex + 1) % gas.size

                if (remainGas < cost[costIndex]) {
                    break
                }

                remainGas = remainGas - cost[costIndex] + gas[gasI]

            }

        }

        if (isBreak) {
            break
        }

    }

    return ansIndex

}