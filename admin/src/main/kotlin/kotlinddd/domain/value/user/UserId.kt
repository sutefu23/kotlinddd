package kotlinddd.domain.value.user

import kotlinddd.domain.value.base.ValueObject

class UserId(id:Long): ValueObject<Long>(id){
    override fun validate(){
        takeUnless { value > 0 }?.apply { throw AssertionError("IDは0以上の数字です。") }
    }
}