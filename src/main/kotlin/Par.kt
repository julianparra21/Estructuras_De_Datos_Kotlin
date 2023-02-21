fun <A, B> Pair<A, B>.swap(): Pair<B, A> {
    return second to first
}

fun main() {

    val miPar = "Hola" to 123


    val primerElemento = miPar.first
    val segundoElemento = miPar.second
    println("El primer elemento del par es: $primerElemento")
    println("El segundo elemento del par es: $segundoElemento")


    val miParModificado = miPar.copy(first = "Adiós")
    println("El par original es: $miPar, y el par modificado es: $miParModificado")


    val miParIntercambiado = miPar.swap()
    println("El par original es: $miPar, y el par intercambiado es: $miParIntercambiado")



}
