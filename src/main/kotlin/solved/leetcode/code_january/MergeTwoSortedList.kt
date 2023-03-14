package solved.leetcode.code_january

import data_structures.linked_list.LinkedList
import data_structures.linked_list.ListNode

/**
 *  Problem = 16
 *
 *  *** Merge Two Sorted List (leetcode)
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


    val linkedList2 = LinkedList<Int>()

    linkedList2.addFirst(1)
        .addFirst(4)
        .addFirst(4)


//    println(mergeTwoLists(linkedList1.get(0), linkedList2.get(0)))


}

fun mergeTwoLists(list1: ListNode<Int>?, list2: ListNode<Int>?): ListNode<Int>? {

    if (list1 == null) return list2
    if (list2 == null) return list1


    return getList(list1, list2)

}

fun getList(list1: ListNode<Int>?, list2: ListNode<Int>?): ListNode<Int>?  {
    if (list1 == null) return list2
    if (list2 == null) return list1

    val result : ListNode<Int>

    if (list1.value < list2.value) {
        result = list1
        result.next = getList(list1.next, list2)
    }else {
        result = list2
        result.next = getList(list1, list2.next)
    }

    return result

}