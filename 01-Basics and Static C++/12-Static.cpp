/* A static member has speecial charactersitic that are it is intalized to zero when the first object of its class is creted.
No other initilaziation is not permitted. 
Only one copy of that memeber is created for the entire class and is shared by allthe objects of that class, no matter how many objects are created.
It is visvible only with in the class */

#include <bits/stdc++.h>
using namespace std;
class item
{

    int number;
    int normal = 0;

public:
    static int count; //You can't intialize/declare the variable her count=12 will throw an error
    int x;
    void getdata(int a)
    {
        number = a;
        count++;
        normal++;
    }

    void print() //Memeber Function
    {
        cout << "Number = " << number << endl;
        cout << "Count = " << count << endl;
        cout << "Normal = " << normal << endl;
    }
};
int item::count = 11; //defination of the static member The type and scope of each static member must be defined outside the class defination

int main()
{
    item i1, i2, i3;
    cout << "Before calling the getdata" << endl;
    i1.print(); //0 11 0
    i2.print(); //12 11 0
    i3.print(); //0 11 0

    cout << "Calling the getdata" << endl;
    i1.getdata(10);
    i2.getdata(20);
    i3.getdata(30);

    cout << "After calling the getdata" << endl;
    i1.print(); //10 14 1
    i2.print(); //20 14 1
    i3.print(); //30 14 1

    return 0;
}