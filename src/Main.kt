fun divide(num1: Int, num2: Int): Int {
    if (num2 == 0) {
        throw IllegalArgumentException("Error: No se puede dividir por cero")
    }
    return num1 / num2
}

fun main(args: Array<String>) {
    val (operation, num1, num2) = parseArguments(args)
    val result = when (operation) {
        "multiplica" -> multiplica(num1, num2)
        "divide" -> divide(num1, num2)
        else -> throw IllegalArgumentException("Operación no soportada")
    }
    showResult(operation, result)
}

