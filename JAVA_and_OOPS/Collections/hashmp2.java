import java.util.*;

public class hashmp2 {
    //LinkedHashMap , It is child class of HashMop
    //In hashmap we use underlying structure of hashtable but LinkedMap we use LinkedList and HashTable
    //THe order of insertion is not preseved in hashtable(based on hashcode) but in LinkedMap the order of insertion is preserved.
    public static void main(String[] args) {


        LinkedHashMap<Integer, Integer> mp1 = new LinkedHashMap<Integer, Integer>();
        mp1.put(10, 20);
        mp1.put(11, 90);
        mp1.put(12, 120);
        mp1.put(13, 10);
        System.out.println(mp1); //THe order is preserved
        //It is used to develop a Cache Based Applications. hasmap uses .equals to check the key
        //Identity Hashmap,In the case of normal hasmap JVM will use .equals to check keys , But in indentity map it will use == operator to identify duplicate keys
        //which is meant for refernce comparison.
        // Garbage Collector is less powerful in hashmap but more powerful than weak hashmap

        //If we want to represent a group of key in sorted order in map then we go for sortedMap
        TreeMap<Integer,String> t=new TreeMap<Integer, String>();

        //Hashtable - Null is not allowed for key and values,
        //It will print top to bottom and then left to right in hashtable.It will is store in table after processing the hashtable
        Hashtable h= new Hashtable<>();
        h.put(5,"a");
        System.out.println(h);



    }



}
