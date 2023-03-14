package solved.leetcode.code_january

fun main() {

    val array = arrayListOf(-3,4,3,90)
    val target = 0

    findTwoSum(array, target).map { print("$it ") }

}

fun findTwoSum(nums: ArrayList<Int>, target: Int): IntArray {

    var indexOne = 0
    var indexTwo = 0

    for (i in nums.indices) {
        
        if (target < nums[i] && target > 0) continue
        val findTwo = target - nums[i]

        for (j in nums.indices) {
            if (j == i) continue

            if (findTwo == nums[j]) {
                indexOne = i

                indexTwo = j
                break
            }

        }

    }

    return intArrayOf(indexOne, indexTwo)

}

