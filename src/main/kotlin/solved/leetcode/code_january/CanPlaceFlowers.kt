package solved.leetcode.code_january

/**
 *  Problem = 65
 *
 *  *** Can Place Flowers
 *
 *  # Intuition
 *      while iterating through given flowerbed array will consider following base case
 *      There will be three base case
 *          1. for index one we can insert the if it is 0 and very next to is empty plot or if is only plot in array
 *          2. while iterating middle plots we check whether its empty plot if is empty flot we will check is its adjacent are empty or not if yes will add flower
 *          3. for last two index has the empty plot we can add the flower there
 *
 *       will update the given array while iterating through array so need to create new map to track the inserted plots
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(1)
 *          No extra space where used
 *
 *
 * # Code =>
 */

fun main() {

    val flowerbed = intArrayOf(1, 0, 0)
    val n = 1

    println("ans => ${canPlaceFlowers(flowerbed, n)}")


}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {

    var flowers = n

    for (i in flowerbed.indices) {
        val plot = flowerbed[i]

        // For index one
        if (i == 0) {
            if (plot == 0 && flowerbed.size <= 1) return true
            if (plot == 0 && flowerbed[1] == 0) {
                flowers--
                flowerbed[i] = 1
            }
            continue
        }

        // for last index
        if (i == flowerbed.size - 1) {
            if (plot == 0 && flowerbed[i - 1] == 0) {
                flowers--
            }
            continue
        }

        // remaining excluding index 0 and last
        if (plot == 0) {
            val lPlot = flowerbed[i - 1]
            val rPlot = flowerbed[i + 1]
            if (lPlot == 0 && rPlot == 0) {
                flowers--
                flowerbed[i] = 1
            }
        }

    }

    return flowers <= 0

}