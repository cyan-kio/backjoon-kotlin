package String
/** 1316번 그룹 단어 체커
1. 단어 갯수 N에 대한 입력 처리
2. 문자열 입력
3. 각 문자열 검사 반복문
3-1. 연속돼있는지 검사
3-1-1. temp 리스트에 먼저 값을 넣는다.
3-1-2. 각 요소들이 그와 같은지 비교한다.
3-1-3-1. 같으면 이전 값들중 마지막 인덱스를 현재 인덱스와 비교(1보다 크면 그룹 단어가 아님..), 다르면 리스트에 값을 추가하고 넘어간다.
4. 그룹 단어 개수 출력 **/
fun main() = with(System.`in`.bufferedReader()) {
    var n = readln().toInt()
    var result = n
    repeat(n) {
        val str = readLine()
        val tempList = mutableListOf<Char>()
        run loop@{
            str.forEachIndexed { index, char ->
                if (index > 0) {
                    if (tempList.contains(char)) {
                        if (index - str.lastIndexOf(char, index - 1) > 1) {
                            result--
                            return@loop
                        }
                    } else {
                        tempList.add(char)
                    }
                } else {
                    tempList.add(char)
                }
            }
        }
    }
    print(result)
}