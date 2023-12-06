package solved.leetcode.code_december

/**
 *  Problem = 113
 *
 *  *** Calculate Money In Leetcode Bank
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

    val n = 10

    val ans = totalMoney(n)

    println("Ans ==> $ans")

}

fun totalMoney(n: Int): Int {
    val k = n / 7
    var ans = (k * (56 + (k - 1) * 7)) / 2
    val r = n % 7

    for (i in 0 until r) {
        ans += (k + 1) + i
    }

    return ans
}

fun totalMoney2(n: Int): Int {
    var ans = 0
    var mon = 1
    var day = 0

    for (i in 1..n) {
        val m = day + mon
        ans += m
        day++
        if (day == 7) {
            println(ans)
            mon++
            day = 0
        }
    }

    return ans
}