/**
 * Created by ruyin on 2017/2/27.
 *
 * 字符串的混合操作
 */
//note:These self-explanatory examples give an impression of what's
//possible with strings in Groovy.Groovy cannot change a string in place
//because it works on instances of
//java.lang.String and obeys Java's invariant of strings being immutable.
def greeting = 'Hello Groovy!'
assert greeting.startsWith('Hello')
assert greeting instanceof String

assert greeting.getAt(0) == 'H'
assert greeting[0] == 'H'

assert greeting.indexOf('Groovy') >= 0
assert greeting.contains('Groovy')

assert greeting[6..11] == 'Groovy'
assert 'Hi' + greeting - 'Hello' == 'Hi Groovy!'

assert greeting.count('o') == 3

assert 'x'.padLeft(3) == '  x'
assert 'x'.padLeft(3,'q') == 'qqx'
assert 'x'.padRight(3,'_') == 'x__'
assert 'x'.center(3,'g') == 'gxg'
assert 'x' * 3 == 'xxx'

//On a StringBuffer,you can work with the <<(left shift)operator for appending
//and the subscript operator for in-place assignments.Using the << operator on
//String returns a StringBuffer.
greeting = 'Hello'
//left shift and assign
greeting <<= ' Groovy'
assert greeting instanceof StringBuffer
//Left shift on StringBuffer
greeting << '!'
assert greeting.toString() == 'Hello Groovy!'
//Substring 'ello' becomes 'i'
//public StringBuilder replace(int start, int end, String str)
greeting[1..4] = 'i'
assert greeting.toString() == 'Hi Groovy!'
//greeting.replace(1,5,'i')
//println greeting
/**
 * Note:Although the expression stringRef << string returns a StringBuffer,note that StringBuffer
 * isn't automatically assigned to the stringRef.When used on a String,it needs explicit assignment;
 * on StringBuffer it doesn't.Withe a StringBuffer,the data in the existing object is changed--with
 * a String you can't change the existing data,so you have to return a new object instead.
 * */