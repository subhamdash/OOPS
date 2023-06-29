//Overloading is applicable for Constructor
//Inhertiance is not applicable for Constructor so no over-riding concept are not applicable
//Every class including abstract class can contain constructor but not interface
//Recursive Constructor invokation and it will not compile, I method we will get stack over flow after it compiles
//If we have empty constructor or default constructor then the super method will be invoked and we will not get any error
//But if we have paremeterized constructor then it when child class calss super to the parent class via super it won't get any default constuctor hence will give error
//THe main objective of a constructo is to perform intialization of object


class tests
{
    tests()
    {
        this(10);
        System.out.println("No args");
    }
    tests(int i)
    {
        this(10.5);
        System.out.println("One args");
    }

    tests(double d)
    {

        System.out.println("double args");
    }
}
public class oop7 {
    public static void main(String[] args) {
        tests t1=new tests();
        //double args
        //One args
        //No args
        tests t2=new tests(10);
        //double args
        //One args

    }
}
