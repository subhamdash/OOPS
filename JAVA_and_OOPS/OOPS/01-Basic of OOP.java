public class oop1 {
    public static void main(String[] args) {
        //Data Hiding - Declaring private and all
        //Absctraction -- Hide internal implemetations, and just highlight the services we are offering, by using interface and abstract classes
        //Encapsulation --  DataHiding + Absctaction
        //If every varaible  are private then it's tightly encapsulated
        //Is-a is used by using extends, it means inheritance
        /* we can use
         Parent p=new Child();  // Example of polymorphism
         But it can only call Parent class method but not child class method using p else we will get error
         We cannot create parent class object using child class method like Child c= new Parent(), it will give us error
         If our class doesn't extends any other class then only our class is direct child class of object
         or else there wil be multilevel inheritance.

         In interfcae inheritance we will provide in multiple interfaces.Even though there are multiple
         declaration are there but there is only one implementation so no ambiguity

         Cycle inheritnace are not allowed in Java.

         // Has- a relationship . It is also known as composition or aggregation. no keyword but we use new()
         Difference b/w composition and aggregation .
         Composition - Strong dependecy . College and Department , College closes department will won't be there.
                       Container and contained are strong assosiated and it is known as composition
         Aggregation - Teacher and department , If department closes teacher can work.
         Object are weakly associated
         IF you need total functionalities of class then go for IS-A relationship,
         If we need only partial we need HAS-A relationship

         //Method Overloading is know as compile time polymorphism,
         static polymorphism, early binding.Method resolution is always taken care by compiler.

         //In Overloading it will check it the exact argument is present or not ,
         then it will check if there is next level matching is there or not.
         #####like if there is no char argument in method and we are overloading a char then it 
         will be promoted to int.

         // If we are using string and stringbuffer and passing null as argument then we will get
         refernce is ambiguos
         // we will get ambigous if there are two level of Promotion in data type
         m1(int i, float f) and m1(float f, int i) and we are overloading with m1(10,10)
         then it is a ambigious and confused where to call

         Method Overiiding -

         As we know if there object of child is created by using parent then during run time we decide
         which function to run on the availability of function in child or parent class


         */

    }
}
