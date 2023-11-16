package solved.leetcode.code_november


/**
 *  Problem = 94
 *
 *  *** Find Unique Binary String
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(nlogn)
 *
 *      - Space complexity: O(1)
 *
 * # Code =>
 */
fun main() {

    val nums = arrayOf("111", "011", "001")

    val ans = findDifferentBinaryString(nums)

    println("Ans ==> $ans")

}

fun findDifferentBinaryString(nums: Array<String>): String {
    for (i in nums.indices) {
        val currStr = nums[i]
        val ch = if (currStr[i] == '0') '1' else '0'

        var newStr = ""

        for (j in currStr.indices) {
            val oldCh = currStr[j]
            newStr += if (j == i) {
                ch
            } else {
                oldCh
            }
        }

        if (!nums.contains(newStr)) return newStr
    }

    return "0"
}