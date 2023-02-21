fun main() {
    val lista = listOf(1, 2, 3, 4, 5)

    val elemento = lista[2]

    val listaCuadrados = lista.map { it * it }


    val listaPares = lista.filter { it % 2 == 0 }


    val suma = lista.reduce { acc, n -> acc + n }


    val listaOrdenada = lista.sorted()


    val listaParesCuadrados = lista.filter { it % 2 == 0 }.map { it * it }


    for (elemento in lista) {
        println(elemento)
    }

    println("Lista original: $lista")
    println("Lista al cuadrado: $listaCuadrados")
    println("Lista de elementos pares: $listaPares")
    println("Suma de los elementos de la lista: $suma")
    println("Lista ordenada: $listaOrdenada")
    println("Lista de elementos pares al cuadrado: $listaParesCuadrados")

}