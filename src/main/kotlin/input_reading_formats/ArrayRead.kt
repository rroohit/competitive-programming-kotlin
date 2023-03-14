package input_reading_formats

/**
 * Input example =>
 *
 *      3         number of test cases
 *      3         length of array
 *      5 2 7     -values
 *      5
 *      1 4 2 2 3
 *      2
 *      2 6
 *
 */


fun main() {

    val numberOfTestCase = readln().toLong()

    for (i in 1..numberOfTestCase){
        val arrayValues = arrayListOf<Long>()

        readln()//length of array

        readln().trim().split("\\s+".toRegex()).map { items ->
            arrayValues.add(items.toLong())

        }// It reads whitespace separated values into list

        println(arrayValues.joinToString(" "))
    }

}

//or

fun readArrayList() {
    val numberOfTestCase = readln().toLong()

    for (i in 1..numberOfTestCase) {

        readln()//number of items in list

        val list: List<Int> = readln().trim().split("\\s+".toRegex()).map(String::toInt)

        println(list)
    }
}