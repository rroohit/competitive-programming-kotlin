package solved.leetcode.code_december

/**
 *  Problem = 134
 *
 *  *** Number Of Dice Rolls With Target Sum
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (n)
 *
 * # Code =>
 */
fun main() {

    val n = 2
    val k = 6
    val target = 7

    val ans = numRollsToTarget(n, k, target)

    println("Ans ==> $ans")

}

fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
    return count(n, target, k)
}


val cache = mutableMapOf<Pair<Int, Int>, Int>()
val MOD = 1000000007 // 10^9 + 7

fun count(n: Int, target: Int, k: Int): Int {
    if (n == 0) {
        return if (target == 0) 1 else 0
    }

    val key = Pair(n, target)
    if (key in cache) {
        return cache[key]!!
    }

    var res = 0
    for (value in 1..k) {
        res = (res + count(n - 1, target - value, k)) % MOD
    }

    cache[key] = res
    return res
}