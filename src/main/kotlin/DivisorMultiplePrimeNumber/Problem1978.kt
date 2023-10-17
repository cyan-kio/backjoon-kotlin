package DivisorMultiplePrimeNumber

import java.util.StringTokenizer
import kotlin.math.floor
import kotlin.math.sqrt

fun main()=with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val str = StringTokenizer(readLine())
    var result = 0
    repeat(n) {
        val a = str.nextToken().toInt()
        var temp = 0
        for(i in 1 .. floor(sqrt(a.toDouble())).toInt()) {
            if(a % i == 0 && a != 1) {
                temp++
            }
        }
//        for(i in 1 until a) {
//            if(a % i == 0) {
//                temp++
//            }
//        }
        if(temp == 1) result++
    }
    print("$result")
}