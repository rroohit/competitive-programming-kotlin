package unsolved

import java.util.ArrayList

fun main() {

    val numberOfTestCase = readln().toLong()

    for (i in 1..numberOfTestCase) {
        val studentSmartness = arrayListOf<Long>()

        val (n, m) = readln().trim().split("\\s+".toRegex()).map(String::toLong)

        readln().trim().split("\\s+".toRegex()).map { items ->
            studentSmartness.add(items.toLong())
        }

        println(findTeam(n, m, studentSmartness))

    }


}

//  n = number students
//  m = number of topics
//  studentSmartness = each student smarteness

fun findTeam(n: Long, m: Long, studentSmartness: ArrayList<Long>): Long {
    var ans = -1L




    return ans


}
