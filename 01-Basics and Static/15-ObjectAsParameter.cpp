/* Just like the values ,we can pass the object into function as parameter. This can be done by pass by value and pass by refernce */

#include <bits/stdc++.h>
using namespace std;
class times
{
    int hours;
    int minutes;
    int days=0;

public:
    void gettime(int h, int m)
    {hours = h;
    minutes=m;

    }
    void putdata()
    {
        cout<<"The total days are = "<<days<< " the hours "<<hours<<" and minutes= "<<minutes<<endl;
    }
    void sum(times,times);
};
void times::sum(times t1,times t2)
{
   
    minutes=t1.minutes+t2.minutes;
    hours=minutes/60;
    minutes=minutes%60;
    hours+=t1.hours + t2.hours;
    days=hours/24;
    hours=hours%24;
    

}


int main()
{
   times T1,T2,T;
   T1.gettime(23,40);   // Creating the first object
   T2.gettime(22,40);   // Creating the second object
   T.sum(T1,T2);        // Passing the objects as parameter
   T.putdata();         //Printing those values
   return 0;
}
