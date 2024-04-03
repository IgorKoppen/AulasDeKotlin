package fundamentos

fun main() {
    val entregouSite:Boolean = false
    val entregouApp:Boolean = false

    val comprouSorvete:Boolean = entregouSite || entregouApp
    val comprouTv50:Boolean = entregouSite && entregouApp
    val comprouTv32:Boolean = entregouSite xor  entregouApp

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    if (!comprouSorvete)
        println("A saúde agradece")
}