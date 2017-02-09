/**
 * 范围是表示特定序列值的一种简略方法
 * 范围的方法一览
 */
//范围的一般表示方法
println 0 .. 10
println 0 ..< 10
println 'A' .. 'D'
println 10 .. 1
println 'Z' .. 'X'

//范围也可以通过整形表达式表示
def start = 10
def end = 15
println start .. end + 1

//范围方法
//contains、get、getFrom、getTo、isReverse、size、subList
def rangeVar = 'A' .. 'F'
def reverseRangeVar = 'F' .. 'A'
println rangeVar.contains('C')
println rangeVar.contains('c')
println rangeVar.contains(1)
println rangeVar.size()
//返回当前范围中指定位置的元素值
println rangeVar.get(1)
//获取当前范围中下表最小的元素值
println rangeVar.getFrom()
//获取当前范围中下标最大的元素值
println rangeVar.getTo()
//当前范围是否为逆序
println reverseRangeVar.isReverse()

//返回当前范围中给定的fromIndex(包含)到toIndex(不包含)之间的所有值
println rangeVar.subList(2,4)