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

    Power operator+(int op2);
};

Power Power::operator+(int op2) {
    Power temp;
    temp.kick = kick + op2;
    temp.punch = punch + op2;
return temp;
}


int main() {

    cout << "--- 음식 섭취 전 ---" << endl;
    raiden.show();

    Character buffedRaiden = 300 + raiden;

    cout << "\n--- '선도장' 음식 섭취 후 ---" <<< endl;
    bu

}