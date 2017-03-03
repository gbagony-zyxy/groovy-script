import java.util.regex.Matcher

/**
 * Created by ruyin on 2017/3/3.
 *
 * groovy中对正则表达式的支持:
 * groovy使用~"pattern"来支持正则表达式，
 * 它将使用给定的模式字符串创建一个编译好的Java Pattern对象。
 * groovy也支持 =~(创建一个Matcher)，类似于find()方法
 * 和 ==~(返回boolean，是否给定的字符串匹配这个pattern)操作符,类似于Pattern中matches()方法
 *  就是exist与matches的区别
 *
 */

def twister = 'she sells sea shells at the sea shore of seychelles'
//返回的对象类型为Matcher,在twister字符串中寻找有没有与给出的正则相匹配的子串(substring)
assert twister =~ /s.a/

def finder = (twister =~ /s.a/)
assert finder instanceof Matcher

//返回结果为boolean类型
assert twister ==~ /(\w+ \w+)*/
println twister ==~ /(\w+ \w+)*/

def WORD =/\w+/
//字符串中需要使用占位符去代替变量
matches = (twister ==~ /($WORD $WORD)*/)
assert matches instanceof Boolean

//not greedy match
//twister字符串与给定的正则不匹配
println twister
println 'T'+ (twister ==~ /s.a/)

def wordsByX = twister.replaceAll(WORD,'x')
println wordsByX

//split给定字符串并返回分割的String[]
def words = twister.split(/ /)
println words.size()
println words[2]