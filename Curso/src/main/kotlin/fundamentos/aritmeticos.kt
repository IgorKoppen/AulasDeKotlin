package fundamentos

fun main() {
    val(v1,v2,v3,v4) = listOf(3,5,1,15)
    
    val soma = v1+v2+v3+v4
    val sub = v1-v2-v3-v4
    val mult = v1*v2*v3*v4
    val div = v1/v2/v3/v4
    val mod =v1%2

    println("$soma , $sub, $mult, $div, $mod")
}