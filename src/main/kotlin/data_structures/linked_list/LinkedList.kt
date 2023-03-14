package data_structures.linked_list

class LinkedList<T> {
    private var head: ListNode<T>? = null
    private var size: Int = 0



    /**
     *  Method to add new node to singly linked list at head to create new node with given value then
     *  it makes the new node the new head of the list.
     *
     *  @param value Type T to add at first index in list
     *
     */
    fun addFirst(value: T): LinkedList<T> = apply {
        val newListNode = ListNode(value)
        newListNode.next = head
        head = newListNode
        size++
    }


    /**
     *  Method to add new node to singly linked list at last to create new node with given value
     *
     *  @param value Type T to add at first index in list
     *
     */
    fun addLast(value: T) {
        val newListNode = ListNode(value)
        if (isEmpty()) {
            head = newListNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newListNode

        }
        size++
//
//        Alternative =>
//        fun addLast(value: T) {
//            addAt(size, value)
//        }
    }


    /**
     *  Method is used to add new node to specific position in singly linked list
     *
     *  @param index  position in the list where the new node should be inserted
     *  @param value  value of new node
     *
     */
    fun addAt(index: Int, value: T) {
        if (index < 0 || index > size) {
            throw IndexOutOfBoundsException()
        }
        val newListNode = ListNode(value)
        if (index == 0) {
            newListNode.next = head
            head = newListNode
        } else {
            var current = head
            for (i in 0 until index - 1) {
                current = current?.next
            }
            newListNode.next = current?.next
            current?.next = newListNode
        }
        size++
    }

    /**
     *  removeFirst() method, which is used to remove the first node (also known as head) of the list.
     *
     *
     */
    fun removeFirst() {
        if (isEmpty()) {
            throw NoSuchElementException("List is empty")
        }
        head = head?.next
        size--
    }

    /**
     *  The removeByValue() method is useful when you need to remove a specific item from the list.
     *
     *  @param value value which has to be removed
     *
     */
    fun removeByValue(value: T) {
        var current = head
        var previous: ListNode<T>? = null
        var isRemoved = false
        while (current != null) {
            if (current.value == value) {
                if (previous != null) {
                    previous.next = current.next
                } else {
                    head = current.next
                }
                size--
                isRemoved = true
                break
            }
            previous = current
            current = current.next
        }
        if (!isRemoved) throw Exception("Item not found in the list")
    }


    /**
     *  The removeAt() method is used to remove a node from a specific position in a singly linked list
     *
     *  @param index position of removing value
     */
    fun removeAt(index: Int): T {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException()
        }
        var current = head
        var previous: ListNode<T>? = null
        for (i in 0 until index) {
            previous = current
            current = current?.next
        }
        if (previous != null) {
            previous.next = current?.next
        } else {
            head = current?.next
        }
        size--
        return current?.value!!
    }

    /**
     *   The removeLast() method is used to remove the last node of the singly linked list.
     *
     */
    fun removeLast() {
        if (isEmpty()) {
            throw NoSuchElementException("List is empty")
        } else if (head?.next == null) {
            head = null
        } else {
            var current = head
            while (current?.next?.next != null) {
                current = current.next
            }
            current?.next = null
        }
        size--
    }

    /**
     *  Is useful in cases where you need to retrieve a specific value form the list
     *  Without modifying the list. To look up a specific item in the list based on its index.
     *
     *  @param index = retrieve the value of a node at a specific index in the list
     *
     */
    fun get(index: Int): T {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException()
        }
        var current = head
        for (i in 0 until index) {
            current = current?.next
        }
        return current?.value!!
    }

    /**
     *  set() method is used to change the value of a node at a specific index in the singly linked list.
     *  The method takes two parameters, an integer index and a value of type T
     *
     *  @param index an integer index.
     *  @param value value parameter represents the new value to be assigned to the node.
     *
     */
    fun set(index: Int, value: T) {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException()
        }
        var current = head
        for (i in 0 until index) {
            current = current?.next
        }
        current?.value = value
    }

    /**
     *  The method is used to check if a singly linked list contains a specific value. T
     *
     *  @param value value to be searched for
     */
    fun hasValue(value: T): Boolean {
        var current = head
        while (current != null) {
            if (current.value == value) {
                return true
            }
            current = current.next
        }
        return false
    }


    /**
     *  method to keep track of the number of occurrences and return the number of occurrences.
     *
     *  @param value give the value which has to check number of times present in list
     *
     */
    fun occurrencesOf(value: T): Int {
        var current = head
        var count = 0
        while (current != null) {
            if (current.value == value) count++
            current = current.next
        }
        return count
    }


    /**
     *  The size property is a property of a singly linked list class, it represents the number of elements in the list
     */
    fun size(): Int {
        return size
    }

    /**
     *  To check is list empty
     */
    fun isEmpty(): Boolean {
        return size == 0
    }
}