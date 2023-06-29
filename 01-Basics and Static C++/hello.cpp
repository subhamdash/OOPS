#include <bits/stdc++.h>

using namespace std;
class demp
{
public:
    int a;
    demp()
    {
        cout << "I am a cosntructor" << endl;
    }
    void print()
    {
        cout << "I am prinitng " << a << endl;
    }
};
int main()
{
    demp d;
    d.a = 5;
    d.print();
}