package unsolved

fun main() {

//    val intervals = arrayOf(
//        intArrayOf(1, 2),
//        intArrayOf(3, 5),
//        intArrayOf(6, 7),
//        intArrayOf(8, 10),
//        intArrayOf(12, 16),
//    )
    val intervals = arrayOf(
        intArrayOf(1, 5),
        intArrayOf(6, 8),
    )

    val newInterval = intArrayOf(0, 9)
    insert(intervals, newInterval).forEach {
        print("${it.toList()} ,")
    }

}

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    val arrayInts = mutableListOf<IntArray>()

    var isAdded = false

    var visitedIndex = -1

    for (i in intervals.indices) {
        if (i <= visitedIndex) {
            continue
        }

        if (isAdded) {
            arrayInts.add(intervals[i])
        } else {

            if (newInterval[0] <= intervals[i][1]) {
                isAdded = true
                val a = if (newInterval[0] < intervals[i][0]) newInterval[0] else intervals[i][0]
                val pairBI = getValueB(intervals, newInterval[1], i)
                val b = pairBI.first
                visitedIndex = pairBI.second
                arrayInts.add(intArrayOf(a, b))

            } else {
                arrayInts.add(intArrayOf(intervals[i][0], intervals[i][1]))

            }

        }

    }

    if (!isAdded) {
        arrayInts.add(intArrayOf(newInterval[0], newInterval[1]))
    }


    return arrayInts.toTypedArray()

}

fun getValueB(intervals: Array<IntArray>, b: Int, index: Int): Pair<Int, Int> {
    var ans = b
    var ind = index

    for (i in index until intervals.size) {
        if (b < intervals[i][1]) {
            if (b >= intervals[i][0]) {
                ans = intervals[i][1]
                ind = i
                break
            } else {
                ans = b
                ind = i

            }
        }
    }

    return Pair(ans, ind)

}
