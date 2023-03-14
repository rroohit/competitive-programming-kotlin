package input_reading_formats

/**
 * Input example =>
 *
 *      6
 *      aabbdabdccc
 *      zyx
 *      aaababbb
 *      aabbcc
 *      oaoaaaoo
 *      bmefbmuyw
 *
 */


fun main() {

    val noOfString = readln().toLong()

    for (i in 1..noOfString) {

        val str = readln().trim()

        println(str)
    }


}