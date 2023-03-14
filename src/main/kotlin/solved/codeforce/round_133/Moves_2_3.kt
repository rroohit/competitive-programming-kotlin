package solved.codeforce.round_133

/**
 * Solved =>  A. 2-3 Moves (Codeforces Round #133)
 *
 * (link - https://codeforces.com/contest/1716/problem/A)
 *
 */

fun main() {

    val noOfTest = readln().toLong()

    for (i in 1..noOfTest) {

        val n = readln().toLong()

        findMinutes(n)
    }


}

fun findMinutes(n: Long) {

    val ans = if (n == 1L) {
        2
    } else {
        if (n < 5 && n % 2 == 0L) {
            n / 2
        } else {
            val q = n / 3
            val r = n % 3
            if (r > 0) {
                q + 1
            } else {
                q
            }

        }

    }

    println(ans)

}
