package solved.leetcode.code_march

/**
 *  Problem = 55
 *
 *  *** Swap Nodes In Pairs
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(m)
 *
 *
 * # Code =>
 */

fun main() {

    // [1,2,3,4]
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = null

    var ans = swapPairs(node1)
    while (ans != null) {
        print("${ans.`val`} -> ")
        ans = ans.next
    }

}

fun swapPairs(head: ListNode?): ListNode? {
    if (head == null) return null
    if (head.next == null) return head

    val newHead = head.next
    var prev: ListNode? = null
    var current = head

    while (current?.next != null) {
        val next = current.next
        current.next = next!!.next
        next.next = current
        prev?.next = next
        prev = current
        current = current.next
    }
    return newHead
}