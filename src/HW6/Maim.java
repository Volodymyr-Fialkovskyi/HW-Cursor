package HW6;

import java.util.ArrayList;
import java.util.Collections;

public class Maim {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(9);
        num.add(11);
        num.add(18);
        num.add(20);
        num.add(22);
        num.removeIf(s -> s % 3 == 0);
        System.out.println(num);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Melon");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Orange");
        if (fruits.contains("Orange")) {
            Collections.replaceAll(fruits, "Orange", "Grapefruit");
        } else {
            System.out.println("Value Orange not present");
        }
        System.out.println(fruits);

        ArrayList<Integer> data1 = new ArrayList<>();
        data1.add(7);
        data1.add(-3);
        data1.add(-2);
        data1.add(0);
        data1.add(5);
        ArrayList<Integer> data2 = new ArrayList<>();
        data2.add(9);
        data2.add(2);
        data2.add(3);
        data2.add(8);
        data2.add(7);
        data1.retainAll(data2);
        System.out.println(data1);
    }
}