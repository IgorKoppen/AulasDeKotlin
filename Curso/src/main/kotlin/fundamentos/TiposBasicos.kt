package fundamentos

fun main() {
    val num1:Byte = 127
    val num2:Short = 32767
    val num3:Int = 2_147_483_647
    val num4:Long = 9_223_372_036_854_775_807 //Long.MAX_VALUE

    val num5:Float = 3.14F
    val num6:Double = 3.14

    val char:Char = '?' // Sempre com '', nao pode ""

    val boolean:Boolean = true // ou false, nao pode utilizar 0 ou 1

    val lista = listOf(num1,num2,num3,num4,num5,num6,char,boolean)

    val element = ' '

    for (element in lista) {
        println(element)
    }

    println(lista)
    println(2 is Int)
    println(1.0 is Double)
}