package DivisorMultiplePrimeNumber

fun main()=with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val m = readLine().toInt()
    val n = readLine().toInt()
    var result = 0
    var min = 0

    for(i in m..n) {
        if(checkPrimeNumber(i)) {
            result += i
            if(min == 0) min = i
        }
    }

    if(result == 0) sb.append(-1)
    else sb.append(result).append("\n").append(min)

    print(sb)
}

fun checkPrimeNumber(num: Int): Boolean {
    if(num < 2) return false
    else {
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
    }
    return true
}
