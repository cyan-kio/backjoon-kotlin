package String

// - 입력처리
// 공백을 이용한 3개의 입력에 대한 반복문 설정, null 반환시 입력 종료
//  1. 입력을 받을때마다 계산하고 마지막에 평점을 계산할건지
// tempA
//  2. 입력을 리스트로 처리하고, 마지막에 한꺼번에 계산할것인지
// - 평점 계산
// = (전공별 학점× 과목평점) 의 합들 / 학점 총합
// 과목평점 숫자 변환
// - 출력
fun main() = with(System.`in`.bufferedReader()) {
    var temp = 0.0
    var totalCredit= 0.0
    repeat(20) {
        val str = readLine().split(" ").map{ it }
        if(str[2] != "P") {
            temp += (str[1].toDouble() * gradeToScore(str[2]))
            totalCredit += str[1].toDouble()
        }
    }
    print(temp/totalCredit)
}

fun gradeToScore(grade: String): Double {
    var score = 0.0
    when (grade) {
        "A+" -> score = 4.5
        "A0" -> score = 4.0
        "B+" -> score = 3.5
        "B0" -> score = 3.0
        "C+" -> score = 2.5
        "C0" -> score = 2.0
        "D+" -> score = 1.5
        "D0" -> score = 1.0
        "F" -> score = 0.0
    }
    return score
}
