package fundamentos.controle

fun main() {
    val num1:Int =7
    val num2:Int = 3

    val maiorValor = if(num1 > num2) {
        println("Processando if...")
        num1
    }else{
        println("processador else")
        num2
    }
    println("o maior valor é $maiorValor")
}