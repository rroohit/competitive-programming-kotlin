package solved.leetcode.code_january

fun main() {

    val s = "aab"

    println(partition(s))

}
fun partition(s: String): List<List<String>> {
    val ans = mutableListOf<List<String>>()

    val part = mutableListOf<String>()

    for (i in s.indices) {
        part.add(s[i].toString())
    }
    ans.add(part)

    return ans

}

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}