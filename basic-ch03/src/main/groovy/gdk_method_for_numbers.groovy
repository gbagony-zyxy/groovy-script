/**
 * Created by gbagony on 2017/2/20.
 * GDK为数字类型提供的一些基本方法
 */

assert 1 == (-1).abs()
assert 2 == 2.5.toInteger()     //conversion
assert 2 == 2.5 as Integer      //enforced coercion
assert 2 == (int)2.5            //cast
assert 3 == 2.5f.round()
assert 3.142 == Math.PI.round(3)
assert 4 == 4.5f.trunc()
assert 2.718 == Math.E.trunc(3)
assert '2.718'.isNumber()
assert 5 == '5'.toInteger()
assert 5 == '5' as Integer
assert 53 == (int)'5'
assert '6 times' == 6 + ' times'


def store = ''
10.times {              //repetition
    store += 'x'
}
assert store == 'xxxxxxxxxx'

store = ''
1.upto(5){              //walking up with look variable
    number -> store += number
}
assert store == '12345'


store = ''
2.downto(-2){           //walking down
    number -> store += number + ' '
}
assert store == '2 1 0 -1 -2 '


store = ''
0.step(6,1){            //walking with step width
    number -> store += number + ' '
}
assert store == '0 1 2 3 4 5 '