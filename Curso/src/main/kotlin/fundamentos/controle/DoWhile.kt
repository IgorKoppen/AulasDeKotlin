package fundamentos.controle

fun main() {
    var opcao: Int = -1;

    do {
        val line = readlnOrNull() ?:"0"
        opcao = line.toIntOrNull() ?:0
        println("Opção escolhida $opcao")
    }while (opcao != -1)
}