package fundamentos

fun main() {
    val a: Int = 33.dec() //dec = decrease
    var b: String = a.toString()

    println("Int: $a")
    println("Primeiro char da string b é: ${b.first()}")
    println("Ultimo char da string b é: ${b.last()}")
    println(a.plus(3))
    print(b.plus(3))
}