package GeneralMath

import kotlin.math.pow

fun main()=with(System.`in`.bufferedReader()) {
    print((2.0.pow(readLine().toInt())+1).pow(2).toInt())
}