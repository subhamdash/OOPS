//Every Thread has some prioriyt or customised priority provided by customer.
//Valid Range of thred priorities is 1-10. 1 is min and 10 is max
//Thread class defines following constant to represent some constnats
class mythread extends Thread{

}
public class demo5 {
    public static void main(String[] args) {
        System.out.println(Thread.MIN_PRIORITY); //1 -- Lowest
        System.out.println(Thread.MAX_PRIORITY); //10
        System.out.println(Thread.NORM_PRIORITY); //5
        // If two pairs have same priority we cannot except exact execution order, it dependes thread scheduler
        System.out.println(Thread.currentThread().getPriority());
       Thread t= new Thread();
        System.out.println(t.getPriority()); //Default is 5
       t.setPriority(7); // will get error if set above 7
       System.out.println(t.getPriority()); // we are only setting the child thread so the main thread will stay un affected
        System.out.println(Thread.currentThread().getPriority());
       //Default Priority will be inherited from parent to child

    }
    // Some of the OS and Windows doesn't provide the Priorities.

}
