
//If we are using sleep we need use throws or try catch to avoid IE .
class mythreadsleep extends Thread{
    static Thread mt;
    public void run()
    {
        try {
            mt.join(); // Child Thread Waits for Main Thread to compile
        }
        catch (InterruptedException ie) {
        }
            for(int i=0;i<10;i++) {
                System.out.println("We are in Child Thread " + i);
            }

    }

}
public class demo7 {
    public static void main(String[] args) throws InterruptedException {
        mythreadsleep.mt=Thread.currentThread();
        mythreadsleep t=new mythreadsleep();
        t.start();
        //t.join(); // If we do this we wil enter into the deadlock
        //mt.join(); // THis will also give us deadlock
        for(int i=0;i<10;i++)
        {
            System.out.println("We are in Main Thread "+i);
            Thread.sleep(2000);

        }

    }
}
