#include <iostream>
#include <string>
using namespace std;

class Power {
    int kick;
    int punch;
public:
    Power(int kick=0, int punch=0) {
        this->kick = kick;
        this->punch = punch;
    }
    void show() {
        cout << "kick=" << kick << ", punch=" << punch << endl;
    }

    Power& operator+=(Power op2);
};

Power& Power::operator+=(Power op2) {
    kick += op2.kick;
    punch += op2.punch;
return *this;
}


int main() {

    Power a(3, 5), b(3, 5), c;
    a.show();
    b.show();
    c = a += b; 
    a.show();
    b.show();
    
}