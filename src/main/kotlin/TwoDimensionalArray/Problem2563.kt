package TwoDimensionalArray

/** 1번째 시도..
 * 도화지(100x100), 색종이(10x10)
 * 입력_ 색종이수, 색종이 위치(자연수 두 개_ 1. 색종이의 왼쪽벽에 대한 x값, 2. 색종이의 아랫변에 대한 y값)
 * 출력_ 검은 영역 넓이 출력
 * 1. 입력처리
 * 1.1 n = 색종이수
 * 1.2 n에 따라 색종이 저장
 * 2. 겹치는것 찾기
 * 3. 겹치는것만큼 빼기
 *
 * 사각형 1개 (x, y)
 * (x, y+10)   (x+10, y+10)
 *
 * (x, y)   (x+10, y)
 *
 * x1 + 10 <= x2 || x1 <= x2 + 10
 * y1 + 10 <= y2 || y1 <= y2 + 10
 * x
 *
 */

/** 2번째 시도..
 * 1. 2차원 배열 생성 100
 * 2. 입력값(n) 처리
 * 3. n을 순회하며 2차원 배열에 정사각형(1) 그리기
 * (x, y+10)    (x+10, y+10)
 * (x, y)       (x+10, y)
 * 4. 정사각형 부분 출력
 */

/** Feedback
 * bw 사용해볼것.
 * StringTokenizer 사용해볼것.
 */

fun main() = with(System.`in`.bufferedReader()) {
    val arr = Array(100) { IntArray(100) { 0 } }
    repeat(readLine().toInt()) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        for(i in arr.indices) { // 0~9
            if((i >= y) && (i < (y+10))) {
                for(j in arr[i].indices) {  // 0~9
                    if((j >= x) && (j < (x+10))) arr[i][j] = 1
                }
            }
        }
    }
    var result = 0
    arr.forEach { result += it.count { element -> element == 1 } }
    print(result)
}
