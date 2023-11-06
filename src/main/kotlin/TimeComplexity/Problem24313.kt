package TimeComplexity

import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = readln().toInt()
    val n = readln().toInt()
    if((a*n) + b <= c * n && a <= c) print(1)
    else print(0)
}