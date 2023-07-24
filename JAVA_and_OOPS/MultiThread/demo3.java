
class myThread2 extends Thread{

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("We are in Child Thread");
        }
    }
    public void run(int x) //Overloading method of run method is always
    {
            System.out.println("We have"+x);
    }

    /*public void start() //start method will be executed like normal method and no threading
    {
    super() // This will call thread class start
        System.out.println("We are running in start");
    }*/ //Don't do this as it will defeat purpose of multithreading

}
public class demo3 {
    public static void main(String[] args) {
        myThread2 t1=new myThread2();
        t1.start(); // We cannot call t1.start(10)
        t1.run(10); // we can run this as normal method, we have to call explicity

    }
}

// if myThread2 class doesn't have any run method it will call parent  super class method will be executed.
//It's a empty class and we won't print anything.
//If we are nor overinding run method  then we don't need anything

// If we override the start method , it will behave like normal method and new thread won't be created.
//thread class start method call run method

/*myThread2 t=new myThread2()
        (new/born)
            |
            | t.start()
            |
        (Ready/Runnable)
            |
            |ts allowed proceed
            |
        (Running)
            |
            | Run completes
            |
        (Dead State)

// If we restart the thread after the start of thread we will get Run time Exception, Illegal thread state exception




 */