package example_1;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множиство
        HashSet<String> hs = new HashSet<>();

        //ввести элементы в хеш-множиство
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Echo");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println("Show all: "+hs);


    }
}
