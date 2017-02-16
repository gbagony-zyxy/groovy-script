/**
 * Created by gbagony on 2017/2/16.
 * 注解详情参见GDK
 * @Grab注解依赖于Ivy,要将Ivy添加进来,主要作用是为脚本添加局部的依赖
 */
//此处声明引入commons-lang包
//在编译期间和运行期间根据需要下载jar包并添加到classpath下
@Grab('commons-lang:commons-lang:2.6')
import org.apache.commons.lang.ClassUtils

class Outer{
    class Inner{}
}

assert !ClassUtils.isInnerClass(Outer)
assert ClassUtils.isInnerClass(Outer.Inner)


