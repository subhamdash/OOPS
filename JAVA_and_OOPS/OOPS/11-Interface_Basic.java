public class DecMod4 {
    //What is interfaces?
    /*
        Any Service Request System is consider as interface.
        JDBC Api acts as Requirement Specifcation to develop database driver.
        Database vendor is implement JDBC API
        Apache implemted tomact server,
        The set of services what he is offering hence any contract b/w client and service provider is consider as Interface
        interface is consider as 100% abstract class whether we are declaring or not .
        Any service requirment specification or any contract b/w servcice provider  and client or 100% pure abstract class is called interface.
        //Every method in java is public by default even if we declare or not so when implementing in child class we should declare it as public
        //extends vs implements - A class can extends one class but can implement many interface
        A interface can extend multiple interface,
        A class can extend another class and class any interfaces simultanouesly
        X extends Y - Both x and Y can be either classes or interfaces
        //We have to take extends first then interface so
        X extends y implements z is valid but  x implements y extends z is not



        Interface varibale is always public static final.
        Public:- TO make variable to be used for everyone
        without exisitng object we can use the variable that is possible in static we can directly call it using class name
        if you want to access but not modify, if one implementation class changes the variable it will affect others.It is always final
        // we should perform intizlisation at time of declartion

        //If there are two different interfaces uses the same method name but has differnt argument
        then both should be implemented spereately

        //It is impossible to implement both interfaces simultaneously if it contains a method with same signature but
        differnt return type. Then it is impossible implement both interfaces simultaneously.
        interface left{ public void m1(); int x=10;} interface right{publi int m1(); int x=12;}


        //interface variable naming complex. If two variables contains same varaible name but different values.
        so if you want to access it with class name like left.x or right.x






     */
}
interface infy
{
    //All these implementaions are same as all will be public in the child class
    void m1();
    public void  m2();
    abstract void m3();
    public abstract void m4();
}
class serviceProvided implements infy{
    public void m1()
    {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    public void m2()
    {

    }

}
