/**
 * List提供的方法一览
 */

def list = []
//add、addAll、contains、flatten方法
list.add('bill')
list.addAll('jack','joe','bob','tom')
list.add(3,3)
println list.contains('eric')
list.flatten()
println list

//get、getAt方法
println list.get(2)
println list.getAt(2)
println list.getAt([0..2])
println list.getAt([1,4])

//intersect、isEmpty、leftShift、minus、plus方法
println list.intersect(['a','b','c'])
println list.isEmpty()
println list.leftShift('a')
println list << 100
//生成新列表,元素由原始列表中那些不包含在collection参数中的值组成
println list.minus(['a','b','jack'])
println list.plus('ccc')
println list.plus(['aaa','bbb','cdf'])


//pop,putAt,remove,reverse,size,sort方法
println list.pop()
println list.putAt(2,'jooe')
println list.remove(0)
println list.remove('jack')
println list.reverse()
println list.sort()

//remove方法需要注意的一点
def nums = [11,12,13,14]
//第一次调用remove方法删除list对应索引位置的数据
//第二个remove本意是想删除对应数据，然而程序仍然想删除对应索引位置数据，故抛出数组越界异常
nums.remove(3)
nums.remove(13)

//使用字符串参数就能避免以上错误
def names = ['Ken','John','Sally','Jon']
names.remove(3)
names.remove('Ken')