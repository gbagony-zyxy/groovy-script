import java.awt.Point
import java.awt.Rectangle

/**
 * Created by gbagony on 2017/2/17.
 * 在转换(List、Map等)的时候Groovy提供了方便的逻辑
 */

Point topLeft = new Point(0,0)  //classic
Point botRight = [100,100]      //List cast
Point center = [x:50,y:50]      //Map cast

assert botRight instanceof Point
assert center instanceof Point

def rect = new Rectangle()
rect.location = [0,0];      //set()方法
rect.size = [width:100,height:100] //set()方法,也可不指定命名参数

println 1+1
println 1+'1'