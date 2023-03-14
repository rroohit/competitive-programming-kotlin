package solved.leetcode.code_march

/**
 *  Problem = 49
 *
 *  *** Linked List Cycle II
 *
 *  # Intuition :
 *
 *
 *  # Approach :
 *
 *  # Complexity
 *          1 -
 *          - Time complexity : O(n)
 *          - Space complexity : O(1)
 *
 *          2 -
 *          - Time complexity : O(n)
 *          - Space complexity : O(n)
 *
 *
 * # Code =>
 */

fun main() {

//    head = [3,2,0,-4], pos = 1
    val head = ListNode(3)
    val node2 = ListNode(2)
    val node3 = ListNode(0)
    val node4 = ListNode(-4)

    head.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node2

    val ans = detectCycle(head)
    ans?.let {
        println("Tail connects to node value => ${it.`val`}")

    } ?: run {
        println("No cycle")

    }


}

fun detectCycle(head: ListNode?): ListNode? {
    if (head == null) return null
    if (head.next == null) return null

    var entry = head
    var slow = head
    var fast = head

    while (slow != null && fast != null) {
        slow = slow.next
        fast = fast.next?.next

        if (slow == fast) {
            while (entry != slow) {
                entry = entry!!.next
                slow = slow!!.next
            }
            return slow

        }

    }

    return null
}


// The Time complexity of this is O(n) we may have traverse all the linked list
// It takes O(n) space as we are creating set for each node it may take to store all elements
fun detectCycleTwo(head: ListNode?): ListNode? {
    if (head == null) return null
    if (head.next == null) return null

    var slow = head.next

    val set = mutableSetOf<ListNode>()

    while (slow != null) {
        if (set.contains(slow)) {
            return slow
        }
        set.add(slow)
        slow = slow.next
    }

    return null
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}