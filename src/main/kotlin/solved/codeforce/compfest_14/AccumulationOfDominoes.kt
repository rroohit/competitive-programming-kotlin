package solved.codeforce.compfest_14

fun main() {

    val (n, m) = readln().trim().split("\\s+".toRegex()).map(String::toLong)

    if (m > 1) {
        println((n * (m - 1)))
    } else {
        println((n - 1))

    }


}