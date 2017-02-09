/**
 * 映射方法一览
 * 高野健一
 */

//containsKey,containsValue,get,getAt,KeySet,put,putAt,size,values方法
def alphabet = ['a':'ant','b':'boil','c':'concern','d':'diff',1:1111,2:1212,3:3333,4:7474]

println alphabet.containsKey('c')
println alphabet.containsValue(1111)
//get()方法只会查询关键字,不存在getAt()方法的功能
println alphabet.get(0)
println alphabet.get('a')
println alphabet.get('e','balala')
println alphabet.getAt(1)

//put()
println alphabet.put('wh','wywh')
println alphabet.put(5,55555)
println alphabet
println alphabet.putAt('jj','gg')
println alphabet

println alphabet.size()
println alphabet['b']
//获取所有键或值
println alphabet.keySet()
println alphabet.values()
//value()返回包含映射值的一个集合，可以将其作为一个list看待
println alphabet.values().asList().size()