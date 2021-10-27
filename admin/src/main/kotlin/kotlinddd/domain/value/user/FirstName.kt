package kotlinddd.domain.value.user

import kotlinddd.domain.value.base.ValueObject

class FirstName(firstName: String) : ValueObject<String>(firstName) {
    override fun validate(){
        // if (value.length > 10) { throw ... }と同等
        takeUnless { value.length <=10 }?.apply { throw AssertionError("FirstNameは10文字以下です。") }
    }
}