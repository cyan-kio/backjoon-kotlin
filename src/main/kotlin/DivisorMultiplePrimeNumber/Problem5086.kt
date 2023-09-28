package DivisorMultiplePrimeNumber

import java.util.StringTokenizer

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    while(true) {
        val str = StringTokenizer(readLine(), " ")
        val a = str.nextToken().toInt()
        val b = str.nextToken().toInt()

        if(a==0 && b==0) break

        if(b % a == 0) bw.write("factor")
        else if(a % b == 0) bw.write("multiple")
        else bw.write("neither")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}