#include <iostream>
#include <string>
using namespace std;

class Color{
    string c;
public:
    Color() {   c = "white";    cout << "기본 생성자입니다" << endl;    }
    Color(string c) {   this->c = c;    cout << "매개변수생성자입니다" << endl; }
    ~Color() {cout << "소멸자" << endl;}
};

class Palette {
    Color *p;
public:
    Palette();
    ~Palette();
};

Palette::Palette() {
    p = new Color[3];
}
Palette::~Palette() {
    delete [] p;
}

int main() {
    Palette *p = new Palette();




    delete p;
}