

/*
Object o = new string("durga")

        A b =(c) d; We are trying to convert d to type to c type then it will check whetner the assignment is valid or not.
// Compile time checking 1- The type of d and c must have some relation .
 Either child to parent or parent to child or same type.OTher wilse we will get compile error.
*/


class oop41 {
    void temp()
    {
        System.out.println("Hello World");
    }
}

class demi
{
    oop41 ob=new oop41(); //We can create object of one class in another


    void temp1()
    {
        ob.temp();
        System.out.println("Hello World2");
    }


}

interface RunCheck
{
    public void running();
}
class ThreadCheck implements RunCheck
{
    @Override
    public void running() {
        System.out.println("We are running in child");

    }

}
class A1
{
}
class B1 extends A1
{
}
class B2 extends A1
{

}

class Der1 extends B1
{
}

class Der2 extends B1
{
}

class Der3 extends B2
{
}

class Der4 extends B2
{
}


public class oop4
{
    public static void main(String[] args) {
        demi d = new demi();
        d.temp1();
        RunCheck r = new ThreadCheck(); //We can use parent reference to child object,We can use interface refernce to hold implemented child class.
        r.running();
        ThreadCheck tt = (ThreadCheck) r;
        tt.running();

        // RunCheck rr=new RunCheck();//We can't just implement a Interface we have define the methods also.
        //Inconvrtiable types will a type of error if we don't have proper child to parent or parent to child type


        B2 b=new Der4();
        A1 a=(B2)b ;
        //A1 a1=(B1)b ; //Incovratgiable type as there is no relation b/w B1 and B2
        A1 a2=(Der3)b ; //We will get Compile Time Execution as there is no Dependency on Der 3 and Der 4
        //B2 b1=(B1) b;   //Incorvatiable type
        //B1 b2=(Der4) b;
        //Throught the type casting we are not creating any new object, we are providing another reference variable for the exisiting object
        /*
                    A
                    ^       (A)((B)C) => A a=new C();
                    |
                    |
                    B           (B)c => B b=new C();
                    ^
                    |
                    |
                    C           C c=new c();
         */




    }



}
