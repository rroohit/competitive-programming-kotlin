package solved.codeforce.round_780

/**
 * Solved =>  Vlad and Candies (Codeforces Round #780)
 *
 * (link - https://codeforces.com/contest/1660/problem/B)
 *
 */

fun main() {

    val noTest = readln().toLong()

    for (i in 1..noTest) {
        val noOfCandy = mutableListOf<Long>()

        readln().toLong()

        readln().trim().split("\\s+".toRegex()).map { items ->
            noOfCandy.add(items.toLong())
        }

        canEatAllCandies(noOfCandy)

    }

}

fun canEatAllCandies(noOfCandy: List<Long>) {

    val sortedLs = noOfCandy.sorted()

    if (sortedLs.size == 1) {
        if (sortedLs.first() == 1L) {
            println("YES")
        } else {
            println("NO")
        }
    } else {

        if (sortedLs.last() - sortedLs[sortedLs.size - 2] <= 1L) {
            println("YES")
        } else {
            println("NO")
        }
    }

}

/**
 * Example
 *
 *  input ->
 *
 *      6
 *      2
 *      2 3
 *      1
 *      2
 *      5
 *      1 6 2 4 3
 *      4
 *      2 2 2 1
 *      3
 *      1 1000000000 999999999
 *      1
 *      1
 *
 *  output ->
 *
 *       YES
 *       NO
 *       NO
 *       YES
 *       YES
 *       YES
 *
 */


