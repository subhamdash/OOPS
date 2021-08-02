/* A Static function can have only acess to static memeber only , declared in the same class.
A static member function can be called using the class name instead of its object */

#include <bits/stdc++.h>
using namespace std;
class item
{

    int number;

public:
    static int count;
    int x;
    void getdata(int a)
    {
        number = a;
        count++;
    }
    static void addCount()
    {
        count++;
    }

    void print() //Memeber Function
    {
        cout << "Number = " << number << endl;
        cout << "Count = " << count << endl;
    }
    static void count_print()
    {
        cout << "Static Count = " << count << endl;
    }
};
int item::count = 11;

int main()
{
    item i1, i2, i3;

    cout << "Calling the getdata" << endl;
    i1.getdata(10);
    i1.print();
    i2.getdata(20);
    i3.getdata(30);

    cout << "After calling the getdata" << endl;
    i1.print();       //10 14 1
    i2.print();       //20 14 1
    i3.print();       //30 14 1
    i3.addCount();    // WE can call a static function on the both ways using the object or using the class name as given below
    item::addCount(); // Calling the static fucntion using the class
    item::count_print();

    return 0;
}