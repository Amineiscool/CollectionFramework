package javalistinterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        //List allows us to add duplicate elements
      /*  list.add("element 1");
        list.add("element 1");
        list.add("element 2");
        list.add("element 2");
        System.out.println(list);

        //List allows you to have 'null' elements
        list.add(null);
        list.add(null);
        System.out.println(list);

        // list interface maintains insertion order
        list.add("element 1");
        list.add("element 1");
        list.add("element 2");
        list.add("element 2");*/

        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");
        list.add("element 5");

        System.out.println(list);
//access elements from list
        System.out.println(list.get(0));       // access  elements from list by calling there index
        System.out.println(list.get(1));
    }
}
