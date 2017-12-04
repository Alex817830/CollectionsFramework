package example_1;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        //create ArrayList<>
        ArrayList<Integer> a1 = new ArrayList<>();

        //add elements
        a1.add(4);
        a1.add(1);
        a1.add(2);
        a1.add(3);

        //show all
        System.out.println("Содержимое списочного массива a1: "+a1);

        //get Array
        Integer ia[] = new Integer[a1.size()];
        ia = a1.toArray(ia);

        int sum = 0;

        //sum all elements
        for (int i:ia) {
            sum +=i;
        }
        System.out.println(sum);


    }
}
