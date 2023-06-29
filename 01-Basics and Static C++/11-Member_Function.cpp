/* We put a label before the class function and 'label' tells the compiler class the fucntion belongs to.
return-type class name:: fucntion-name(argumetns decalration)
{ Function body} */
#include <bits/stdc++.h>
using namespace std;
class item
{

    int number;

public:
    int x;
    void getdata(int a, int b);

    // cout << x << y;   We can't do this
    void print() //Memeber Function  -- Can be decalred in two ways that is inside and outside the class defination
    {
        cout << number << " " << x;
    }
};
void item::getdata(int a, int b)   //External Function
{
    number = a;
    x = b;
}
int main()
{
    item i; //Object and Instansiate
    i.getdata(10, 20);

    i.print();
    return 0;
}