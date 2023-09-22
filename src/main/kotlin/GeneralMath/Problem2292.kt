package GeneralMath

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var n = readLine().toInt()
    var i = 1
    n -= i
    var j = 6
    while(n>0) {
        n -= j
        i++
        j += 6
    }
    bw.write("$i")
    bw.flush()
    bw.close()
}