import groovy.transform.Immutable

/**
 * Created by gbagony on 2017/2/20.
 */

//Overrides == operator
@Immutable
class Money{
    int amount
    String currency

    //Implements + operator
    Money plus(Money money){
        if(money == null) return this
        if(money.currency != currency)
            throw new IllegalArgumentException("cannot add $money.amount to $amount")

        return new Money(amount + money.amount,currency)
    }
    //重载方法
    Money plus(Integer more){
        if(more == null) return this
        return new Money(amount + more,currency)
    }
}

Money money = new Money(1,'USD')
println money

assert money == new Money(1,'USD')
assert money + money == new Money(2,'USD')
assert money.plus(money) == new Money(2,'USD')
//assert money == new Money(1,'CNY')
assert money.plus(1) == new Money(2,'USD')
assert money + 1 == new Money(2,'USD')
//println money.plus(1.5)
println 2**30