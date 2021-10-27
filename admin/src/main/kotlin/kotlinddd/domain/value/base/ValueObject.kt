package kotlinddd.domain.value.base

abstract class ValueObject<T>(val value: T) {
    init{
        validate()
    }
    /**
     * 値としての制約を記述
     * @throws AssertionError
     */
    abstract fun validate()

    override fun toString(): String {
        return value.toString()
    }

    fun value(): T {
        return value
    }

    fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ValueObject<*>
        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}