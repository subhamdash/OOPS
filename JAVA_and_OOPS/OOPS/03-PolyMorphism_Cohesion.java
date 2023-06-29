
public class oop3 {
    //overiding concept is applicable for methods not for varaibles
    //varible resolution takes care by compile based on reference type irrestpective of whether
    // the varibale is staic or non static
    //Over-riding concept applicable for method but not for varibels, it is taken care by compiler

    //polmorphism -overloading and over-riding
    //Coupling - If more dependcy is more then it is consider as tightly coupling,
    // if dependency is less then it is consider as lossely coupling.
    /*
    Enhancement will become difficult. Reuseability will help in more.
    Maintainability of the code will help. Depednecy of components is more. It suprasses re-usability
    It reduces maintainability of the application.

    Cohesion - For every of component a clear well define functionality said is to be followed a high-cohesion.
     It doesn't have like login --validation ---inbox rather all are indepented
    Ex:- IF I have servelet program which contains 100 of functionalities and even I have to modify one then whole servlet needs to be redesigned.
    //Maintain a sepreated one for each component and it can be imported and can be used in multiple area

     */
    public static int m1() {
        return 10;
    }
}
class B
{
    static int j=oop3.m1(); //Dependent on A
}

class A
{
    static int i=B.j; //Dependent on B

}

