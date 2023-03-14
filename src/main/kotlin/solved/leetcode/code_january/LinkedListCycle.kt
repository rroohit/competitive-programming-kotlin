package solved.leetcode.code_january

import data_structures.linked_list.LinkedList
import data_structures.linked_list.ListNode

/**
 *  Problem = 14
 *
 *  *** Linked List Cycle (leetcode)
 *
 *  # Intuition
 *  # Approach :
 *      - iterating the list with two point
 *          one with one step and other one with two-step
 *          if list is cycle eventually both points will meet at one point where we can say the list is cycle
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

    val linkedList = LinkedList<Int>()

    linkedList.addFirst(3)
        .addFirst(2)
        .addFirst(0)
        .addFirst(-4)


//    println(hasCycle(linkedList.get(-1)))


}

fun hasCycle(head: ListNode<Int>?): Boolean {
    if (head == null) return false
    if (head.next == null) return false

    var slow = head.next
    var fast = head.next!!.next

    while (slow != null && fast != null) {
        if (slow == fast) {
            return true

        }
        slow = slow.next
        fast = fast.next?.next
    }

    return false

}

