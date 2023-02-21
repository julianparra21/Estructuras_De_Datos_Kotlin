class Empleado(val nombre: String, val salario: Double)

fun main() {
    val empleados = listOf(
        Empleado("Juan", 1500.0),
        Empleado("María", 2000.0),
        Empleado("Pedro", 1800.0),
        Empleado("Ana", 2500.0),
        Empleado("Luis", 2200.0)
    )

    // 1. Calcular el promedio de salarios de los empleados.
    val promedioSalarios = empleados.map { it.salario }.average()
    println("El promedio de salarios es: $promedioSalarios")

    // 2. Encontrar el empleado con el salario más alto.
    val empleadoSalarioMaximo = empleados.maxByOrNull { it.salario }
    if (empleadoSalarioMaximo != null) {
        println("El empleado con el salario más alto es ${empleadoSalarioMaximo.nombre}")
    }

    // 3. Crear un conjunto de los nombres de los empleados.
    val nombresEmpleados = empleados.map { it.nombre }.toSet()
    println("Los nombres de los empleados son: $nombresEmpleados")

    // 4. Crear un mapa que asocie el nombre de cada empleado con su salario.
    val mapaSalarios = empleados.associateBy { it.nombre }.mapValues { it.value.salario }
    println("El mapa de salarios es: $mapaSalarios")
}
