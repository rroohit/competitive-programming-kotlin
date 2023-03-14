package solved.leetcode.code_january

import data_structures.linked_list.LinkedList
import data_structures.linked_list.ListNode


/**
 *  Problem = 20
 *
 *  *** Reverse Link List (leetcode)
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

    val linkedList = LinkedList<Int>()

    linkedList.addFirst(3)
        .addFirst(2)
        .addFirst(0)
        .addFirst(-4)

//    println(linkedList)
//    println(reverseList(linkedList.nodeAt(-1)))

}

fun reverseList(head: ListNode<Int>?): ListNode<Int>? {
    var prev : ListNode<Int>? = null
    var current = head

    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }

    return prev

}

