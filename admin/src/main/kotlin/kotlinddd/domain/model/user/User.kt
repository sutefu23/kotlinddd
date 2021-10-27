package kotlinddd.domain.model.user

import kotlinddd.domain.model.base.Entity
import kotlinddd.domain.value.user.FirstName
import kotlinddd.domain.value.user.LastName
import kotlinddd.domain.value.user.UserId

class User(override val id :UserId, private val firstName: FirstName, private val lastName: LastName) : Entity() {
    // companion objectで定義しておくルールにする
    companion object {
        fun of(id : Long, firstName: String , lastName: String): User{
            return User(
                UserId(id),
                FirstName(firstName),
                LastName(lastName)
            )
        }
    }
    //Entityは状態を持たない不変オブジェクトにしたため、返り値はEntity自体にする
    fun changeName(changeFirstName: String?, changeLastName: String?): User{
        return User(
            id,
            changeFirstName?.let{ FirstName(it) } ?: firstName,
            changeLastName?.let{ LastName(it) } ?: lastName,
        )
    }
}
