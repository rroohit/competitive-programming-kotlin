package solved.leetcode.code_december

/**
 *  Problem = 125
 *
 *  *** Maximum Product Difference Between Two Pairs
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: (n)
 *
 *      - Space complexity: (1)
 *
 * # Code =>
 */
fun main() {

    //val nums = intArrayOf(4, 2, 5, 9, 7, 4, 8)
    val nums = intArrayOf(5, 6, 2, 7, 4)
//    val nums = intArrayOf(1, 6, 7, 5, 2, 4, 10, 6, 4)
    println(nums.sorted().toList())

    val ans = maxProductDifference(nums)

    println("Ans ==> $ans")

}

fun maxProductDifference(nums: IntArray): Int {
    var a = Int.MAX_VALUE
    var b = nums[0]
    var c = Int.MIN_VALUE
    var d = nums[0]


    for (j in 1 until nums.size) {
        val i = nums[j]
        if (i < a) {
            if (i < b) {
                a = b
                b = i
            } else {
                a = i
            }

        }
        if (i > c) {
            if (i > d) {
                c = d
                d = i
            } else {
                c = i
            }
        }
    }

    println("$a * $b - $c * $d")

    return ((c * d) - (a * b))
}