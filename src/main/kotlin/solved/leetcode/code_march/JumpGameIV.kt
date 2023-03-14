package solved.leetcode.code_march

import java.util.LinkedList

/**
 *  Problem = 43
 *
 *  *** Jump Game IV
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */
fun main() {

    val arr = intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)

    println("ans => ${minJumps(arr)}")

}

fun minJumps(arr: IntArray): Int {
    val n = arr.size

    if (n == 1) return 0

    // key = valueInt , value = listOfIndexWhere valueInt Present
    val map = hashMapOf<Int, MutableList<Int>>()
    for (i in arr.indices) {
        map.computeIfAbsent(arr[i]) { mutableListOf() }.add(i)
    }

    var steps = 0

    val queue = LinkedList<Int>()
    queue.offer(0)

    while (queue.isNotEmpty()) {
        steps++
        val size = queue.size

        for (i in 0 until size){
            val j = queue.poll()

            // Jump to i - 1
            if (j - 1 > 0 && map.containsKey(arr[j - 1])){
                queue.offer(j - 1)
            }

            // Jump to i + 1
            if (j + 1 < n && map.containsKey(arr[j + 1])) {
                if (j + 1 == n - 1) return steps
                queue.offer(j + 1)
            }

            // Jump to arr[j] == arr[i]
            if (map.containsKey(arr[j])){
                map[arr[j]]!!.forEach {k ->
                    if (k != j) {
                        if (k == n - 1) return steps
                        queue.offer(k)
                    }
                }
            }

            map.remove(arr[j])
        }

    }

    return steps
}