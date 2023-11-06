package solved.leetcode.code_november

/**
 *  Problem = 86
 *
 *  *** Seat Reservation Manager
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(n)
 *
 *      - Space complexity: O(n)
 *
 * # Code =>
 */
fun main() {

    val seatManager = SeatManager(5)

    // ["SeatManager", "reserve", "reserve", "unreserved", "reserve", "reserve", "reserve", "reserve", "unreserve"]

    println("reserve ==> ${seatManager.reserve()}")
    println()

    println("reserve ==> ${seatManager.reserve()}")
    println()


    seatManager.unreserved(2)

    println("reserve ==> ${seatManager.reserve()}")
    println()

    println("reserve ==> ${seatManager.reserve()}")
    println()

    println("reserve ==> ${seatManager.reserve()}")
    println()

    println("reserve ==> ${seatManager.reserve()}")
    println()


    seatManager.unreserved(5)

}

class SeatManager(n: Int) {

    private val seats = mutableListOf(1)

    private val availSeat = mutableListOf<Int>()

    fun reserve(): Int {
        return if (availSeat.isEmpty()) {
            val a = seats.last()
            seats.add(a + 1)
            a
        } else {
            val a = availSeat.removeFirst()
            a
        }
    }

    fun unreserved(seatNumber: Int) {
        if (seatNumber < seats.last()) {
            availSeat.add(seatNumber)
            availSeat.sort()
        } else {
            seats.removeLast()
        }
    }

}