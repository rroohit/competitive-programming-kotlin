package solved.leetcode.code_january

import data_structures.linked_list.LinkedList
import data_structures.linked_list.ListNode

/**
 *  Problem = 17
 *
 *  *** Remove Linked List Elements (leetcode)
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(1)
 *
 *
 * # Code =>
 */
fun main() {

    val linkedList1 = LinkedList<Int>()

    linkedList1.addFirst(2)
        .addFirst(3)
        .addFirst(5)
        .addFirst(5)
        .addFirst(5)
        .addFirst(4)
        .addFirst(8)

//    println(removeElements(linkedList1.get(-1), 5))

}

fun removeElements(list1: ListNode<Int>?, `val`: Int): ListNode<Int>? {
    if (list1 == null) return null

    val result = ListNode(value = -1)

    var prev = result
    var current = list1

    while (current != null) {
        val nxt = current.next
        if (current.value == `val`) {
            prev.next = nxt
        } else {
            prev = current
        }

        current = nxt
    }

    return result.next

}