package solved.codeforce.round_775

/**
 * Solved => Weird Sum (Codeforces Round #775)
 *
 * (link - https://codeforces.com/contest/1648/problem/A)
 *
 */

fun main() {

    val colorTable = arrayListOf<ArrayList<Long>>()

    val (row, _) = readln().trim().split("\\s+".toRegex()).map(String::toLong)

    for (i in 1..row) {

        val rowValues = arrayListOf<Long>()

        readln().split(" ").map {
            rowValues.add(it.toLong())
        }
        colorTable.add(rowValues)

    }

    getManhattanDistance(colorTable)


}

fun getManhattanDistance(colorTable: ArrayList<ArrayList<Long>>) {
    val detailOfCells = arrayListOf<CellColor>()

    colorTable.forEachIndexed { i, rw ->
        rw.forEachIndexed { j, v ->
            val cell = CellColor(v, Pair((i + 1).toLong(), (j + 1).toLong()))
            detailOfCells.add(cell)
        }
    }
    val sortByCol = detailOfCells.groupBy { it.color }

    calculateManhattanDistance(sortByCol)
}

fun calculateManhattanDistance(sortByCol: Map<Long, List<CellColor>>) {

    var ans = 0L

    sortByCol.forEach {
        val x = arrayListOf<Long>()
        val y = arrayListOf<Long>()
        it.value.forEach { cel ->
            x.add(cel.index.first)
            y.add(cel.index.second)
        }
        ans += getSum(x) + getSum(y)

    }

    println(ans)


}

fun getSum(x: ArrayList<Long>): Long {
    x.sort()
    var ans = 0L
    var prf = 0L
    var suf = 0L
    x.forEachIndexed { i, l ->
        ans += (l * i) - prf
        ans += suf - (l * i)
        prf += l
        suf += x[x.size - 1 - i]
    }
    return ans
}

data class CellColor(
    val color: Long,
    val index: Pair<Long, Long>
)


/**
 * Example Input
 *
 *      4 4
 *      1 1 2 3
 *      2 1 1 2
 *      3 1 2 1
 *      1 1 2 1
 *
 */