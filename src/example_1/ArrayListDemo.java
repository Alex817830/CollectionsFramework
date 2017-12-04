package example_1;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // создаем списочный массив
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Начальный размер списочного массива arrayList: "+arrayList.size());

        //add values
        arrayList.add("V");
        arrayList.add("S");
        arrayList.add(1,"R");
        arrayList.add("U");
        arrayList.add("H");
        System.out.println("Размер списочного массива после ввода элементов: "+ arrayList.size());

        //show all
        System.out.println("Содержимое списочного массива :"+arrayList);

        //remove
        arrayList.remove("S");
        arrayList.remove(2);

        System.out.println("Размер списочного массива после удаления элементов: "+arrayList.size());

        System.out.println("Содержимое списочного массива: "+arrayList);


    }
}
