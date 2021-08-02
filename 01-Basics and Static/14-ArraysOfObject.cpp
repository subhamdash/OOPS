/* Similar to structure we also have the class to store array of variables */

#include <bits/stdc++.h>
using namespace std;
class students
{
    int s_no;
    string s_name;

public:
    void getdata();
    void putdata();
};
void students::putdata()
{
    cout << "The serial number is " << s_no << endl;
    cout << "The student name is " << s_name << endl;
}
void students::getdata()
{
    cout << "Enter the S.no and S.name" << endl;
    cin >> s_no >> s_name;
}

int main()
{
    int size = 3;
    students s[size]; // Here s[1] wil have s_no and s_name and s[2] will have it's individual entiteis of these two.
    for (int i = 0; i < size; i++)
    {
        cout << "Enter the data of the students = " << i + 1 << endl;
        s[i].getdata();
    }
    cout << endl;
    for (int i = 0; i < 3; i++)
    {
        cout << "Students " << i + 1 << " has these details" << endl;
        s[i].putdata();
    }
    return 0;

    return 0;
}