#include <iostream>
#include <string>
using namespace std;

// 코드 에러 찾기

class Rect {
    int a = 10;
    public:
    double A() {};
    Rect() {};
    Rect(int x);
};

double Rect::A() {
    return a;
}

Rect::Rect() {
    a = 1;
}

Rect::Rect(int x) {
    a = x;
}

int main() {

}