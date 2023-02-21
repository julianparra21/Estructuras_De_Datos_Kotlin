fun main() {
    val numeros = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)

    println("Arreglo original:")
    numeros.forEach { print("$it ") }

    println("\nEl tercer elemento del arreglo es ${numeros[2]}")
    println("\nEl arreglo tiene ${numeros.size} elementos")
    val tercerElemento = numeros.get(2)
    println("El tercer elemento del arreglo es $tercerElemento")
    numeros.set(2, 10)
    println("El tercer elemento del arreglo ha sido actualizado a 10")
    val indiceDeCinco = numeros.indexOf(5)
    println("El índice de la primera ocurrencia del número 5 es $indiceDeCinco")

    val contieneNueve = numeros.contains(9)
    println("El arreglo ${if (contieneNueve) "sí" else "no"} contiene el número 9")

    numeros[4] = 10
    println("El quinto elemento del arreglo ha sido actualizado a 10")
    numeros.sort()
    println("El arreglo ordenado es:")
    numeros.forEach { print("$it ") }

    val elementosPares = numeros.filter { it % 2 == 0 }
    println("\nLos elementos pares del arreglo son:")
    elementosPares.forEach { print("$it ") }

    val cuadrados = numeros.map { it * it }
    println("\nEl arreglo con los cuadrados de los elementos es:")
    cuadrados.forEach { print("$it ") }

    val subarreglo = numeros.slice(1..3)
    println("\nEl subarreglo que contiene los elementos en los índices 1, 2 y 3 es:")
    subarreglo.forEach { print("$it ") }
}