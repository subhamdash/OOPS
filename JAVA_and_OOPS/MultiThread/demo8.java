
class mythreadinter extends Thread{

    public void run()
    {
        try {
            for(int i=0;i<10;i++) {
                System.out.println("We are in Child Thread " + i);
                sleep(100);
            }

        }
        catch (InterruptedException ie) {
            System.out.println("We have interupted the Child Thread");
        }


    }

}
public class demo8 {
    public static void main(String[] args) {
        mythreadinter mi=new mythreadinter();
        mi.start();
        mi.interrupt(); // When ever it gets the chance it will interput , if the target is in wait or sleep then interput will get called
        System.out.println("Main");

    }
}
/*

Yeild() - If thread want to pause to give chances to another thread,

Join() - Wait for another thread to complete,Overloaded,is final

Sleep() - T0 wait,Overloaded
*/
