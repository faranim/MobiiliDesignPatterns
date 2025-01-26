package LAB3

const val EPS = 0.0000001

class Complex(val real: Double, val imaginary: Double) {
    constructor(real: Int, imaginary: Int) : this(real.toDouble(), imaginary.toDouble())
    override fun toString(): String {
        return "$real + ${imaginary}i"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Complex) return false
        return Math.abs(this.real - other.real) < EPS &&
                Math.abs(this.imaginary - other.imaginary) < EPS
    }

    operator fun plus(other: Complex): Complex {
        return Complex(this.real + other.real, this.imaginary + other.imaginary)
    }

    operator fun minus(other: Complex): Complex {
        return Complex(this.real - other.real, this.imaginary - other.imaginary)
    }

    operator fun times(other: Complex): Complex {
        val realPart = this.real * other.real - this.imaginary * other.imaginary
        val imaginaryPart = this.real * other.imaginary + this.imaginary * other.real
        return Complex(realPart, imaginaryPart)
    }

    val abs: Double
        get() = Math.sqrt(real * real + imaginary * imaginary)



}
