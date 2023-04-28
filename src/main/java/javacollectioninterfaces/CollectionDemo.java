package javacollectioninterfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> foodCollection = new ArrayList<>();  //now we created a collection object now we need to add elements to the collection.
        foodCollection.add("banana");
        foodCollection.add("apple");
        foodCollection.add("mango");
        System.out.println(foodCollection);

        foodCollection.remove("apple");                        //used to remove an element from the collection
        System.out.println(foodCollection);

        foodCollection.contains("mango");                     //checks if an element is in the collection
        System.out.println(foodCollection.contains("mango"));

        foodCollection.clear();
      System.out.println(foodCollection);          // used to clear


    }
}
