import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map is not child interface of collection
public class hashmp {
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        //Colection Releatable cannot be used here . We have to use put, return type is object.
        mp.put(20,0);
        mp.put(30,1); //
        mp.put(20,2); //It will replace old value and will return old values

        Map<Integer,Integer> mp1=new HashMap<Integer,Integer>();
        mp1.put(10,3);
        mp1.put(50,13);

        mp.putAll(mp1); //A group of key value pair to map

        System.out.println(mp.get(20)); //To get the value
        System.out.println(mp.get(10)); //will get the null

        System.out.println(mp); //We will get on the basis of key values hascode rather than oder of insertion
        //TO get all the keys
        Set s=mp.keySet();
        System.out.println(s);
        //Collection to get all the values
        Collection c=mp.values();
        System.out.println(c);

        Set s1=mp.entrySet();
        System.out.println(s1);




        mp.remove(30);

        System.out.println(mp.containsKey(20)); //Check if the key is there or not
        System.out.println(mp.containsValue(13)); //Check if the value is there or not

        System.out.println(mp.isEmpty()); // Check if it's empty or not
        System.out.println(mp.size());
        mp.clear();
        System.out.println(mp.size());

        //set keyset, collection calues and set entrySet are collection views of map

        //Entry Interface
        /*

        interface map
        {
            interface Entry
            {
            object getKey()
            Object get values()
            }
        }
//each key value is called key value pair and is called object. Without exisitng map object there is no chance of entry objects. Hence entry interface is define in
map interface. The underlying data structure is hashtable and it based on hash code of key.Duplicate keys are not allowed. Hetrogenous objects are allowed for both key and value.
Null is allowed for key only once. Null is allowed for value many number of time. Hashable allows Serializable but not random access.

HashMap m= new HasMap(); 16 as default capacity
HashMap m = new HashMap(int intialcapacity);
HashMap m = new HashMap(int capcity, floatfillRataio)



Hashmap - Not Syncronised,multiple thread so not thread safe,high performance,null key and value are allowd
Hastable. - Synchronised, thread safe, Low performace,null key or value is allowed
By default Hashmap is non syncronized, but we can get synchronizedmap() method of collection class
HasMap m=new HasMap();
Map m1=Colllections.syncronizedmap(m);
         */













    }
}
