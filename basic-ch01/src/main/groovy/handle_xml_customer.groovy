/**
 * Created by gbagony on 2017/2/9.
 */
//使用groovy可以很方便地处理xml格式的文档
def customers = new XmlSlurper().parse(new File('customer.xml'))
for (customer in customers.corporate.customer){
    println "${customer.@name} works for ${customer.@company}"
}