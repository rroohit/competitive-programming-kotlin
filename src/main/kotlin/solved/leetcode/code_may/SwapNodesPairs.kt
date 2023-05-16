package solved.leetcode.code_may

/**
 *  Problem = 79
 *
 *  *** Swap Nodes Pairs
 *
 *  # Intuition
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

    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)
    val node6 = ListNode(6)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = null

    var givenNode: ListNode? = node1
    print("Given => ")
    while (givenNode != null) {
        print("${givenNode.`val`} ${if (givenNode.next != null) "->" else ""} ")
        givenNode = givenNode.next
    }

    println()

    var currNode: ListNode? = swapPairs(node1)
    print("Ans   => ")
    while (currNode != null) {
        print("${currNode.`val`} ${if (currNode.next != null) "->" else ""} ")
        currNode = currNode.next
    }

}

fun swapPairs(head: ListNode?): ListNode? {
    if (head == null) return null
    if (head.next == null) return head

    val temp: ListNode? = head.next

    head.next = swapPairs(head.next!!.next)
    temp!!.next = head

    return temp
}

fun swapPairs2(head: ListNode?): ListNode? {
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