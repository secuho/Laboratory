#include <iostream>
#include <string>
using namespace std;

class Line {
    double radius, length;
    public:
    Line();
    Line(double r, double l);
    double getVolume();
};

Line::Line() : Line(1, 1) {};

Line::Line(double r, double l) : radius(r), length(l) {};

double Line::getVolume() {
    return (3.14 * radius * radius) * length;
}

int main() {

    Line pencil(0.5, 7);

    /* Line *p = &pencil;
    cout << "pencil's Volume: " << p->getVolume(); */
    // *p 포인터를 사용한 객체 연결

    cout << "pencil's Volume: " << pencil.getVolume(); // . 연산자를 통한 객체 연결


}