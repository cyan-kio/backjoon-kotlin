package geometry

import java.util.StringTokenizer

fun main()=with(System.`in`.bufferedReader()) {
    var maxX = -10001
    var maxY = -10001
    var minX = 10001
    var minY = 10001
    var x: Int
    var y: Int
    val n = readLine().toInt()
    repeat(n) {
        val st = StringTokenizer(readLine())
        x = st.nextToken().toInt()
        y = st.nextToken().toInt()
        if (maxX < x) maxX = x
        if (minX > x) minX = x
        if (maxY < y) maxY = y
        if (minY > y) minY = y
    }
    if(n > 1) print((maxX-minX)*(maxY-minY))
    else print(0)
}

// 참고
//private fun readInt(): Int {
//    var value = 0
//    var negative = false
//    var input: Int
//    while (true) {
//        input = System.`in`.read()
//        when (input) {
//            10, 32 -> return if (negative) -value else value
//            45 -> negative = true
//            else -> value = value * 10 + (input - 48)
//        }
//    }
//}