package solved.leetcode.code_march

/**
 *  Problem = 63
 *
 *  *** Zigzag Conversion
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */

fun main() {

//    val s = "PAYPALISHIRING"
    val s = "ABCD" //ACBD
    val numRows = 2

    println("ans => ${convert(s, numRows)}")

}

fun convert(s: String, numRows: Int): String {
    val k = mutableListOf<List<Char>>()
    var p = 0
    var isPointerStraight = true


    val list = MutableList(numRows) { '*' }

    for (i in s.indices) {
        if (isPointerStraight) {
            list[p] = s[i]
            if (p == numRows - 1) {

                val l = list.toList()

                k.add(l)

                list.replaceAll { '*' }

                isPointerStraight = false
                p -= 2
                if (p < 0) {
                    isPointerStraight = true
                    p = 0
                    continue
                }

            }
            p++

        } else {
            if (p < 0) p = 0
            val list1 = MutableList(numRows) { '*' }

            list1[p] = s[i]

            k.add(list1)

            p--
            if (p == 0) {
                isPointerStraight = true
            }
            list.replaceAll { '*' }

        }

    }
    val l = list.toList()
    k.add(l)

    var ans = ""

    for (i in k[0].indices) {

        for (j in k.indices) {

            if (k[j][i] != '*') {
                ans += k[j][i]
            }

        }

    }



    return ans
}