import groovy.sql.Sql

import java.sql.Connection

/**
 * Created by gbagony on 2017/2/9.
 */
//打印Java类所属的包
def classes = [String, List, File, Connection]
for (clazz in classes){
    println clazz.package.name
}

println([Date,Sql,String]*.package*.name)