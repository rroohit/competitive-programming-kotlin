package solved.leetcode.code_january

/**
 *  *** Best Time To Buy And Sell Stock
 *
 *  # Intuition
 *
 *  # Approach
 *
 *
 *  # Complexity
 *       Time complexity: O(n)
 *          n - size of an array
 *
 *
 *  Space complexity:
 *      Space complexity: O(1)
 *
 *
 */
fun main() {

    val stockPrice = arrayListOf(7,1,5,3,6,4)

    println(buyAndSellStock(stockPrice.toIntArray()))

}

fun buyAndSellStock(prices:IntArray): Int {

    var profit = 0
    var buyStock = prices[0]
    var sellStock = 0

    for (i in prices.indices) {
        if (i == 0 ) continue
        if (buyStock > prices[i] ) {

            buyStock  = prices[i]

        } else {
            sellStock = prices[i]

            if (profit < (sellStock - buyStock)) {

                profit = sellStock - buyStock
            }
        }

    }

    return profit

}