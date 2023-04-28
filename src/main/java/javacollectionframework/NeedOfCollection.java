package javacollectionframework;

public class NeedOfCollection {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int g = 22;
        int f = 33;
        int v = 44;
        int s = 55;
        int d = 56;


        int[] arArray = new int [1000]; // we can store 1000 in arArray(variable)
        // not possible to increase or decrease arArray later
        //1. Arrays are fixed in size
        //2. Array can hold only homogeneous(common to the data types) data elements

       Student[] students = new Student[10];
       students[0] = new Student();
       students[1] =  new Student();
      // students[2] = new Book();
                                                                  // these are the three major limitations of an array
       Object [] objects = new Object[10];
       objects[0] = new Student();
       objects[1]= new Student();
       objects[2] = new Book();
       // 3.  ready made APIs support is not    Api= application Programming interface   examples of an api are ArrayList, HashSet, HashMap
        //available in array, no api available to write the logic for alrgorithms or
        // data structures in array.



    }

}
   class Book {

   }

   class Student{

}