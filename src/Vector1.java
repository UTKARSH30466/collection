import java.util.*;
 class Vector1 {
     public static void main(String args[]) {
         //Create a vector
         Vector<String> vec = new Vector<String>();
         //Adding elements using add() method of List
         vec.add("Tiger");
         vec.add("Lion");
         vec.add("Dog");
         vec.add("Elephant");
         //Adding elements using addElement() method of Vector
         vec.addElement("Rat");
         vec.addElement("Cat");
         vec.addElement("Deer");

         System.out.println("Elements are: " + vec);
         Vector<String> vec2 = new Vector<>(4);
         //Add elements in the second vector
         vec2.add("A");
         vec2.add("B");
         vec2.add("C");
         vec2.add("D");
         //Add elements of the vec2 at 1st element position in the vec1
         vec.addAll(0, vec2);
         //Printing the final vector after appending
         System.out.println("Final vector list: " + vec);
         //Add new element
         vec.addElement("JavaTpoint");
         //After addition, print all the elements again
         System.out.println("---Elements after addition--- ");
         for (String str : vec) {
             System.out.println("Element= " + str);
             //capacity Method
             System.out.println("Current capacity of Vector is: " + vec.capacity());
         }
     }
 }
