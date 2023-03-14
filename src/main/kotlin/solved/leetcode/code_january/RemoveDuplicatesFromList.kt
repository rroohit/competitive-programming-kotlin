package solved.leetcode.code_january

import data_structures.linked_list.LinkedList
import data_structures.linked_list.ListNode

/**
 *  Problem = 19
 *
 *  *** Remove Duplicates From List (leetcode)
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
    val linkedList1 = LinkedList<Int>()

    linkedList1.addFirst(2)
        .addFirst(3)
        .addFirst(5)
        .addFirst(5)

//    println(deleteDuplicates(linkedList1.get(-1)))

}

fun deleteDuplicates(head: ListNode<Int>?): ListNode<Int>? {

    if (head == null) return null


    var current = head


    while (current != null) {

        while(current.next != null && current.next!!.value  == current.value) {
            current.next = current.next!!.next
        }

        current = current.next

    }


    return head
}