public class DecMod2 {
    //We can delcare a top class as public, default, final ,abastract,stictf .
    //But inner class we can declare private protected and static along with above
    //Public protected private are default are known as specifier
    //If we don't make the class A as public then we will get the error while importing it as package
    //if class declared as default then we can access that class only with in current package
    //final is modfier we can apply for classes, methods and variables
    //Final cannot be overriden in child class.
    //If a class is final then we cannot extend that class as we cannot make any changes to it
    //Every method in final class is final implicitly,
    // but every variable present in the final class need not be final

    //abstract class and method are ok but not variable
    //Abstract class are those who has delcaration but not implementation so we end with ;
    //We cannot have opening and closing brackets
    //Class should be abstract if you want to declare the abstract method - If we don't declare the class abstract ,
    //Then we will able to create an object and if we try to access method we will get error as it has no implementation
    //we cannot declare abstract and final in the same line
    //Abstract class cannot be instantiated and can have no-abstract method
    //Every adapter class is recomended to declare as abstract but it doesn't contain any abstract method
    //If we  are implementing the two abstract class with two abstract method and only using one abstract method
    //Then we  have to two choices either to declare the child class as abstract or
    // implement the second abstract method as well.


}

abstract class vehicle
{
    abstract public int getNoOfWheels();

}
class Bus extends vehicle
{
    public int getNoOfWheels()
    {
        return 7;
    }
}
