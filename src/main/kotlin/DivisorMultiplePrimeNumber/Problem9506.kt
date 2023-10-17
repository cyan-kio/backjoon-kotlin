package DivisorMultiplePrimeNumber

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    while (true) {
        val n = readLine().toInt()
        if (n == -1) break

        val divList = mutableListOf<Int>()
        var temp = 0
        for(i in 1 until n) {
            if(n % i == 0) {
                divList.add(i)
                temp += i
            }
        }

        if(n == temp) {
            bw.write("$n =")
            for(i in divList.indices) {
                bw.write(" ${divList.elementAt(i)}")
                if(i != divList.lastIndex) bw.write(" +")
                else bw.newLine()
            }
        } else {
            bw.write("$n is NOT perfect.\n")
        }
    }
    bw.flush()
    bw.close()
}