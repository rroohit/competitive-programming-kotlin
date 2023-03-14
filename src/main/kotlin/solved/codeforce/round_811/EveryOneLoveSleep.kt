package solved.codeforce.round_811

import java.util.ArrayList
import kotlin.math.abs

/**
 * Solved =>  A. Everyone Loves to Sleep (Codeforces Round #811)
 *
 * (link - https://codeforces.com/contest/1714/problem/A)
 *
 */

fun main() {

    val testCases = readln().trim().toLong()

    for (i in 1..testCases) {
        val listOfAlarmTime = arrayListOf<AlarmTime>()

        val (n, h, m) = readln().trim().split("\\s+".toRegex()).map(String::toLong)

        for (j in 1..n) {
            val (hi, mi) = readln().trim().split("\\s+".toRegex()).map(String::toLong)
            val alarm = AlarmTime(hi, mi)
            listOfAlarmTime.add(alarm)

        }
        findSleepTime(h, m, listOfAlarmTime)

    }

}

fun findSleepTime(h: Long, m: Long, listOfAlarmTime: ArrayList<AlarmTime>) {
    val answer = arrayListOf<Long>()

    listOfAlarmTime.forEach { alarmTime ->
        val alarmMinutes = (alarmTime.hi * 60) + alarmTime.mi
        answer.add(alarmMinutes)

    }

    answer.sort()
    val bedTime = (h * 60) + m
    val firstAlarm = arrayListOf<AlarmTime>()

    answer.forEach { alarm ->
        if (bedTime < alarm) {
            val tDif = abs(alarm - bedTime)
            firstAlarm.add(AlarmTime((tDif / 60) ,(tDif % 60)))

            return@forEach

        } else if (bedTime == alarm){
            firstAlarm.add(AlarmTime((0) ,(0)))

            return@forEach

        } else {
            val t = abs(bedTime - 1440)
            val timeDiff = t + alarm
            firstAlarm.add(AlarmTime((timeDiff/60) ,(timeDiff%60)))

            return@forEach
        }
    }

    firstAlarm.sortBy { it.hi }

    println("${firstAlarm.first().hi} ${firstAlarm.first().mi}")

}

data class AlarmTime(
    val hi: Long,
    val mi: Long
)