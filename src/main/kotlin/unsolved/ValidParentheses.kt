package unsolved


fun main() {

    val parentheses = "()()[]"

    println(isValid(parentheses))

}

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false

    val braces: MutableMap<Char, Int> = HashMap()
    braces['('] = 0
    braces[')'] = 0
    braces['['] = 0
    braces[']'] = 0
    braces['{'] = 0
    braces['}'] = 0


    s.forEach {
        val a = braces[it]!!
        braces[it] = a + 1
    }

    return braces['('] == braces[')'] && braces['['] == braces[']'] && braces['{'] == braces['}']
}