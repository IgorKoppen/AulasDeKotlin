package fundamentos
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.soma


fun main() {
    kotlin.io.println("Ok!");

    val coisa = Coisa("Bola!")
    println(coisa.nome);

    println(CARA)
    println("${soma(2,3)} ${ fundamentos.pacoteB.subtracao(4,6)}")
}