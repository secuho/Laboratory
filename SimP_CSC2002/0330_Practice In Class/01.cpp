#include <iostream>
#include <string>
using namespace std;

// namespace 호출 방법 연습

namespace jaeho {
    int id = 1;
    string name("홍길동");
    int f1() {
        return id;
    }
    string f2() {
        return name;
    }
};

int main() {

    cout << "Put your id : ";
    cin >> jaeho::id;
    cin.ignore();
    cout << "Put your name : ";
    getline(cin, jaeho::name, '\n');

    cout << "Direct) your id : " << jaeho::id;
    cout << "Functional) your id : " << jaeho::f1();
    cout << "Direct) your name : " + jaeho::name;
    cout << "Functional) your name : " << jaeho::f2();

}