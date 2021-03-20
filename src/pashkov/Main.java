package pashkov;

public class Main {

    public static void main(String[] args) {
	    // 1) It is necessary to create a class similar to the standard ArrayList <Integer> based on an array.
        //    And implement 5 methods:
        //    add - add a value to the list
        //    get - get by index
        //    set - replace by index
        //    size - return size, initially 0
        //    toString - prints the list nicely
        //    The add method logic:
        //    create a temporary array 1 element more than arr, copy all elements from arr into it,
        //    write a new element to the last position and replace arr with a temporary array.
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 123);
        System.out.println(list);
    }
}
