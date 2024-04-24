package fundamentos.colecoes

fun main() {
    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')
//string, boolean, inteiro, double, char
    for(item in listaMix) {
        if(item is String) {
            println(item.uppercase())
        } else {
            print(item)
        }
    }

}