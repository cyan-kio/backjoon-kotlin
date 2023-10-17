package DivisorMultiplePrimeNumber

import java.util.StringTokenizer

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val str = StringTokenizer(readLine(), " ")
    val n = str.nextToken().toInt()
    val k = str.nextToken().toInt()
    val divList = mutableListOf<Int>()

    repeat(n) {
        if(n % (it+1) == 0) divList.add(it+1)
    }

    if(divList.size < k) bw.write("0")
    else bw.write("${divList[k-1]}")

    bw.flush()
    bw.close()
}