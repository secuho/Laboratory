#include <iostream>
#include <string>
using namespace std;

class Rectangle {
    public:
    int x, y;
    int getArea();
    Rectangle();
    Rectangle(int a, int b);
};

Rectangle::Rectangle() : Rectangle(5, 1) {}; // 위임생성자 -> 타겟생성자 호출

Rectangle::Rectangle(int a, int b) : x(a), y(b) {}; // 타겟생성자

int Rectangle::getArea() {
    return x*y;
}

int main() {

    Rectangle table(30, 20), book(4, 7);

    cout << "table의 넓이: " << table.getArea() << endl;
    cout << "book의 넓이: " << book.getArea() << endl;

}