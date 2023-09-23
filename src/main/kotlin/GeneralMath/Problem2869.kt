package GeneralMath

import java.util.StringTokenizer
import kotlin.math.ceil

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val str = StringTokenizer(readLine(), " ")
    val a = str.nextToken().toDouble()
    val b = str.nextToken().toDouble()
    val v = str.nextToken().toDouble()
    val count = ceil((v - a)/(a - b)) + 1
    bw.write("${count.toInt()}")
    bw.flush()
    bw.close()
}