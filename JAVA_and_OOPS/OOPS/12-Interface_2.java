public class DecMod5 {
    // The interface which doesn't contain any methods and by implementing that interface if objects will get some abilities
    // are know as marker interaface. Serializable,Clonable,Random access, singlethreadmodel. These are marked as some ability.
    //Tag interface
    //By implementing serializable, our objects can be stored into table and can travel across the table.
    //Internally JVm is responsible to provide ability to makrer interface
    //WE can design our own JVM so that we can create our own Marker Interface

    //Adapter class - there are 100 methods in interface I want to implemted for only one method ,
    // but it will give compile time error
    //as we are not able to implement for rest 99 methods.
    //We will implemente the interface to a class name something i.e.
    // adapter x. Then we will extend that adapterx and will use methods for our use.

    // plan(Interface)  ---- partially completed building(abstract) ------ Concrete Class(Fully completed Building)
    //IF we don't know any thing about implementation the we should go interaface.
    //If we are taking about implementation but not completely , partaily interace, then we should go for abstract class
    //If we are taking about implementation completely and ready to provide service.
    /*
    interface- don't know implementation         | 100 % pure abstract      | can't use private,final,static,sync etc.. |every variable public,static,final
              | We need to intialize at declaration | static,instance block or  constructor are not allowed | Inside static class
    abstract- Implemtation known, not completely | concrete,private,public  | abstract class constructor will be executed whenever we are creating child class
    object to perform intialization of child class object.
    //Use super to send the data to constructor so that it will help in code re-usability

     */




}
