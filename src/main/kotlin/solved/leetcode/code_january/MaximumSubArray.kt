package solved.leetcode.code_january

import java.lang.Integer.MIN_VALUE

/**
 *  *** Largest Sum Contiguous Sub-array using = Kadane’s Algorithm
 *
 *  # Intuition
 *      - Tried with Divide and Conquer but failed for reaching time out exception
 *
 *      - Finally solved using the Kadane's Algorithm
 *          (https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm)

 *
 *  # Approach
 *
 *
 *  # Complexity
 *       Time complexity: O(n)
 *          n - length of an Array
 *
 *
 *  Space complexity:
 *      Space complexity: O(1)
 *          - Same variables going to reuse for each for loop iteration
 *
 */
fun main() {

    val array1 = listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val array2 = listOf(3, -2, -3, -3, 1, 3, 0)
    val array3 = listOf(-1,0)

    println(getMaxSum(array1))
    println(getMaxSum(array2))
    println(getMaxSum(array3))


}

fun getMaxSum(nums: List<Int>): Int {
    if (nums.size == 1) return nums[0]


    var lowSum = MIN_VALUE //Lowest int value if the array has only negative number

    var maxSum = 0
    var currentSum = 0

    for (i in nums.indices) {
        currentSum += nums[i]

        if (currentSum > maxSum) maxSum = currentSum

        if (currentSum > lowSum) lowSum = currentSum

        if (currentSum < 0) { currentSum = 0 }


    }
    return if (maxSum == 0) lowSum else maxSum


}







//For big size array following exceeding time limit..
fun getMax(nums: List<Int>): Int {
    if (nums.size == 1) return nums[0]

    val listAnsLeft = arrayListOf<Int>()
    val listAnsRight = arrayListOf<Int>()
    val midIndex = nums.size / 2

    val listOne = arrayListOf<Int>()
    for (l in 0 until midIndex) {
        listOne.add(nums[l])
    }

    val listTwo = arrayListOf<Int>()
    for (l in midIndex until nums.size) {
        listTwo.add(nums[l])
    }


    for (i in listOne.indices) {
        if (i == 0) {
            listAnsLeft.add(listOne.last())
        } else {
            val sum = listOne[listOne.lastIndex - i] + listAnsLeft.last()
            listAnsLeft.add(sum)

        }


    }

    println(listOne)

    for (i in listTwo.indices) {
        if (i == 0) {
            listAnsRight.add(listTwo.first())
        } else {

            val sum = listTwo[i] + listAnsRight.last()

            listAnsRight.add(sum)

        }

    }


    val x = nums.sorted().last()


    listAnsLeft.sort()
    listAnsRight.sort()

    return if (listAnsLeft.last() > 0 && listAnsRight.last() > 0) {
        if (x > (listAnsLeft.last() + listAnsRight.last())) {
            x
        } else {
            val a = (listAnsLeft.last() + listAnsRight.last())
            a
        }
    } else {
        if (listAnsLeft.last() < listAnsRight.last()) {
            if (x > listAnsRight.last()) {
                x
            } else {
                listAnsRight.last()

            }
        } else if (listAnsRight.last() < listAnsLeft.last()) {
            if (x > listAnsLeft.last()) {
                x
            } else {
                listAnsLeft.last()

            }
        } else {
            0
        }
    }

}

