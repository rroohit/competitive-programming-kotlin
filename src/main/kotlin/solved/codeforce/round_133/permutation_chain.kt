package solved.codeforce.round_133

/**
 * Solved =>  B. Permutation Chain (Codeforces Round #133)
 *
 * (link - https://codeforces.com/contest/1716/problem/B)
 *
 */

fun main() {
    val noOfTest = readln().toLong()

    for (i in 1..noOfTest) {

        val n = readln().trimEnd().toInt()

        findPermutationChain(n)

    }

}

fun findPermutationChain(n: Int) {

    val initialList = arrayListOf<Int>()

    val ansList = arrayListOf<List<Int>>()

    repeat(n) { v ->
        initialList.add(v + 1)
    }

    ansList.add(initialList)

    var swapIndex = 0

    println(n)

    repeat(n - 1) {

        val string = initialList.joinToString(" ")
        println(string)

        val a = ansList[swapIndex][swapIndex]
        val b = ansList[swapIndex][swapIndex + 1]

        initialList[swapIndex] = b
        initialList[swapIndex + 1] = a

        ansList.add(initialList)

        swapIndex++
    }

    println(ansList.last().joinToString(" "))

}