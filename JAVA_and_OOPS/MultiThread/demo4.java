//Defining a thread using runnable interface.We just elminates  the thread class
 class myRunnable implements Runnable{

    public void run()
        {

            System.out.println("Child Thread");

        }
}
public class demo4 {

    //Runnable Interfeace present in java.land method and it contains only one method that is run method
    public static void main(String[] args) {
        myRunnable m=new myRunnable();
        //myRunnable doesn't contain any start method nor does the Runnable method contain any start method.
        Thread t =new Thread(m);// as t.start will call empty implementation, so we pass the object of m.
        //m which is passes is target runnable

        t.start();

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Custom THread"); // We are renaming the default name
        System.out.println(Thread.currentThread().getName());
        System.out.println(t.currentThread().getName());


        //Thread t1 =new Thread();
        //Thread t2 =new Thread(m);
        //Case 1: t1.start();  --A new thread will be created
        //Case 2: t1.run(); --Normal execution will take place.
        //Case 3: t2 .start(); myRunnable will be executed
        //Case 4: r.start(); // It will give error cannot find symbol
        //Case 5: r.run(); // Normal execution no multi threading will take place

    }

}

/*
This is better approaches than the extending the class method.
When we extend a thread class, we cannot extend another class as multiple inhertiance is happening which violates java
but in implemets Runnable we can use multiple inhertiance as well
 */

/*
Thread class Consrturctor
 */


