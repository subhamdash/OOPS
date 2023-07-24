/*If multiple people operation on same data we need SYnchonisation or to resolve Data Inconsistency
If method is declared as  Sycnroniser is the modifier applicable only for methods and blocks but not for classes
 and variable
If multiple java threads are trying to operate on the same jave object , then there may be a chance of data inconsistency
problem. To overcome this problem we should go Synchronised Keyword. If method or block declared as Sync, then only one thread
allowed to execute on the given thread so that Data inconsistency problem will be resolved.
The thread are executed on by one then it will increases waiting  time.
 */

    /*Internally the Sync is implemented using Lock concept, Every Object in java has unique Lock,
    JVM is automaticaly take care of Lock, If thread wants to execute Sync on the given object then it need Lock of
    that Object While a Thread executing any synchronized method the remaining Threads are not allowed execute
    any synchronized method on that object simultaneously. But remaining Threads are allowed to execute
    any non-synchronized method simultaneously. [lock concept is implemented based on object but not based on method].
     */
    /* When ever there is any modification or update then use Sync method and for read only for normal method

     */

class Display{
    public static synchronized void wish(String name)
    {
        for(int i=0;i<10;i++)
        {
            System.out.print("Hello : ");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException ie)
            {

            }
            System.out.println(name);
        }
    }
}
class sync extends Thread{

    Display d;
    String name;
    sync(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()

    {
        d.wish(name);
    }
}

public class demo9Sync {
    public static void main(String[] args) {
        Display d = new Display();
        Display d2 = new Display(); // if we create second object we will get error as well as it is accesng different object
        sync s=new sync(d,"Dhoni"); // Here when the display method is not synchronised
        sync s1=new sync(d2,"Yuvi"); //Both are accessing same object hence we will get irregular output as we have
        //not declared synchornised to the class till now, when declared synchornised to the display class it work fine
        //
        s.start();
        s1.start();
        // If multiple thread operating on multiple object then there is no need of synchronisation.
        //If we make the display method with static synchronized , class level lock , above is using object level lock
        // If a thread want to execute static synchronized it need object level lock.Two lock object level and class level lock
        //Class level Lock
        //When a thread gets static synchronized class it gets Class level Lock.

    }

}


