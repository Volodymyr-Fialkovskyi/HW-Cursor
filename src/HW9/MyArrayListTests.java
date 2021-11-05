package HW9;

public class MyArrayListTests {
    public static void main(String[] args) {
        checkArrayIsEmpty();
        checkIfArrayIsAddingElements();
        checkIfArrayIsAddingElementsToItsEnd();
        checkIfArrayRemovingElement();
        checkIfArrayIsAddingElementToIndex();
        checkIfParticularElementIsInArray();
        checkArrayIndexOutOfBounds();
    }

    static void checkArrayIsEmpty() {
        MyArrayList a = new MyArrayList();
        if (a.size() <= 0)
            System.out.println("Is empty: " + a.isEmpty());
        System.out.println("---");
    }

    static void checkIfArrayIsAddingElements() {
        MyArrayList b = new MyArrayList();
        b.add(5);
        if (b.contains(5))
            System.out.println("Added element on index " + b.indexOf(5));
        System.out.println("The Number of elements : " + b.size());
        System.out.println("---");
    }

    static void checkIfArrayIsAddingElementsToItsEnd() {
        MyArrayList c = new MyArrayList();
        c.add(7);
        c.add(3);
        c.add(8);
        c.add(5);
        c.add(2);
        c.add(1);
        c.add(52);
        if (c.contains(52))
            System.out.println("The Array has added element to its end " + c.indexOf(52));
        System.out.println("The Number of elements : " + c.size());
        System.out.println("---");
    }

    static void checkIfArrayRemovingElement() {
        MyArrayList d = new MyArrayList();
        d.add(6);
        d.add(3);
        d.add(7);
        d.add(5);
        System.out.println("Element at index 1 before removal: " + d.get(1));
        System.out.println("The Number of elements : " + d.size());
        d.remove(d.get(1));
        System.out.println("Element at index 4 after removal: " + d.get(1));
        System.out.println("The Number of elements : " + d.size());
        System.out.println("---");
    }

    static void checkIfArrayIsAddingElementToIndex() {
        MyArrayList e = new MyArrayList();
        e.add(3, 3);
        e.add(5, 7);
        e.add(2, 4);
        e.add(1, 4);
        System.out.println("Element at index 3 before = " + e.get(3));
        e.add(1, 12);
        System.out.println("Element at index 3 after = " + e.get(3));
        System.out.println("Element at index 4 after = " + e.get(4));
        System.out.println("---");
    }

    static void checkIfParticularElementIsInArray() {
        MyArrayList f = new MyArrayList();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(9);
        f.add(10);
        System.out.println("Is 5 in array? " + f.contains(5));
        System.out.println("---");

    }

    static void checkArrayIndexOutOfBounds() {
        MyArrayList g = new MyArrayList();
        g.add(3);
        g.add(6);
        g.add(5);
        g.add(8);
        g.add(10);
        System.out.println(g.get(6));
    }
}
