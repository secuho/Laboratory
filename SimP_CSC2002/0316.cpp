#include <iostream>
#include <string>
using namespace std;

class Rectangle {
    int weight, height;
    public:
    Rectangle();
    Rectangle(int k);
    Rectangle(int w, int h);
    bool isSquare();
};

Rectangle::Rectangle() {
    weight = 1;
    height = 1;
}
Rectangle::Rectangle(int k) {
    weight = k;
    height = k;
}
Rectangle::Rectangle(int w, int h) {
    weight = w;
    height = h;
}

bool Rectangle::isSquare() {
    if (weight == height)
        return true;
    else
        return false;
}

int main() {
	Rectangle rect1; 
	Rectangle rect2(3, 5);
	Rectangle rect3(3);

	if(rect1.isSquare()) cout << "rect1은 정사각형이다." << endl;
	if(rect2.isSquare()) cout << "rect2는 정사각형이다." << endl;
	if(rect3.isSquare()) cout << "rect3는 정사각형이다." << endl;

return 0;
}