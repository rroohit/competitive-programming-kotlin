package data_structures.tree


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun traversing() {
    val node = TreeNode(4)
    val node2 = TreeNode(8)
    val node3 = TreeNode(5)
    val node4 = TreeNode(0)
    val node5 = TreeNode(1)
    val node6 = TreeNode(6)


    node.left = node2
    node.right = node3

    node2.left = node4
    node2.right = node5

    node3.left = null
    node3.right = node6

    println()

    println("PreOrder Traversal ")
    preOrderTravers(node)

    println()
    println("")
    println("PostOrder Traversal ")
    postOrderTravers(node)

    println()
    println("")
    println("InOrder Traversal ")
    inOrderTravers(node)

    println()

}

/// [root --> left --> right]
fun preOrderTravers(node: TreeNode?) {
    if (node == null) return
    print("(${node.`val`}) --> ")

    preOrderTravers(node.left)
    preOrderTravers(node.right)

}

/// [left --> right --> root]
fun postOrderTravers(node: TreeNode?) {
    if (node == null) return

    postOrderTravers(node.left)
    postOrderTravers(node.right)

    print("(${node.`val`}) --> ")
}

/// [left --> root --> right]
fun inOrderTravers(node: TreeNode?) {
    if (node == null) return

    inOrderTravers(node.left)
    print("(${node.`val`}) --> ")
    inOrderTravers(node.right)

}