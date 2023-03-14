package solved.practice

import java.lang.StrictMath.abs


fun main() {

    val abc = ('A'..'Z').toMutableList()
    val ans = arrayListOf<Int>()

    val getString = readln().trim()
    //val getString = "AWZB"

    getString.forEachIndexed { i, ch ->

        if (i < getString.length - 1) {

            val currentIndex = abc.indexOf(ch) + 1
            val nextIndex = abc.indexOf(getString[i + 1]) + 1

            val clockWiseDirect = abs(currentIndex - nextIndex)

            val antiClockWiseDirection = if (currentIndex > nextIndex) {
                abs(currentIndex - 26) - nextIndex
            } else {
                abs(nextIndex - 26) + currentIndex

            }

            if (clockWiseDirect > antiClockWiseDirection) {
                ans.add(abs(antiClockWiseDirection))
            } else {
                ans.add(clockWiseDirect)
            }


        }

    }

    println(ans)
    println(ans.sum())


}