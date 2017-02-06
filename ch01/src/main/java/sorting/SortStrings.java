package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by gbagony on 2017/2/6.
 */
public class SortStrings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("this");
        strings.add("is");
        strings.add("a");
        strings.add("list");
        strings.add("of");
        strings.add("strings");

        Collections.sort(strings);
        System.out.println(strings);
    }
}
