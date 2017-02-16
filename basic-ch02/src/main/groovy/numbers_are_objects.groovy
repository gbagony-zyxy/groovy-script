/**
 * Created by gbagony on 2017/2/16.
 * Groovy中数字即是对象,所以既可以使用对象的方法,也可以使用数字的基本操作
 * Groovy中提供的List,Map和Range操作
 */
def x = 1
def y = 2
assert x + y == 3
assert x.plus(y) == 3
assert x instanceof Integer
assert x.toString()


def roman = ['','I','II','III','IV','V','VI','VII']
assert roman[4] == 'IV'

roman[8] = 'VIII'
assert roman.size() == 9


def http = [
        100:'CONTINUE',
        200:'OK',
        400:'BAD REQUEST'
]
assert http[200] == 'OK'
http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4


def rx = 1..10
assert rx.contains(5)
assert !rx.contains(15)
assert rx.size() == 10
assert rx.from == 1
assert rx.to == 10
assert rx.reverse() == 10..1
rx = 10..1
assert rx.reverse
