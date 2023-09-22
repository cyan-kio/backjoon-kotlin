package GeneralMath

import java.util.StringTokenizer

/**
 * input = N(Int), B(Int) -> output = str(String)
 * 계속 나눠서 나머지를 Char로 차례로 쌓기, 거꾸로 출력
 *
 */

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val str = StringTokenizer(readLine(), " ")
    var n = str.nextToken().toInt()
    val b = str.nextToken().toInt()
    var decStr = ""
    while(n!=0) {
        val c = (n % b).digitToChar(b)
        n /= b
        decStr += c
    }
    bw.write(decStr.reversed())
    bw.flush()
    bw.close()
}