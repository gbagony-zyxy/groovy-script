import groovy.transform.Immutable

/**
 * Created by gbagony on 2017/2/16.
 */
@Immutable
class FixedBook{
    String title;
}

//positional constructor 位置确定参数
def gina = new FixedBook('Groovy in Action')
//named-arg constructor 命名确定参数
def regina = new FixedBook(title: 'Groovy in Action')

assert gina.title == 'Groovy in Action'
//两个对象相等
assert gina == regina

try {
    gina.title = "Oops!"
    assert false,"should not reach here"
}catch (ReadOnlyPropertyException e){
    println "Excepted Error:'$e.message'"
}