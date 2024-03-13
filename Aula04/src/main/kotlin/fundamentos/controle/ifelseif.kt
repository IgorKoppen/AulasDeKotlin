package fundamentos.controle

fun main() {
    val nota:Double = 8.1;
    if(nota in 9.0..10.0){
        println("Fantástico")
    }else if(nota in 7.0..8.9){
        println("Párabens")
    }else if(nota in 4.0..6.9){
        println("Párabens")
    }else if(nota in 0.0..3.9){
        println("Te vejo no próximo semestre")
    }else{
        println("Notá inválida")
    }
}