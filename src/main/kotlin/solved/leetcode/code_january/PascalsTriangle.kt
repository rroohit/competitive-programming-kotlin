package solved.leetcode.code_january

/**
 *  Problem = 2
 *
 *  *** Pascals Triangle (leetcode)
 *
 *  # Intuition
 *
 *
 *  # Approach :
 *      - Looping through given row size
 *          Each iteration going back to last added row take that get two elements from that at required position and sum
 *      -
 *
 *
 *
 *  # Complexity
 *      - Time complexity: O()
 *
 *
 *      - Space complexity: O()
 *
 *
 * # Code =>
 */
fun main() {

    val numRows = 20

    println(generate(numRows))


}

fun generate(numRows: Int): List<List<Int>> {
    val pascalArray = mutableListOf<List<Int>>()

    for (i in 1..numRows) {
        if (i == 1) {
            pascalArray.add(listOf(1))
        } else {
            val listRow = mutableListOf<Int>()
            for (j in 0 until i) {
                if (j == 0 || j == i-1) {
                    listRow.add(1)
                } else {
                    val pascalList = pascalArray.last()

                    listRow.add(pascalList[j-1]+pascalList[j])

                }

            }
            pascalArray.add(listRow)


        }
    }


    return pascalArray
}