/**
 * Created by gbagony on 2017/2/16.
 * GString的使用、正则表达式的使用
 */
//GString是允许在双引号中使用占位符来引用变量,单引号则只是表示字符串
def nick = 'ReGina'
def book = 'Groovy in Action,2nd ed.'

assert "$nick is $book" == 'ReGina is Groovy in Action,2nd ed.'

//正则表达式的语言级别的支持
//Regular expression support in Groovy through operators and slashy strings
assert '12345' =~ /\d+/
assert 'XXXXX' == '12345'.replaceAll(/\d/,'X')