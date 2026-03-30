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

    Line pencil[3] = {Line(0.4, 8), Line(0.7, 8), Line(1.2, 8)};

    for (int i=0; i<3; i++) {
        cout << "pencil[" << i << "]의 부피: " << pencil[i].getVolume() << endl;
    }

}