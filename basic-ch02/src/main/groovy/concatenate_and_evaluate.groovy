import groovy.transform.TypeChecked

/**
 * Created by gbagony on 2017/2/17.
 * @TypeChecked注解用于强制类型检查
 */

class Universe{
    @TypeChecked
    int answer(){42}
}

// A way of using dynamic code is to put the source in a string and ask Groovy to evaluate it.
def code = '1 + '
code += System.getProperty("java.class.version")
assert code == '1 + 52.0'
assert 53.0 == evaluate(code)