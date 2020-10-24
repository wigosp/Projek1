fun aritmaeticSeriesSum(a: Int = 1, n: Int, d: Int = 1): Int = n/2 * (2*a + (n-1)*d)

fun main() {
    argument(0, 1, 2, 3, 4, 5, 6)
}

fun argument(vararg test:Int) {
    println(test[0])
    println(test[1])
    println(test[2])
    println(test[3])
}