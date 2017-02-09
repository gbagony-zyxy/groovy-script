import groovy.sql.Sql

/**
 * Created by gbagony on 2017/2/9.
 */
//使用groovy可以很方便的读取文件的内容
def numbers = 0
new File('data.txt').eachLine { line ->
    numbers ++
    println "$numbers:$line"
}


