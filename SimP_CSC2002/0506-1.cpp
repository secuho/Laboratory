#include <iostream>
#include <string>
using namespace std;

class Stat {
    int atk;
    double cnt;
public:
    Stat() {this->atk = 0; this->cnt = 0.0;}
    Stat(int atk, double cnt) {this->atk = atk; this->cnt = cnt;}

    Stat operator+(const Stat& other) {
        Stat temp;
        temp.atk = this->atk + other.atk;
        temp.cnt = this->cnt + other.cnt;
    return temp;
    }

    Stat operator*(int multipllier) {
        this->atk = this->atk * multipllier;
    return *this;
    }

    void show(string name) {
        cout << name << "스탯 -> 공격력: " << atk << ", 치확: " << cnt << "%" << endl;
    }

};


int main() {

    Stat raiden(1000, 50.0);
    raiden.show("라이덴 초기 스탯");

    Stat artifact(1200, 15.5);

    Stat finalStat = raiden + artifact;
    finalStat.show("섬유물 장착 후");

    Stat buffedStat = finalStat * 2;
    buffedStat.show("베넷 버프(공격력 2배) 적용");
    
return 0;
}