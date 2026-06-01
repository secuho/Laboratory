#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
using namespace std;

class Character {
protected:
    string name;
    int level, hp, attack;
public:
    Character(string name, int level);
    void move();
    void showStatus();
    void setLevel(int level) {this->level = level;}
    void Attack();
};

Character::Character(string name, int level) {
    this->name = name;
    this->level = level;
    this->hp = 100 * level;
    this->attack = 10 * level;
    cout << "--- [부모] Character 생성자 호출 (" << name << ") ---" << endl;
}

void Character::move() {
    cout << name << "(이)가 티바트 대륙을 달립니다." << endl;
}

void Character::showStatus() {
    cout << name << "(" << level << "lv) : HP = " << hp << ", 기본 공격력 = " << attack << endl;
}

void Character::Attack() {
    srand(static_cast<unsigned int>(time(NULL)));
    if (rand() % 3 == 0) {
        cout << "공격 성공!! 체력을 흡수합니다..." << endl;
        hp += 100;
    } else {
        cout << "공격 실패... 체력이 깎여나갑니다..." << endl;
        hp -= 100;
    }
}

class Raiden : public Character {
    string element;
public:
    Raiden(int level) : Character("라이덴 쇼군", level) {}
    void elementalBurst();
    void setElement(string element) {this->element = element;}
    void showStatus() {
            cout << name << "(" << level << "lv) : HP = " << hp << ", 기본 공격력 = " << attack << ", 보유 원소 : " << element << endl;
    }
};

void Raiden::elementalBurst() {
    cout << "[원소 폭발] " << element << " 원소가 폭발했습니다 !" << endl;
}


int main() {
    Raiden raiden(90);
    raiden.setElement("화염");

    Character Purina("푸리나", 70), Jongryeo("종려", 80);

    raiden.move();
    raiden.showStatus();
    raiden.Attack();
    raiden.showStatus();

    Purina.move();
    Purina.showStatus();
    Jongryeo.move();
    Jongryeo.showStatus();

    raiden.elementalBurst();
    
return 0;
}