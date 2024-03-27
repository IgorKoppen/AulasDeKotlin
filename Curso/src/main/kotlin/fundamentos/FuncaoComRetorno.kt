package fundamentos

fun retornaSoma(a:Int, b:Int = 1): Int {
    return a + b
}

fun main() {
    println(retornaSoma(2,3))
    println(retornaSoma(11))
}
