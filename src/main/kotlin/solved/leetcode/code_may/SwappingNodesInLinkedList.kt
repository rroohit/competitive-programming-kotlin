package solved.leetcode.code_may

/**
 *  Problem = 80
 *
 *  *** Swapping Nodes in Linked List
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *
 *      - Space complexity: O(?)
 *
 *
 * # Code =>
 */
fun main() {

    val k = 3

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

    var currNode: ListNode? = swapNodes(node1, k)
    print("Ans   => ")
    while (currNode != null) {
        print("${currNode.`val`} ${if (currNode.next != null) "->" else ""} ")
        currNode = currNode.next
    }

}

fun swapNodes(head: ListNode?, k: Int): ListNode? {
    var curr = head
    for (i in 1 until k) {
        curr = curr!!.next
    }

    val left = curr
    var right = head

    while (curr?.next != null) {
        curr = curr.next
        right = right!!.next

    }

    val temp = left!!.`val`
    left.`val` = right!!.`val`
    right.`val` = temp

    return head
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}