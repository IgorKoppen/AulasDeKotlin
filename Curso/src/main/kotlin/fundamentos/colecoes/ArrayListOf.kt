package fundamentos.colecoes

fun main() {
    val strings = arrayListOf<String>("Carro",
        "Moto", "Barco", "Avião")
    for(item in strings) {
        println(item.uppercase())
    }
}