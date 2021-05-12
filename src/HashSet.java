import java.util.*;
 class Hashset{
    public static void main(String args[])
    {
       /* HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("A");
        hashSet.add("A");
        hashSet.add("A");
        hashSet.add("A");
        System.out.println(hashSet);*/
        HashSet<String> hashSet = new HashSet<>();

//2. Add elements to HashSet
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");

        System.out.println(hashSet);

//3. Check if element exists
        boolean found = hashSet.contains("A");        //true
        System.out.println(found);

//4. Remove an element
        hashSet.remove("D");

//5. Iterate over values
        Iterator<String> itr = hashSet.iterator();

        while(itr.hasNext())
        {
            String value = itr.next();

            System.out.println("Value: " + value);
        }


    }


}