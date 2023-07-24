public class collectio1 {
    //Collection is interface , Root inteface of collection. If we want to represent a group of invariable group as single entity. We should go for collection.
    //Collection interface, most common method which are applicable for any collection object.
    //There is no concrete class which implements which implemts collection directly.
    //What is difference b/w collection and collections?
    //Collection is an interface, Collections is a class, Collections defined several utility method, present in java.util package
    //Sorting Searching etc,List it is child interface of collection Interface.
    //Collection(I)----------->List(I) ---------> ArrayList,LinkedList,Vector,Stack
    //Collection(I)----------->Set(I)------->HashSet,LinkedHashSet
    //        |                   |
    //        |              SortedSet(I)  ------>NavigableSet(I) ----->TreeSet
    //      Queue(I) (FiFo but can be modified)

    /*
    add()
    addAll()
    remove()
    removeAll()
    clear()
    retainAll()- Except this group of object remove all the groups
    contains()
    containsAll()
    isEmpty()
    size()
    toArray()
    iterator()

     */


    //List has get(element),set(index,element),indexOf(element),lastIndexOf()
    //ArrayList l=new ArrayList() with default intial capacity 10 once arry list reaches it's max capacity with new_capacity=current_capcity*1.5 +1
    //It can take hetrogenous object as well
    //Vector is doubling it as it increases
    //In Vector we have addElement
    //Stack --- It is the child class of the vector  , pop(),peek(),empty(),search(),empty()
    //Vector v =new Vector(); v=[1,2,3,4]
    //Enumuration e = v.elements();
    //while(e.hasmoreElements()) Integer I = (Integer)e.nextElement();




}
