import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by ruyin on 2017/3/6.
 * 禁止使用对象去调用静态常量,需要使用直接使用类名去引用
 * 比较两个对象是否相等建议使用Objects类中的equals()方法
 * 所有的相同类型的包装类对象之间值得比较，全部使用equals方法比较
 *
 * 关于基本数据类型与包装书记类型的使用标准：避免了NPE风险
 * 1、所有的POJO类属性必须使用包装数据类型
 * 2、RPC方法的返回值和参数必须使用包装数据类型
 * 3、所有的局部变量推荐使用基本数据类型
 */
public class StaticConstTest {

    @Test
    public void testVar(){

        String str = new String();
        Integer i = new Integer(0);
        assert Objects.equals("","");
        System.out.println(new Integer(-999999999).toString());

        new ArrayList<String>(){{
            add("a");
            add("b");
        }};

        new ArrayList<String>(){
            @Override
            public boolean add(String s) {
                return super.add(s);
            }
        };
    }

    @Test
    public void test(){
        double score = 100.5;
        System.out.println(score/10);

    }
}
