#include <iostream>
#include <string>
using namespace std;

class Line {
    double radius, length;
    public:
    Line();
    Line(double r, double l);
    void InputRadius(double r) {radius = r;};
    double getVolume();
};

Line::Line() : Line(1, 1) {};

Line::Line(double r, double l) : radius(r), length(l) {};

double Line::getVolume() {
    return (3.14 * radius * radius) * length;
}

int main() {

    Line *p = new Line[3];

    double temp;
    for (int i=0; i<3; i++) {
        cout << "p[" << i << "]의 r값 입력 >> ";
        cin >> temp;
        ->InputRadius(temp);
    }

}