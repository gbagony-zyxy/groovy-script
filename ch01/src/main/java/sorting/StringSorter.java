package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by gbagony on 2017/2/6.
 */
public class StringSorter {
    //通过字母表排序
    public List<String> sortLexicographically(List<String> strings) {
        Collections.sort(strings);
        return strings;
    }

    //通过字符串长度排序
    public List<String> sortByDecreasingLength(List<String> strings) {
        Collections.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });
        return strings;
    }
}
