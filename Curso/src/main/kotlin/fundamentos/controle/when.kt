package fundamentos.controle

fun main() {
    val nota: Double = 5.1;
    when (nota) {
        in 9.0..10.0 -> println("Fantástico");
        in 7.0..8.9 -> println("Párabens");
        in 4.0..6.9 -> println("Recuperação");
        in 0.0..3.9 -> println("Te vejo no próximo semestre");
        else -> println("Notá inválida");
    }

}