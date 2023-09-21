package GeneralMath

import java.util.StringTokenizer
import kotlin.math.pow

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val str = StringTokenizer(readLine(), " ")
    val n = str.nextToken()
    val b = str.nextToken().toDouble()
    var result = 0
    for(i in n.indices) {
        val digit = if(n[i].code <= 57) Character.getNumericValue(n[i]) else n[i].code-55
        result += digit * (b.pow(n.length-(i+1))).toInt()
    }
    bw.write("$result")
    bw.flush()
    bw.close()
}