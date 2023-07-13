package exercicio2

import kotlin.math.PI

abstract class Forma {
    abstract fun calcularArea():Float
    abstract fun calcularPerimetro():Float

    open class Retangulo(private val lado: Float, private val altura: Float) : Forma() {
        override fun calcularArea(): Float {
            return lado * altura
        }

        override fun calcularPerimetro(): Float {
            return 2 * (lado + altura)
        }
    }
    class Circulo(private val raio: Float) : Forma() {
        override fun calcularArea(): Float {
            return PI.toFloat() * raio * raio
        }

        override fun calcularPerimetro(): Float {
            return 2 * PI.toFloat() * raio
        }
    }

    class Quadrado(lado: Float) : Retangulo(lado, lado)
}