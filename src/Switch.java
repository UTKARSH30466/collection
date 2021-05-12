import java.util.Scanner;
import java.util.*;

class Switch {
    public static void main(String[] args) {


        System.out.println("1  ARRAYLIST");
        System.out.println(" 2 LINKEDLIST ");
        System.out.println(" 3 HASHSET ");
        System.out.println(" 4 LINKEDHASHSET ");
        System.out.println(" 5 MAP ");
        System.out.println(" 6 VECTOR ");
        System.out.println("7  STACK ");
        System.out.println("*********  PLZ ENTER ANY ONE OPTION:- ********** \n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {

            case 1: {
                ArrayList<Object> k = new ArrayList<>();
                k.add("Ravi");
                k.add(12);
                k.add(15);
                k.add("Raj");
                k.add("Mohan");
                //System.out.println(k);
                k.add("c");
                k.add("c++");
                k.add("java");
                System.out.println(k);
                //k.remove(4);
                System.out.println("Remove java :--");
                k.remove("java");
                System.out.println(k);
                k.set(3, "Nt");
                System.out.println(k);
                System.out.println(k.contains("amar"));
                ;
                System.out.println(k.get(3));
                System.out.println(k.size());
                k.remove(0);
                System.out.println(k);
                //   k.clear();
                System.out.println(k);
                System.out.println("****************");
                for (int i = 0; i < k.size(); i++) {
                    System.out.println(k.get(i));
                }
                //System.out.println(k.sort(););
            }
            break;
            case 2: {

                LinkedList<Object> l = new LinkedList<>();
                l.add(22);
                l.add("utkarsh");
                l.add(90);
                l.add("bcA");
                //System.out.println("");//
                l.add(2, "reads in");
                System.out.println(l);
                l.addFirst("i am ");
                System.out.println(l);
                l.addLast("in s.s college");
                System.out.println(l);
                l.remove("bca");
                l.removeFirst();
                System.out.println(l);
                System.out.println(l.get(2));
                System.out.println(l.getLast());
                l.set(1, "AMAR KUMAR");
                System.out.println(l);
                System.out.println(l.size());
                //l.clear();
                System.out.println(l);
                System.out.println("*******************");
                for (int i = 0; i < l.size(); i++) {
                    System.out.println(l.get(i));
                }
            }
            break;
            case 3: {
                HashSet<Object> h = new HashSet<>();
                h.add(5);
                h.add("ram");
                h.add(5);// it will not print dublicate are not allowd in set
                System.out.println(h);
                h.add("sita");
                h.add(65);
                h.add("amar");
                System.out.println(h);
                h.remove(65);
                System.out.println(h);
                System.out.println(h.contains("amar"));
                System.out.println(h.isEmpty());
                System.out.println(h.size());
                System.out.println(h.hashCode());
                // h.clear();
                System.out.println(h);
                System.out.println("*********************");
                for (int i = 0; i < h.size(); i++) {
                    System.out.println(((List<Object>) h).get(i));
                }
            }
            break;
            case 4: {
                Vector<Object> v = new Vector<>();
                v.addElement(5);
                v.addElement("amar");
                v.add(8);
                System.out.println(v);
                System.out.println(v.get(1));
                System.out.println(v.firstElement());
                System.out.println(v.lastElement());
                System.out.println(v.contains(6));
                System.out.println(v.indexOf(1));
                v.remove(8);
                System.out.println(v);
                v.set(0, "name");
                v.addElement(67);
                System.out.println(v);
                System.out.println(v.capacity());
                // v.clear();
                // System.out.println(v);
                for (int i = 0; i < v.size(); i++) {
                    System.out.println(v.get(i));
                }
            }
            break;
            case 5: {
                System.out.println("stack:- ");
                Stack<Object> s = new Stack<>();
                s.push(56);
                s.push("amar");
                s.add(45);// it implement also list collection method
                for (int i = 0; i < s.size(); i++) {
                    System.out.println(s.get(i));
                }
                break;
            }
            case 6: {
                System.out.println("LINKEDHASHSET:-");
                LinkedHashSet<String> al = new LinkedHashSet<String>();
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
                break;
            }
            case 7: {
                Map<Integer, String> map = new HashMap<Integer, String>();
                map.put(100, "Amit");
                map.put(101, "Vijay");
                map.put(102, "Rahul");
                //Elements can traverse in any order
                for (Map.Entry m : map.entrySet()) {
                    //System.out.println(m.getKey()+" "+m.getValue());
                    //Returns a Set view of the mappings contained in this map
                    map.entrySet()
                            //Returns a sequential Stream with this collection as its source
                            .stream()
                            //Sorted according to the provided Comparator
                            .sorted(Map.Entry.comparingByKey())
                            //Performs an action for each element of this stream
                            .forEach(System.out::println);
                    //Returns a Set view of the mappings contained in this map
                    map.entrySet()
                            //Returns a sequential Stream with this collection as its source
                            .stream()
                            //Sorted according to the provided Comparator
                            .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                            //Performs an action for each element of this stream
                            .forEach(System.out::println);
                    break;
                }
            }
                default: {
                    System.out.println("PLZ ENTER CORRECT CHOICE TO IMPLEMENT");
                }


            }
        }
    }


