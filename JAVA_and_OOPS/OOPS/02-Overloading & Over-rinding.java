public class oop2 {
    //What ever methods parent has, by default it is  available
    // to child through inheritance and if child class not satisfied
    //with parent class implementation then child is allowed to re-define that method based on it's requiremnt.
    // This process is called over-ridding. The parent class which is over-ridden is called over-ridden method.

    //IF we are giving something Parent p1=new Child(); p1.marry();--
    // Here first it will check if the marry method is presenting parent class or not.
    // it will check whether it's child object or parent object and it is checked by JVm in runtime
    //If it is child class  and marry method is over-riding then we will get child class marry method else parent class
    //All these things happens at run-time and done by JVM hence it is called run-time polymorphism
    //Method resoltuion is taken care by JVm based on Runtime objects.Late-Binding, Dynamic Polymorphims

    //Method name ,signature and  argument type must be same,Covariant return type is allowed.
    //parent has Number then child has number,interger then it is called covariant and it is for
    // Object type not primitive like double to int
    //If parent is final we cannot over-ride as it is decalred as final
    //We can over-ride a non-abstract method from parent class in child class.
    // We can stop availabilty of parent method
    // to the next level
    //child classes.If parent class is final, we cannot over-ride it
    //Synchronized to non-synchoronizzed and vice-versa is acceptable
    //We cannot reduce to access modifier.
    // like in parent class we have public void m1() and in child class we have void m1() then we will get error
    //But Vice -versa is allowed.private<dfault<protected<public

    //If child class method throws any checked exception the parents class must throw checked exception or it's parent
    //There is no rule for uncheked exception


}
