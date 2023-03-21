package solved.leetcode.code_march

/**
 *  Problem = 66
 *
 *  *** Number Of Zero Filled Sub Array
 *
 *  # Intuition
 *          Just find the sum of sequenced zero using formula
 *              sum = n * (n + 1) / 2
 *
 *            n = number of sequenced zero's in array count
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5, 0, 0, 0, 9, 0, 0, 0, 0)

    println("ans => ${zeroFilledSubarray(nums)}")

}

fun zeroFilledSubarray(nums: IntArray): Long {
    var ans = 0L
    var count = 0L
    for (i in nums) {
        if (i == 0) {
            count++
        } else  {
            count = 0
        }
        ans += count
    }

    return ans

}


fun zeroFilledSubarray2(nums: IntArray): Long {

    val size = nums.lastIndex
    var r = 0
    var ans = 0L


    while (r <= size) {

        if (nums[r] == 0) {
            var a = r
            while (a <= size && nums[a] == 0) {
                a++
            }
            val n = (a.toLong() - (r))
            val s = (n * (n + 1)) / 2
            ans += s
            r = a
            continue
        }
        r++

    }

    return ans
}