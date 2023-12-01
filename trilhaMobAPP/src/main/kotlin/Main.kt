import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Calculadora")
    print("Digite o primeiro número: ")
    val num1 = scanner.nextDouble()

    print("Digite o segundo número: ")
    val num2 = scanner.nextDouble()

    println("Escolha a operação:")
    println("1. Soma")
    println("2. Subtração")
    println("3. Multiplicação")
    println("4. Divisão")

    print("Digite o número da operação desejada: ")
    val escolha = scanner.nextInt()

    when (escolha) {
        1 -> println("Resultado: ${soma(num1, num2)}")
        2 -> println("Resultado: ${subtracao(num1, num2)}")
        3 -> println("Resultado: ${multiplicacao(num1, num2)}")
        4 -> {
            if (num2 != 0.0) {
                println("Resultado: ${divisao(num1, num2)}")
            } else {
                println("Não é possível dividir por zero.")
            }
        }
        else -> println("Opção inválida")
    }
}

fun soma(a: Double, b: Double): Double {
    return a + b
}

fun subtracao(a: Double, b: Double): Double {
    return a - b
}

fun multiplicacao(a: Double, b: Double): Double {
    return a * b
}

fun divisao(a: Double, b: Double): Double {
    return a / b
}
