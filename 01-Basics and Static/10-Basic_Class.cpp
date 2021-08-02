
#include <bits/stdc++.h>
using namespace std;
class demo
{

private:           //By default every member of class are private
    int serial_no; //Data Memeber

public:
    int x, y;

    // cout << x << y;   We can't do this
    void print() //Memeber Function  -- Can be decalred in two ways that is inside and outside the class defination
    {
        cout << x << y;
    }
};
int main()
{
    demo d; //Object and Instansiate
    d.x = 10;
    d.y = 10;
    cout << d.x << d.y << endl; //Printing the values
    d.print();
    return 0;
}