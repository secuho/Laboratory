#include <iostream>
#include <string>
using namespace std;

string front[8] = {"뛰어난", "사랑스러운", "까불까불", "씩씩한", "용감한", "깔끔한", "귀여운", "씨크한"};
string back[5] = {"호랑이", "장미", "고양이", "나팔꽃", "강아지"};

class generator {
    string ID;
public:
    string next() {
        int rad_front, rad_back;
        rad_front = rand() % 8;
        rad_back = rand() % 5;

        ID = front[rad_front] + " " + back[rad_back];
        return ID;
    }
};

int main() {
    generator GENE;

    while (1) {
        string input;
        cout << "사용자 ID 생성 (yes/no) >> ";
        cin >> input;
        if (input == "yes")
            cout << GENE.next() << endl;
        else return 0;
    }
}