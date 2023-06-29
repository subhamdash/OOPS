/* :: is scope resolution operator it always point to the gloabal variable */
#include <bits/stdc++.h>
using namespace std;

class BaseClass
{
public:
    void disp()
    {
        cout << "Function of Parent Class";
    }
};
class DerivedClass : public BaseClass
{
public:
    void disp()
    {
        cout << "Function of Child Class";
    }
};
int main()
{
    BaseClass obj = DerivedClass();
    obj.disp();
    return 0;
}