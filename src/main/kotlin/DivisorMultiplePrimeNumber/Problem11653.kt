package DivisorMultiplePrimeNumber

import java.lang.StringBuilder
import kotlin.math.floor
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var n = readLine().toInt()
    var temp = 2
    if (n != 1) {
        while (true) {
            if (isPrime(n)) break
            if (n % temp == 0) {
                n /= temp
                sb.append("$temp\n")
            } else {
                temp++
            }
        }
        sb.append(n)
        print(sb)
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..floor(sqrt(num.toDouble())).toInt()) {
        if (num % i == 0) return false
    }
    return true
}