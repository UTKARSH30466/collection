/* import java.util.*;
public class ListExample1 {
    public static void main(String args[])
    {
        List <String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Grapes");
        Collections.sort(list);
        System.out.println(list);

    }
}*/
import java.util.*;
public class ListExample1{
    public static void main(String args[]){
        //Creating a List
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
       // for(String fruit:list)
        Collections.sort(list);
            System.out.println(list);

      /*  List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for(Integer number:list2)
            System.out.println(number);*/
    }
}


