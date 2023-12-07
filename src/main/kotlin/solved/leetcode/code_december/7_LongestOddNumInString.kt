package solved.leetcode.code_december

/**
 *  Problem = 114
 *
 *  *** Longest Odd Number In String
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

    val num = "2214454"

    val ans = largestOddNumber(num)

    println("Ans ==> $ans")

}

fun largestOddNumber(num: String): String {
    if (num.last().digitToInt() % 2 != 0) return num

    for (i in num.length - 1 downTo 0) {
        val d = num[i].digitToInt()
        if (d % 2 != 0) {
            return num.substring(0..i)
        }
    }

    return ""
}

fun largestOddNumber2(num: String): String {
    if (num.last().digitToInt() % 2 != 0) return num
    return num.substring(0..num.indexOfLast { it.digitToInt() % 2 == 1 })
}

fun largestOddNumber3(num: String): String {
    if (num.last().digitToInt() % 2 != 0) return num

    var lastInd = -1
    for (i in 9 downTo 1 step 2) {
        val ind = num.lastIndexOf("$i")
        if (ind > -1 && ind > lastInd) {
            lastInd = ind
        }
    }

    if (lastInd > -1) {
        return num.substring(0..lastInd)
    }

    return ""
}