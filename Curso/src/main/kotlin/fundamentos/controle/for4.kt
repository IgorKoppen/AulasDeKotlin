package fundamentos.controle

fun main() {
    val alunos = arrayOf("André", "Carla", "Marcos")
    for((indice,aluno) in alunos.withIndex()){
        println("${indice+1}-$aluno")
    }
}