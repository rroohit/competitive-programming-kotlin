package solved.leetcode.code_may

/**
 *  Problem = 82
 *
 *  *** Maximum Twin Sum Of a LinkedList
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

    val node = ListNode(1)

    var curr = node
    for (i in 2..10) {
        val num = (2..10).random()
        curr.next = ListNode(num)
        curr = curr.next!!
    }

    var givenNode: ListNode? = node
    print("Given => ")
    while (givenNode != null) {
        print("${givenNode.`val`} ${if (givenNode.next != null) "->" else ""} ")
        givenNode = givenNode.next
    }

    println()
    println("Ans => ${pairSum(node)}")

}

fun pairSum(head: ListNode?): Int {
    val list = mutableListOf<Int>()
    var ans = 0

    var curr: ListNode? = head
    while (curr != null) {
        list.add(curr.`val`)
        curr = curr.next
    }

    var left = 0
    var right = list.lastIndex

    while (left < right) {
        ans = maxOf((list[left] + list[right]), ans)
        left++
        right--
    }


    return ans
}