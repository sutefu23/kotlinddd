package kotlinddd.domain.model.base

abstract class Entity() {
    abstract val id : Any

    override fun equals(other: Any?): Boolean {//Entity同士はIDによって同じと判断される。（例外がある場合はoverride）
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Entity
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}