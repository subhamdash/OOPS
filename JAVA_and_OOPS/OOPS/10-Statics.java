public class DecMod3 {
    //If instance variable are declared as final then we should assign the value
    // or else we don't get the program get compile
    //At the time of declaration, inside instance block,inside constructor
    //If the static varaible declared only one copy is created and it will be shared with all the object of   the class.
    //Before Class loading completeion final static variable should be intialized,at the time of declaration

    //Static Variable has only one copy of instance varibale passed multiple copy to objects
    //We can access only static varibale in static methods directly, we cannot directly  access non-static varibale in it.
    //Non-static members belong to instances of the class, while static methods and static blocks are associated with the class itself.
    //
    //Inhertance concept is applicable for static methods including main method.Hence while executing child class if child
    //doesn;t contain child class then parent class main method will be executed.

    //if both child and parent class has static main and it is inherited then it might seem main is

    //Inside method implementation if we are using atleast on instance isntance variable then method talks about a particular
    //If we are not using any instance variable then we can declare static method
    //Abstract static combination is illegal for methods as one need implementation and other is not







}

class val_final
{
    //final int x=10; // we cannot leave it as blank or cannot change it any where
    static int y=10;
    protected int z=10;

    public static void mhiding(String[] args) {
        System.out.println("We are in val final");

    }



}

class val_final2
{
    final int x;
        { x=10;
        }
}

class val_final3
{
    final int x;
    val_final3()
    { x=10;
    }
}
class final4 extends val_final
{
    //If we want intialize a value of a variable then we should declare it in brackets but not as independent or in constructor .
    {
        z = 30;
    }
    public void change()
    {
        z=30;
    }
    //x=20; - We cannot to this Inheritacne does not a
    //y=20;

    public static void mhiding(String[] args) {
        System.out.println("We are in final4"); // This may seem like overriding but it is method hiding

    }

}
class statDemo
{
    public static void main(String[] args) {


        val_final vv= new val_final();

        vv.y=20;
        vv.z=20;
        System.out.println(vv.y); //20
        System.out.println(vv.z); //20


        val_final vv2= new val_final();
        System.out.println(vv2.y); // Here also the value got changed as it is static 20
        System.out.println(vv2.z); //10
        System.out.println(val_final.y); //20

    }
}
