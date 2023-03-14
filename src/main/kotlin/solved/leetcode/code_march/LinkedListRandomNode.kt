package solved.leetcode.code_march

/**
 *  Problem = 50
 *
 *  *** Linked List Random Node
 *
 *  # Intuition :
 *
 *
 *  # Approach :
 *          First will create list from given linked list with linked list values
 *            And will find random number from created list.
 *
 *  # Complexity
 *
 *          - Time complexity : O(n)
 *          - Space complexity : O(n)
 *
 * 
 *
 * # Code =>
 */

fun main() {

    val head = ListNode(3)
    val node2 = ListNode(2)
    val node3 = ListNode(0)
    val node4 = ListNode(-4)
    val node5 = ListNode(-1)
    val node6 = ListNode(47)

    head.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = null

    val solution = Solution(head)

    println("ans => ${solution.getRandom()}")
    println("ans => ${solution.getRandom()}")
    println("ans => ${solution.getRandom()}")

}

class Solution(head: ListNode?) {

    private var head1 = head
    val list = mutableListOf<Int>()

    fun getRandom(): Int {
        if (list.isEmpty()) {
            while (head1 != null) {
                list.add(head1!!.`val`)
                head1 = head1?.next
            }
        }
        return list.random()

    }

}
