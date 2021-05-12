import java.util.*;
 class TreeSet1 {
    public static void main(String args[])
    {
        //1. Create TreeSet
        TreeSet<String> TreeSet = new TreeSet<>();

//2. Add elements to TreeSet
        TreeSet.add("A");
        TreeSet.add("B");
        TreeSet.add("C");
        TreeSet.add("D");
        TreeSet.add("E");
        System.out.println(TreeSet);
        //3. Check if element exists
        boolean found = TreeSet.contains("A");        //true
        System.out.println(found);
        //4. Remove an element
        TreeSet.remove("D");
        //boolean isEmpty = TreeSet.contains("B");
        System.out.println(TreeSet);

//5. Iterate over values
        Iterator<String> itr = TreeSet.iterator();

        while(itr.hasNext())
        {
            String value = itr.next();

            System.out.println("Value: " + value);
        }
       // Convert TreeSet to Array
        String[] values = new String[TreeSet.size()];

        TreeSet.toArray(values);

        System.out.println(Arrays.toString(values));

    }
}
