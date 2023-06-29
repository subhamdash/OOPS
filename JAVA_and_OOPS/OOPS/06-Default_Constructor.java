//We can apply public private protected deafualt are modifier for constructor not static
//If we are not declaring any constructor then the default constructor takes place
//Every no argument constructor is not default constructor and by default access modifier of
// default consturctor is class constuctor
//A super() is present in default constructor
//If there is nothing in the Constructor then the super is added to it by compiler
//The first line in every construtor should be super() or this()
//WE CANNOT take super() and this() both at a time
//Super() in only constructor, this() we only use in first line
//super and this are keyword and super() and this() are different from those
// and it can be used anywhere except static
class Student
{
    String name;
    int rollno;
    static int count=0;
    {
        count++;
    }
    Student(int rollno,String name)
    {
        this. name=name;
        this.rollno=rollno;

    }
    void Student() //If we are declaring with return type it will treated as method and not as constructor and it will not executed as constructor
    {

    }
}

public class oop6 {
    public static void main(String[] args) {
        Student s=new Student(12,"sub");
        //Student s1= new Student();
        System.out.println(Student.count);
        //Retrun type concept not applicable for COnstructor .Even Void also.


    }

}
