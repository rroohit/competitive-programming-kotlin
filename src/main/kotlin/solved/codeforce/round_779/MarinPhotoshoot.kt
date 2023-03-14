package solved.codeforce.round_779


/**
 * Solved => Marin and Photo shoot (Codeforces Round #779)
 *
 * (link - https://codeforces.com/contest/1658/problem/A)
 *
 */

fun main() {

    val numberOfTestCase = readln().toLong()

    for (i in 1..numberOfTestCase) {

        readln() //number of cos-players

        val cosPlayerLine = readln().trim()

        getBeautifulPicture(cosPlayerLine)


    }

}


fun getBeautifulPicture(cosPlayers: String) {

    var count = 0

    for (i in 1 until cosPlayers.length) {
        if (cosPlayers[i].toString() == "0") {
            if (i - 2 >= 0 && cosPlayers[i - 2].toString() == "0" && cosPlayers[i - 1].toString() == "1") {
                count++
            } else if (cosPlayers[i - 1].toString() == "0") {
                count += 2
            }

        }

    }

    println(count)

}

/**
 * Example Input
 *
 *      9
 *      3
 *      000
 *      3
 *      001
 *      3
 *      010
 *      3
 *      011
 *      3
 *      100
 *      3
 *      101
 *      3
 *      110
 *      3
 *      111
 *      19
 *      1010110000100000101
 *
 */