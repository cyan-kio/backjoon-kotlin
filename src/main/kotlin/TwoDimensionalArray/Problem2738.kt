package TwoDimensionalArray
/**
 * 1. 입력 처리(BufferedReader)
 *      1.1 행렬 크기 N, M 입력
 *      1.2 M만큼 반복해서 각 행의 원소들을 2차원 배열에 차곡차곡 저장
 * 2. 행렬 덧셈
 *      반복문 돌면서_더하고_바로 출력(BufferedWriter)
 * 3. 출력
 */
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val array = Array(n) { IntArray(m) { 0 } }
    val bw = System.`out`.bufferedWriter()

    repeat(n) { i ->
        val nums = readLine().split(" ").map { it.toInt() }
        repeat(m) { j ->
            array[i][j] = nums[j]
        }
    }

    repeat(n) { i ->
        val nums = readLine().split(" ").map { it.toInt() }
        repeat(m) { j ->
            bw.write(""+(array[i][j] + nums[j]))
            if (j != m) bw.write(" ")
        }
        if(i != m) bw.newLine()
    }
    bw.flush()
    bw.close()
}