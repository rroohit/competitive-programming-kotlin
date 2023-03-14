package solved.google.kick_start_b_2022

import kotlin.math.PI

/**
 * Solved => Infinity Area (Google Kick-Start round B - 2022)
 *
 * (link - https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caa74/0000000000acf079)
 *
 */

fun main() {

    val numberOfTestCase = readln().toLong()

    for (i in 1..numberOfTestCase) {

        val (r, a, b) = readln().trim().split("\\s+".toRegex()).map(String::toInt)
        val input = Input(r, a, b)

        println("Case #$i: ${calculateCircleArea(input)}")


    }

}

fun calculateCircleArea(input: Input): Double {
    var ans = input.R * input.R

    var dir = Direction.LEFT

    var r = input.R

    while (r > 0) {

        if (dir == Direction.LEFT) {
            r *= input.A
            ans += r * r

            dir = Direction.RIGHT


        } else {
            r /= input.B
            ans += r * r

            dir = Direction.LEFT

        }

    }

    return ans * PI
}

enum class Direction {
    LEFT,
    RIGHT
}

data class Input(
    val R: Int,
    val A: Int,
    val B: Int
)


/**
 * Example
 *
 * input ->
 *          2 - no of tests
 *          1 3 6
 *          5 2 5
 *
 *
 * output ->
 *          31.415927
 *          455.530935
 *
 *
 **/