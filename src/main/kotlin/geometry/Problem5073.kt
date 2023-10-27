package geometry

import java.util.*

/*
# 삼각형의 조건
    - 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길어야 한다.
        => 조건에 부합하지 않으면 "Invalid" 출력
    - 세 변의 길이에 따라 다음의 결과를 출력한다.
        - 세 변의 길이가 모두 같은 경우 => "Equilateral" 출력
        - 두 변의 길이만 같은 경우 => "Isosceles" 출력
        - 세 변의 길이가 모두 다른 경우 => "Scalene" 출력
 */
fun main()=with(System.`in`.bufferedReader()) {
    while(true) {
        val str = StringTokenizer(readLine())
        val a = str.nextToken().toInt()
        val b = str.nextToken().toInt()
        val c = str.nextToken().toInt()
        if(a == 0 && b == 0 && c == 0) break
        val max = maxOf(a, b, c)
        if(max >= (a + b + c) - max) println("Invalid")
        else {
            if(a == b && b == c) println("Equilateral")
            else if(a == b || b == c || c == a) println("Isosceles")
            else println("Scalene")
        }
    }
}