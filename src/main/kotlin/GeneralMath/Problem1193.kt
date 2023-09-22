package GeneralMath

fun main()=with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var x = readLine().toInt()
    var i = 1
    while(x > i) {
        x -= i
        i++
    }
    if(i%2==0) {
        bw.write("$x/${i+1-x}")
    } else {
        bw.write("${i+1-x}/$x")
    }
    bw.flush()
    bw.close()
}