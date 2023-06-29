
#include <bits/stdc++.h>
using namespace std;
class Guitar
{

private:           //By default every member of class are private
    int serial_no; //Data Memeber
    string guitar_type, guitar_model, type_of_wood;
    float price;

public:
    Guitar(int serial_no, string guitar_type, string guitar_model, string type_of_wood, float price) //Constructor
    {
        this->serial_no = serial_no; //Use of this

        this->guitar_type = guitar_type;
        this->guitar_model = guitar_model;
        this->type_of_wood = type_of_wood;
        this->price = price;
    }
    int getSerial() //Member Function
    {
        return serial_no;
    }

    string getGuitarType() //Getter and setter
    {
        return guitar_type;
    }
    string getGuitarModel()
    {
        return guitar_model;
    }

    string gettypeOfWood()
    {
        return type_of_wood;
    }
    float getPrice()
    {
        return price;
    }
};
int main()
{
    Guitar g = Guitar(123, "Auscotic", "Jixing", "Alder", 2345.78);

    cout << " Id= " << g.getSerial() << endl;
    cout << " Guitar Type = " << g.getGuitarType() << endl;
    cout << " Guitar Model = " << g.getGuitarModel() << endl;
    cout << " Guitar Wood = " << g.gettypeOfWood() << endl;
    cout << " Price= " << g.getPrice() << endl;
    return 0;
}