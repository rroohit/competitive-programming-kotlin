package input_reading_formats

/**
 * Input example =>
 *
 *      2 3         -row , column
 *      1 2 3       -values
 *      3 2 1       -values
 *
 */

fun main() {

    val matrix = arrayListOf<ArrayList<Long>>()

    val (row, _) = readln().trim().split("\\s+".toRegex()).map(String::toLong)    // '_' stands for column

    for (i in 1..row) {
        val rowValues = arrayListOf<Long>()

        readln().split(" ").map { str ->
            rowValues.add(str.toLong())
        }
        matrix.add(rowValues)

    }

    matrix.forEach { matValues ->
        println(matValues)
    }

}