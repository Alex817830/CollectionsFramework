package example_1;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //Отличие от HashSet в том что в каком порядке введены элементы
        // в таком они и выведутся

        LinkedHashSet<String> hs = new LinkedHashSet<>();

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
