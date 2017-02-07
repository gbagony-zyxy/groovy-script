/**
 * 映射方法一览
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
println alphabet.keySet()