package solved.leetcode.code_march

/**
 *  Problem = 56
 *
 *  *** Add Two Numbers
 *
 *  # Intuition
 *          As given linked list in reverse order while visiting each node we calculate sum from each node respectively
 *          and if there carry we pass to next sum and so on
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

    // l1 = [2,4,3], l2 = [5,6,4]

    val node1 = ListNode(2)
    val node2 = ListNode(4)
    val node3 = ListNode(3)

    node1.next = node2
    node2.next = node3
    node3.next = null


    val node4 = ListNode(5)
    val node5 = ListNode(6)
    val node6 = ListNode(4)

    node4.next = node5
    node5.next = node6
    node6.next = null

    var addTwoNumber = addTwoNumbers(node1, node4)
    while (addTwoNumber != null) {
        print("${addTwoNumber.`val`} -> ")
        addTwoNumber = addTwoNumber.next
    }

}


fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val head = ListNode(0)
    var curr = head

    var carry = 0

    var lONe = l1
    var lTwo = l2

    while (lONe != null || lTwo != null || carry > 0) {
        val v1 = lONe?.`val` ?: 0
        val v2 = lTwo?.`val` ?: 0

        val sum = v1 + v2 + carry

        val `val` = sum % 10
        carry = sum / 10

        lONe = lONe?.next

        lTwo = lTwo?.next

        curr.next = ListNode(`val`)
        curr = curr.next!!

    }

    return head.next

}