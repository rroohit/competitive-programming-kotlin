package solved.leetcode.code_november

/**
 *  Problem = 92
 *
 *  *** Unique Length-3 Palindromic Subsequences
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */

fun main() {

    val s = "bbcbaba"

    val ans = countPalindromicSubsequence(s)

    println("Ans ==> $ans")

}

fun countPalindromicSubsequence(s: String): Int {
    val first = IntArray(26) { -1 }
    val last = IntArray(26) { -1 }
    var res = 0

    for (i in s.indices) {
        if (first[s[i].code - 'a'.code] == -1) {
            first[s[i].code - 'a'.code] = i
        }
        last[s[i].toInt() - 'a'.toInt()] = i
    }

    for (i in 0 until 26) {
        if (first[i] == -1) continue

        val set = mutableSetOf<Char>()
        for (j in first[i] + 1 until last[i]) {
            set.add(s[j])
        }
        res += set.size
    }

    return res
}

fun countPalindromicSubsequence3(s: String): Int {
    val charMap = mutableMapOf<Char, Pair<Int, Int>>()
    for (i in 'a'..'z') {
        charMap[i] = Pair(-1, -1)
    }

    var l = 0
    var r = s.length - 1
    while (l < s.length && r > -1) {
        val chL = s[l]
        val chR = s[r]
        if (charMap[chL]!!.first == -1) {
            charMap[chL] = Pair(l, charMap[chL]!!.second)
        }

        if (charMap[chR]!!.second == -1) {
            charMap[chR] = Pair(charMap[chR]!!.first, r)
        }

        l++
        r--
    }

    var ans = 0

    charMap.forEach { (t, u) ->
        val a = u.first
        val b = u.second

        if (a != b && a >= 0 && b >= 0) {
            val subStr = s.substring(a + 1, b).toSet()
            ans += subStr.size

        }

    }

    return ans
}


fun countPalindromicSubsequence2(s: String): Int {
    val result = mutableSetOf<String>()

    val len = s.length

    for (i in s.indices) {
        if ((len - i) < 3) break
        val s1 = s[i]

        for (j in i + 1 until s.length) {
            val s2 = s[j]

            for (k in j + 1 until s.length) {
                val s3 = s[k]
                val ss = "$s1$s2$s3"

                if (result.contains(ss)) continue
                if (isPalindromeI(ss)) {
                    result.add(ss)
                }

            }
        }

    }

    println(result)

    return result.size
}

fun isPalindromeI(s: String): Boolean {
    val ss = s.reversed()
    return (s == ss)
}










