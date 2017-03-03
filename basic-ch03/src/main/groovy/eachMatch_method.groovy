/**
 * Created by ruyin on 2017/3/3.
 */
def rains = 'The rain in Spain stays mainly in the plain'

def wordEnd = /\w*ain/
def wordOver = /\w*ain/
def rhyme = /\b$wordEnd\b/
//如果变量只是在闭包中或方法中使用，在方法结束的时候销毁则不必要去声明这个局部变量
def found = ''

rains.eachMatch(rhyme){
    matche -> found += matche + ' '
}

assert found == 'rain Spain plain '

found = ''
(rains =~ rhyme).each {
    match -> found += match + ' '
}
assert found == 'rain Spain plain '

def cloze = rains.replaceAll(rhyme){
    //字符串的替换操作，简洁明了
    it - 'ain'+'___'
}

println cloze