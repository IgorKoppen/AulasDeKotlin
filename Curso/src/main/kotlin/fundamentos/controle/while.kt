package fundamentos.controle

fun main() {
    var opcao: Int = 0;
    while (opcao != -1) {
        val line = readlnOrNull() ?: "O";
        opcao = line.toIntOrNull() ?: 0;
        println("Você escolheu a opção $opcao")

    }
    println("Até a próxima")
}