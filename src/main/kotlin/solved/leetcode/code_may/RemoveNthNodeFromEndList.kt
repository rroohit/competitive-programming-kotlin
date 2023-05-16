package solved.leetcode.code_may

/**
 *  Problem = 81
 *
 *  *** Remove Nth node from end in linked list
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(?)
 *
 *
 *      - Space complexity: O(?)
 *
 *
 * # Code =>
 */
fun main() {

    val k = 5

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

    var currNode: ListNode? = removeNthFromEnd(node1, k)
    print("Ans   => ")
    while (currNode != null) {
        print("${currNode.`val`} ${if (currNode.next != null) "->" else ""} ")
        currNode = currNode.next
    }

}

// unsolved
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

    var curr = head
    for (i in 1 until n) {
        curr = curr!!.next
    }

    var left = head

    while (curr?.next != null) {
        curr = curr.next
        left = left!!.next

    }

    val right = left?.next?.next

    left!!.next = right

    return head
}

