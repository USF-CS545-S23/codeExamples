package interfaces;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shows how to use an iterator to iterate over an ArrayList
 */
public class IteratorInterfaceExample {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(1);
        list1.add(4);
        list1.add(19);
        list1.add(2);

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            Integer elem = it.next();
            System.out.println(elem);
        }
    }
}
