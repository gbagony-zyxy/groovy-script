/**
 * List类型的一般操作
 */

def numbers = [11,12,13,14]
println numbers[0]
println numbers[3]
//若索引为负数,则其索引的元素从列表末端向前移动
println numbers[-1]
println numbers[-2]
//索引段同样适用于列表
def num = [11,12,13,14][2]     //值为13
println num

//范围索引示意
println numbers[0..2]
println numbers[1..<3]

//使用列表的索引操作符同样能够为列表赋新值
//notice:1、赋值语句右侧的值将替换赋值语句左侧给定的索引位置的元素值，索引值只能是一个整型表达式
// 2、如果赋值语句右侧本身就是一个列表对象，则使用列表对象替代左侧的索引元素值
// putAt方法提供了赋值语句的功能
numbers[1] = 22
numbers[2] = [33,44]
println numbers

//通过<< 运算符(leftShift方法),可以将一个新元素值追加到列表的最后
def arrays = [1,2,3]
arrays << 4
println arrays

//使用 + 操作符(plus方法)可以连接两个列表
println arrays + [5,6,7,8]
arrays.intersect([5,6,7,8])
println arrays

//使用 - 操作符(minus方法)从列表中删除元素
println arrays - [2]