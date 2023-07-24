class myThread extends Thread{

    public void run()
    {
        // This is called Job of the Thread, and it will get executed by Child THread
        for(int i=0;i<10;i++)
        {
            System.out.println("We are in Child Thread");
        }
    }

}
public class demo2 {
    //By extending thread class
    //By Default there are only one thread;
    public static void main(String[] args) {
        myThread t=new myThread(); // Thread Instansitaion , Main THread creates Child THread
        t.start(); //Main Thread starts Child Thread
        t.run(); // If we use t.run then it will run like normal program so no multi threading and no new thread
        //After the t.start there will be tow thread, child will run the above one and Parent will run below one

        for(int i=0;i<10;i++)
        {
            System.out.println("We are in Parent Thread");
        }
        // When we run we will get multiple Output as they are running parallely

    }
    // Thread Scheduler- It's part of JVM and schedules the thread,In which order the thread will get executed
    //by thread scheduler, we cannot expect algorithm followed by thread scheduler varies from JVM to JVM.


}
// Thread class start method is responsible without start we cannot start a new thread in java

//start() {
//Register thread with thread scheduler
//Perform all other mandatory activites
//Invoke run method }
