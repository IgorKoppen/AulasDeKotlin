package fundamentos.colecoes

fun main(args: Array<String>) {
    val numeros =Array<Int>(10){i -> i * 10}
    for (numero in numeros) {
        println(numero)
    }
    println(numeros.get(1)) //pegando a posição 1
    println(numeros[1]) //anotação antiga, mas ainda
    println(numeros.size) //pegando o tamanho total
    numeros.set(1,1234) //alterando o valor da posição 1
    println(numeros.get(1))
}