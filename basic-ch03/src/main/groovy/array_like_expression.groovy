import java.util.regex.Matcher

/**
 * Created by ruyin on 2017/3/3.
 *
 * 我们可以想象一个matcher对应的是一个list集合，我们可以像操作list一样去操作matcher
 *
 * 使用groovy的并行赋值(parallel assignment)的特性来直接为每一个匹配项赋值
 *
 * 在groupings时如果regex串包含括号，那么匹配的结果同样是一个string类型的数组而不是单个的字符串，
 * 这一点与eachMatche类似
 */
def matcher = 'a b c' =~ /\S/

assert matcher[0] == 'a'
assert matcher[1..2] == ['b','c']
assert matcher.size() == 3


//本质上是通过匹配项去确定数组的大小，然后回过头来确定并行参数的大小，如果多赋值就会抛java.lang.IndexOutOfBoundsException
def (a,b,c) = 'a b c' =~ /\S/
assert a == 'a'
assert b == 'b'
assert c == 'c'

//pattern[0]是否返回数据要看pattern是否包含groupings
def pattern = 'a:1 b:2 c:3' =~ /(\S+):(\S+)/
assert pattern.size() == 3
assert pattern.hasGroup()
//存在数组中的元素存在位置信息，按照顺序取
assert pattern[0] == ['a:1','a','1']
//定义的类型不会显式去转换
assert pattern[2][2] == '3'
//assert pattern[2][2] == 3
//println pattern.index
println Matcher.lastMatcher


//pattern同样可以应用于Matcher的each方法
pattern.each { full,key,value ->
    assert full.size() == 3
    assert key.size() == 1   //a,b,c
    assert value.size() == 1 //1,2,3
}

//必须指定三个参数？
pattern.each { full,key,value ->
    println full.size()+'-->'+key+':'+value
}

//groovy.lang.MissingMethodException: No signature of method
/*
pattern.each { key,value ->
    assert key.size() == 1   //a,b,c
    assert value.size() == 1 //1,2,3
}*/
