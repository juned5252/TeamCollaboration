package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        list.set(3,"K");
        System.out.println(list.get(3));
    }
}
