/**
 * list类型值的映射
 */
//映射的单个元素一般通过下表运算符访问(通过getAt()方法实现)
def names = ['Ken':'Barclay','John':'Savage']
def divisors = [4:[2],6:[3,2],12:[6,4,3,2]]
println names['Ken']
println names.Ken
println names['Jessie']
println divisors[6]

//putAt()方法也支持在赋值语句左侧使用索引
divisors[6] = [6,3,2,1]
println divisors

//映射的关键字也都是对象,以下第一个key为Integer对象,第二个为String对象,能够正确返回需要的结果,但该种方法不可取
def careful = [1:'Ken','1':'Barclay']
println careful[1]
println careful['1']

