#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int main() {
    string name;
    string major;
    string key("동국대");

    cout << "이름을 입력하시오 >> ";
    getline(cin, name);
    cout << "전공을 입력하시오 >> ";
    getline(cin, major);

    cout << "당신은 " + major + "전공을 듣는 " + name + "이군요 !";

    if (strcmp(name, key) == 0) {
        cout << "합격입니다 !";
        return 0;
    }

    return 0;
}