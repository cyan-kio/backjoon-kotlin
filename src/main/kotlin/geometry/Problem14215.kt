package geometry

import java.util.StringTokenizer

/*
# 삼각형의 조건
    - 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길어야 한다.

# 세 수를 입력
# 작은 두 수의 합보다 1 작은 값을 구하여 삼각형의 둘레를 구하자.
 */
fun main()=with(StringTokenizer(readln())) {
    val a = nextToken().toInt()
    val b = nextToken().toInt()
    val c = nextToken().toInt()
    val max = maxOf(a, b, c)
    if(a == b && b == c) print("${a * 3}")
    else if(((a + b + c) - max) > max) print("${a + b + c}")
    else print("${((a + b + c) - max) * 2 - 1}")
}