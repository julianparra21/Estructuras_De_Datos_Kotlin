fun main() {

    val mapa = mapOf(
        "uno" to 1,
        "dos" to 2,
        "tres" to 3,
        "cuatro" to 4,
        "cinco" to 5
    )


    val valor = mapa["tres"]
    println("El valor correspondiente a 'tres' es $valor")


    println("Recorriendo el mapa...")
    for ((clave, valor) in mapa) {
        println("$clave: $valor")
    }


    val paresMayoresATres = mapa.filter { (_, valor) -> valor > 3 }
        .map { (clave, valor) -> Pair(clave.toUpperCase(), valor) }

    println("Pares clave-valor con valores mayores a 3 y claves en mayúsculas:")
    for ((clave, valor) in paresMayoresATres) {
        println("$clave: $valor")
    }
}
