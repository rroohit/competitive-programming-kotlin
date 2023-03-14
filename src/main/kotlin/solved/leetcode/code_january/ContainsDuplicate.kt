package solved.leetcode.code_january

fun main() {
    val intArray = intArrayOf(1, 23, 4, 5, 8)
    println(containsDuplicates(intArray))
}

fun containsDuplicates(arrayInt: IntArray): Boolean {
    return arrayInt.distinct().size != arrayInt.size
}