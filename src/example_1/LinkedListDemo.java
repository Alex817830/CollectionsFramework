package example_1;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //create LinkedList
        LinkedList<String> ll = new LinkedList<>();
        //add elements
        ll.add("U");
        ll.add("T");
        ll.add("E");
        ll.add("O");
        ll.add("V");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1,"A2");

        System.out.println("Исходное содержимое связанного списка ll: "+ll);

        //remove elements
        ll.remove("T");
        ll.remove(2);
        System.out.println("Содержимое связанного списка ll после удаления элементов: "+ll);

        //remove first and last elements
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связанного списка после " +
                "удаления первого и последнего элементов: "+ll);

        //получить и присвоить значение
        String val = ll.get(2);
        ll.set(2,val + " изменено");

        System.out.println("Содержимое связанного списка ll после изменения: "+ll);
    }
}
