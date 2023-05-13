package solved.leetcode.code_may

fun main() {

    val low = 3
    val high = 3
    val zero = 1
    val one = 1

    println("Ans => ${countGoodStrings(low, high, zero, one)}")

}

fun countGoodStrings(low: Int, high: Int, zero: Int, one: Int): Int {
    val mod: Long = 1000000007

    val map = mutableMapOf<Int, Long>()

    fun dfs(len: Int): Long {
        if (len > high) return 0

        if (map.containsKey(len)) return map[len]!!

        map[len] = if (len >= low) 1 else 0
        val count = dfs(len + zero) + dfs(len + one)
        map[len] = map[len]!! + count

        return (map[len]!! % mod)

    }

    return dfs(0).toInt()
}