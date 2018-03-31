package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(16);

        List<String> stList = new ArrayList<>();
        stList.add("A");
        stList.add("B");
        stList.add("C");

        for(String it:stList){
            System.out.println(it);
        }
    }
}
