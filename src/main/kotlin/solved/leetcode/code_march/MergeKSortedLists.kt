package solved.leetcode.code_march

/**
 *  Problem = 54
 *
 *  *** Merge K Sorted Lists
 *
 *  # Intuition
 *          From given list of linked list we will create new array list with it values
 *          By iterating through the list, and it linked list
 *
 *          And from the created list we sort the list first and from sorted list
 *          Will create new lined list
 *
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n*m)
 *          - n list of linked list length
 *          - m each linked list length
 *
 *      - Space complexity: O(n)
 *
 *
 * # Code =>
 */

fun main() {

    //[[1,4,5],[1,3,4],[2,6]]

    val node1 = ListNode(1)
    val node2 = ListNode(4)
    val node3 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = null


    val node4 = ListNode(1)
    val node5 = ListNode(3)
    val node6 = ListNode(4)

    node4.next = node5
    node5.next = node6
    node6.next = null

    val node7 = ListNode(2)
    val node8 = ListNode(6)

    node7.next = node8
    node8.next = null

    val lists = arrayOf(node1, node4, node7, null)

    var ans = mergeKLists(lists)

    while (ans != null) {
        print(" -> ${ans.`val`}")
        ans = ans.next
    }

}

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val arr = mutableListOf<Int>()

    lists.forEach {
        var head = it
        while (head != null) {
            arr.add(head.`val`)
            head = head.next
        }
    }
    if (arr.isEmpty()) return null
    arr.sort()


    val head = ListNode(arr[0])
    var currentNode = head

    for (i in 1 until arr.size) {
        val newNode = ListNode(arr[i])
        currentNode.next = newNode
        currentNode = newNode
    }



    return head

}