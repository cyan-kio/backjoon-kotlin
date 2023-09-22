package GeneralMath

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var c = readLine().toInt()
        bw.write("${c / 25}")
        c %= 25
        bw.write(" ${c / 10}")
        c %= 10
        bw.write(" ${c / 5}")
        c %= 5
        bw.write(" ${c / 1}\n")
    }
    bw.flush()
    bw.close()
}