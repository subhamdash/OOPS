public class oop5 {
    static int i=10;  //Read Indirect Write only
    static
    {
        m1();
        System.out.println("First Class");
        System.out.println(i); //- Direct Read, Inside a staic block if we are trying to read a variable then that opertaion is called Direct Read
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main Method");

    }
    public static void m1()
    {
        System.out.println(j); //INdirect Read,//IF we are calling a mehtod and we are trying to read a variable that read opertaion is called indeirect read
    }
    static
    {
        System.out.println("Second Static Block");
    }
    static int j=20;
}

/*
0
First Class
Second Static Block
20
Main Method
 */
/*
//When we run all the static member will take place form top t0 button
//Secondly it will assign static variable and execution of static block from top to bottom
//Main Method will be executed at last
//IT will also check for main and if it dones't find any main method it will give us an error
 */
