
import java.util.*;
class LinkedHashSet2{
    public static void main(String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Mohan");
        al.add("Ajay");
       // Iterator<String> itr=al.iterator();
        //while(itr.hasNext()){
            System.out.println(al);
        //3. Check if element exists


       // boolean found = al.contains("Ravi");        //true
       // System.out.println(found);
        // Remove
        al.remove("Ajay");
        System.out.println(al);
        }
    }

