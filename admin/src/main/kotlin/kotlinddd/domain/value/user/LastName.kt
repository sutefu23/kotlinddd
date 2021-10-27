package kotlinddd.domain.value.user

import kotlinddd.domain.value.base.ValueObject

class LastName(lastName: String) : ValueObject<String>(lastName) {
    override fun validate(){
        takeUnless { value.length <=10 }?.apply { throw AssertionError("LastNameは10文字以下です。") }
    }
}