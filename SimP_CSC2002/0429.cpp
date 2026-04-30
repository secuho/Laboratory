#include <iostream>
#include <string>
using namespace std;

class GenshinCharacter {
    string name;
    static int partyCount = 0;

public:
    static int getPartyCount() {return partyCount;}
    GenshinCharacter(string name) {
        this->name = name;
        partyCount++;
        cout << name << " 캐릭터가 파티에 합류했습니다." << endl;
    }
    void attack();
    void attack(string element);
};

void GenshinCharacter::attack() {
    cout << this->name << "이 일반 공격을 합니다 !" << endl;
}
void GenshinCharacter::attack(string element) {
    cout << this->name << "이" << element << " 원소 능력을 사용하여 공격을 합니다 !" << endl;
}


int main() {

    cout << "현재 파티 인원: " << GenshinCharacter::getPartyCount() << "명" << endl;

    GenshinCharacter kazuha("카즈하");
    GenshinCharacter raiden("라이덴");

    kazuha.attack();
    raiden.attack("번개");

    cout << "현재 파티 인원: " << GenshinCharacter::getPartyCount() << "명" << endl;

return 0;
}

