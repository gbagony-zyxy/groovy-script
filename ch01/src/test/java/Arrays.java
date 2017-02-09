import org.junit.Test;

/**
 * 细致入微
 */
public class Arrays {
    //toArray()是将Collection类型数据转换为数组类型的方法，无参的toArray()转换之后的数组类型是Object[],Object[]类型转为其他具体类型(String[])比较麻烦
    //toArray(T[] a)具参的方法解决该问题：如果指定的数组能够容纳该Collection，则返回包含此Collection元素的数组。否则，将根据指定数组的运行时类型和此Collection
    //      的大小分配一个新数组，如果指定参数的数组长度为0，那么每次都会生成新数组包含此Collection中的所有元素并返回。
    @Test
    public void testList(){
        Integer[] ints = java.util.Arrays.asList(1,22,3,44,5).toArray(new Integer[0]);
        java.util.Arrays.stream(ints).forEach(s-> System.out.println(s));
    }
}
