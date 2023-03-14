package solved.leetcode.code_january

fun main() {
    val trust = arrayOf(
        intArrayOf(1,3),
        intArrayOf(1, 4),
        intArrayOf(2, 3),
        intArrayOf(2, 4),
        intArrayOf(4, 3),

    )

    println(findJudge(4, trust))

}

fun findJudge(n: Int, trust: Array<IntArray>): Int {

    val mapTrust = IntArray(n + 1)
    val mapJudge = IntArray(n + 1)


    for (i in trust.indices) {
        if (trust[i].isEmpty()) break

        val p = trust[i][0]
        val j = trust[i][1]

        mapTrust[p] += 1
        mapJudge[j] += 1


    }

    for (i in 1..n) {
        if (mapTrust[i] == 0 && mapJudge[i] == n - 1) {
            return i
        }
    }

    return -1

}


