package geometry

import java.util.StringTokenizer
import kotlin.math.min

fun main()=with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val h = st.nextToken().toInt()

    print(min(min((w-x), x), min((h-y), y)))
}