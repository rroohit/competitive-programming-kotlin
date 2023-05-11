package solved.leetcode.code_may


fun main() {

    val n = 3

    generateMatrix(n).forEach {
        println(it)
    }

}

fun generateMatrix(n: Int): Array<IntArray> {
    var left = 0
    var right = n

    var top = 0
    var bottom = n

    while (left < right && top < bottom) {

        // left to right
        for (i in left..right) {

        }

        // top to bottom
        for (i in right..bottom) {

        }

        // right to left
        for (i in bottom..left) {

        }

        // bottom to top
        for (i in bottom..top) {

        }


    }

    return arrayOf()
}