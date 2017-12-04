package example_1;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // создание древовидного множества типа TreeSet
        TreeSet<String> ts = new TreeSet<>();

        //add elements
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

        System.out.println(ts.subSet("C","F"));
    }
}
