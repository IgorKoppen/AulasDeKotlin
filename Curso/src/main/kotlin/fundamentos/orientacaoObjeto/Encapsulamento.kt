package fundamentos.orientacaoObjeto

private val dentroDoObjeto = 1
//protected val vaiPorHeranca = 1 //sem acesso a protected
internal val dentroDoProjeto = 1
val publico = 1
private fun dentroDoObjeto() = 1
internal fun dentroDoProjeto() = 1
fun publico() = 2
open class Capsula {
    private val dentroDoObjeto = 20
    protected val vaiPorHeranca = 15
    internal val dentroDoProjeto = 1
    val publico = 1
    private fun dentroDoObjeto() = 1
    internal fun dentroDoProjeto() = 12
    fun publico() = 10

    fun dentroDoObjetoGet() = dentroDoObjeto

}
class capsulaFilha : Capsula(){
    fun verificarAcesso() {
        //println(Capsula().dentroDoObjetoGet())
        //println(capsulaFilha().vaiPorHeranca)
        println(Capsula().dentroDoProjeto())
        println(Capsula().publico())

    }
}

fun main() {
    capsulaFilha().verificarAcesso();
}