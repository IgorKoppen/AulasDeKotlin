package fundamentos.colecoes

data class Person(var id:Int,var nome:String)

fun main() {
    val numeros = arrayListOf(1,2,3,4,5)
    val strings = arrayListOf("Rafael", "Pedro",
        "Leandro", "Gustavo","Igor")
    val uniao = numeros + strings
    val persons = arrayListOf<Person>()
    var number = 0;

   while(number < numeros.size || number < strings.size){
       persons.add(Person(numeros.get(number),strings.get(number)))
       number++;
   }

    for (person in persons) {
        println("${person.id} : ${person.nome}")
    }
}