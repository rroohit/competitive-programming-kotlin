package solved.leetcode.code_november

fun main() {

    val arr = intArrayOf(2, 1, 3, 5, 4, 6, 7)
    val k = 2

    val ans = getWinner(arr, k)
    println("Ans ==> $ans")

}

fun getWinner(arr: IntArray, k: Int): Int {
    var win = arr[0]
    var c = 0

    for (i in 1 until arr.size) {
        val x = arr[i]
        if (x > win) {
            win = x
            c = 1
        } else {
            c += 1
        }
        if (c == k) {
            return win
        }
    }

    return win
}