// In how many ways we can prevent the thread execution using
//  1.yeid()
//  2.Join()
//  3.sleep()
class myeildthread extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("We are in Child Thread "+i);
            Thread.yield();
        }
    }
}
public class demo6 {
    //yeild() - causes to pass the current executing thread to give the chance for waiting thread of same
    //priority. If there is no waiting thread or all have low priority , then same thread can continue
    //it's execution.If multiple thread with same priority then which waiting thread will get the chance we cannot
    //exept it depends on thread scheduler.
    // The thread which is yeilded then it will get chance one again, then it depends thread scheduler and we cannot
    //except exactly.
    public static void main(String[] args) throws InterruptedException { //Whenever we are calling join there will be intereption
        myeildthread m=new myeildthread();
        m.start();
        m.join(); // It will Wait till the Child THread has completed it'e execution
        for(int i=0;i<10;i++)
        {
            System.out.println("We are in Main Thread "+i);

        }

        /*
        A1 and A2 threads are running, if A1 wants to wait for A2 then A1 has to call Join()
         */


    }
}
