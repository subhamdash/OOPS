//There is no link between the java file name and class name,
// We can declare main method in any of the class
//Atmost one mehtod can be public in java,
// If we declare a method as public we shoudl give that class name as file name
//We can have as many as class with main function so when we compile it using javac,
// for every class a seperate .class file will be genrated
//.class file can be run  independently using java command and main class will be executed.
// If java doens't contain public main ,we will get error
//Per program should have one class file

//If we are importing the class from two directory ,
// we might get error unless we mention the class explicity then it will get priority.
//eg:-Datetime from sql and time
//IF we are importing a java package then all class and interfaces are present but not sub-package class are not imported.
//java.lang and pwd are not required to import
public class DecMod1 {

}
class test
{
    public static void main(String[] args) {
        System.out.println("Hello WOrld");
    }

}

