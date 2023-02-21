fun main() {

    val conjuntoNumeros = setOf(10, 2, 3, 4, 5, 6, 7, 8, 9)

    //Utilizo la funcion .first() para obtener el primer elemento del conjunto
    val primerNumero = conjuntoNumeros.first()
    println("El primer número del conjunto es $primerNumero")


    println("Elementos del conjunto:")
    for (numero in conjuntoNumeros) {
        println(numero)
    }


    val numeroBuscado = 5
    if (conjuntoNumeros.contains(numeroBuscado)) {
        println("$numeroBuscado está en el conjunto")
    } else {
        println("$numeroBuscado no está en el conjunto")
    }


    val conjuntoMultiplicado = conjuntoNumeros.map { it * 2 }
    println("Conjunto original: $conjuntoNumeros")
    println("Conjunto multiplicado por 2: $conjuntoMultiplicado")
}