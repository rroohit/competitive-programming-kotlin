package solved.leetcode.code_january


/**
 *  Problem = 27
 *
 *  *** Roman To Integer (leetcode)
 *
 *  # Intuition:
 *          - Create hashmap for roman values compare with given string and replace the ans
 *
 *  # Approach :
 *         - Depending on has map values in given roman string while comparing most important is the next char of for i^th
 *           value depending on each char next char Addition or Subtraction is done and added to answer
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *          n - length of roman string
 *
 *      - Space complexity: O(1)
 *          depending on char status only one operation is done on each iteration
 *
 *
 * # Code =>
 */
fun main() {

    val roman = "MCMXCIV"     // = 1994
//    val roman = "IIIIV"         // = 7

    println(romanToInt(roman))

}

fun romanToInt(s: String): Int {
    var ans = 0

    val romanValue = hashMapOf<Char, Int>()
    romanValue['I'] = 1
    romanValue['V'] = 5
    romanValue['X'] = 10
    romanValue['L'] = 50
    romanValue['C'] = 100
    romanValue['D'] = 500
    romanValue['M'] = 1000

    var visitedIndex = -1

    for (i in s.indices) {
        if (i == visitedIndex) {
            continue
        }

        if (i + 1 < s.length) {

            if (romanValue[s[i]]!! > romanValue[s[i + 1]]!!) {
                ans += romanValue[s[i]]!!
            } else if (romanValue[s[i]]!! == romanValue[s[i + 1]]!!) {
                ans += romanValue[s[i]]!!
            } else {
                ans += (romanValue[s[i + 1]]!! - romanValue[s[i]]!!)
                visitedIndex = i + 1
            }

        } else {
            ans += romanValue[s[i]]!!
        }

    }

    return ans

}