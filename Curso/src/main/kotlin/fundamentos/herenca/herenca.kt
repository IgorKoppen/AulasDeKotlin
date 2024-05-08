package fundamentos.herenca

open class Animal(val nome: String)
class Cachorro: Animal {
    private var altura: Double
    private var raca:String
    constructor(nome: String, altura: Double,raca:String): super(nome) {
        this.altura = altura
        this.raca = raca
    }
    constructor( nome: String,raca:String) : this(nome, 0.0,raca)
    override fun toString(): String = "$nome tem $altura cm de altura e é da raça $raca"
}
fun main(args: Array<String>) {
    val dogAlemao = Cachorro("Spyke", 84.3,"dogAlemao")
    val yorkshire = Cachorro("Lady Di", 84.3,"yorkshire")
    val saoBernardo = Cachorro("Beethoven", 104.3,"saoBernardo")
    println(dogAlemao)
    println(yorkshire)
    println(saoBernardo)
}