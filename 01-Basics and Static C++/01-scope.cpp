/* :: is scope resolution operator it always point to the gloabal variable */
#include <bits/stdc++.h>
using namespace std;
class base
{

public:
    void print()
    {
        cout << "print base class" << endl;
    }

    void show()
    {
        cout << "show base class" << endl;
    }
};

class derived : public base
{
public:
    void print()
    {
        cout << "print derived class" << endl;
    }

    void show()
    {
        cout << "show derived class" << endl;
    }
};

int main()
{

    derived der = derived();
    der.show();
    der.print();

    // base de = derived();
    // de.show();
    // de.print();
    //base b;

    //base *bptr;
    // derived d;
    //bptr = &d;

    // virtual function, binded at runtime
    // bptr->print();

    // Non-virtual function, binded at compile time
    //bptr->show();
}