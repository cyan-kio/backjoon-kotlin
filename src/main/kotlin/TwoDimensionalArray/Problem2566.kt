package TwoDimensionalArray

/**
 * 1. 입력처리
 * 1.1 9 크기의 행 값을 9번 반복해서 받는다.
 * 1.2 각 반복마다 행의 가장 큰 값을 최댓값과 비교한다.
 * 2. 출력
 */
fun main() = with(System.`in`.bufferedReader()) {
    var max = 0
    var n = 1
    var m = 1
    val bw = System.`out`.bufferedWriter()
    repeat(9) { i ->
        val nums = readLine().split(" ").map{ it.toInt() }
        if(nums.max() > max) {
            n = i + 1
            m = nums.indexOf(nums.max()) + 1
            max = nums.max()
        }
    }
    bw.write(""+ max + "\n")
    bw.write("" + n + " " + m)
    bw.flush()
    bw.close()
}