package TwoDimensionalArray

/**
 * Tokenizer, Builder, println
 * A~Z, a~z, 0~9
 * 5개 단어를 세로로 읽는다.
 * 1. 5줄의 입력 처리
 * 1.1 2차 행렬로 저장
 * 2. 세로로 읽는 처리
 * 2.1 j++마다 buffer에 저장
 * 3. 출력
 */
fun main() = with(System.`in`.bufferedReader()) {
    val array = Array(5) { "" }
    var maxLength = 0
    val bw = System.out.bufferedWriter()
    for (i in array.indices) {
        array[i] = readLine()
        if (maxLength < array[i].length) maxLength = array[i].length
    }
    repeat(maxLength) { j ->
        repeat(5) { i ->
            if(j < array[i].length) bw.write("${array[i][j]}")
        }
    }
    bw.flush()
    bw.close()
}