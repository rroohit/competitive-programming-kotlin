package solved.practice

import kotlin.math.abs

fun main() {

    val a = 6
    val z = 3

    val aTen = findTen(a)
    val zTen = findTen(z)

    if (aTen.toString().length > zTen.toString().length) {
        val newValue = addNine(zTen, aTen.toString().length)
        val add = abs(a + newValue)
        val ans = removeExtraOne(add)
        println(ans)

    } else if (aTen.toString().length < zTen.toString().length) {
        val newValue = addNine(aTen, zTen.toString().length)
        val add = abs(abs(z + newValue))
        val ans = removeExtraOne(add)
        println(ans)

    } else {
        val add = abs(abs(a + zTen))
        val ans = removeExtraOne(add)
        println(ans)
    }


}

fun removeExtraOne(add: Int): Any {
    val ans = add.toString().toMutableList()
    ans.removeAt(0)
    return if (ans.joinToString("").isNotEmpty()) ans.joinToString("").toInt() else 1
}

fun addNine(zTen: Int, r: Int): Int {
    val ans = zTen.toString().toMutableList()
    for (i in 1 until r) {
        ans.add(0, '9')
    }
    return ans.joinToString("").toInt()
}

fun findTen(num: Int): Int {

    var x = 0
    var n = num
    val len = num.toString().length

    val tenValue = getTen(len)

    while (true) {
        x++
        n++
        if (n == tenValue)
            break

    }
    return x

}

fun getTen(len: Int): Int {
    val ans = arrayListOf(1)
    for (i in 1..len) {
        ans.add(0)
    }
    return ans.joinToString("").toInt()
}
