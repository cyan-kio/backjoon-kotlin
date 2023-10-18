package geometry

import java.util.StringTokenizer

fun main()=with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var st = StringTokenizer(readLine())
    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()
    st = StringTokenizer(readLine())
    val x2 = st.nextToken().toInt()
    val y2 = st.nextToken().toInt()
    st = StringTokenizer(readLine())
    val x3 = st.nextToken().toInt()
    val y3 = st.nextToken().toInt()
    if(x==x2) sb.append("$x3 ")
    else sb.append("${x+x2-x3} ")
    if(y==y2) sb.append("$y3")
    else sb.append("${y+y2-y3}")
    print(sb)
}