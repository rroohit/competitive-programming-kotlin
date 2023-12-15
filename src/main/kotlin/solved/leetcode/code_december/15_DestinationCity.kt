package solved.leetcode.code_december

/**
 *  Problem = 122
 *
 *  *** Destination City
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (n)
 *
 * # Code =>
 */
fun main() {

    val paths = listOf(
        listOf("London", "New York"),
        listOf("New York", "Lima"),
        listOf("Lima", "Sao Paulo")
    )

    val ans = destCity(paths)

    println("Ans ==> $ans")

}

fun destCity(paths: List<List<String>>): String {
    // Map from each city other city's can be visited directly [city --> list(city's can visit)]
    val mapCitys = mutableMapOf<String, MutableList<String>>()

    paths.forEach {
        val key = it[0]
        val value = it[1]

        mapCitys.getOrPut(key) { mutableListOf() }.add(value)

        if (!mapCitys.containsKey(value)) {
            mapCitys[value] = mutableListOf()
        }
    }

    for ((city, toCitys) in mapCitys) {
        if (toCitys.isEmpty()) return city
    }

    return ""
}