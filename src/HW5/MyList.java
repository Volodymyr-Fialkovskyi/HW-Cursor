package HW5;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(7);
        myList.add(5);
        myList.add(3);
        myList.add(1);
        myList.add(-4);
        myList.add(0);

        System.out.println("Largest Number is: " + myList.max());
        System.out.println("Smallest Number is: " + myList.min());


    }
}


public class MyList<T extends Number> {
    List<T> list = new ArrayList<>();


    public void add(T add) {
        list.add(add);

    }

    public T max() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).longValue() > value.longValue()) {
                value = list.get(i);
            }

        }
        return value;
    }

    public T min() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() < value.doubleValue()) {
                value = list.get(i);
            }
        }
        return value;
    }


}