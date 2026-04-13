#include <iostream>
#include <string>
using namespace std;

class Rect{
    int width, height;
public:
    Rect();
    Rect(int w, int h) { width = w; height = h; }
    int getWidth();
    int getHeight();
    int getArea();
};

Rect::Rect() {  width = 1;  height = 1; }

int Rect::getWidth() {  return width;   }
int Rect::getHeight() { return height;  }
int Rect::getArea() {   return width*height;    }

int main() {

    Rect r[5] = {Rect(), Rect(2, 3), Rect(3, 4), Rect(4, 5), Rect(5, 6)};

    int sum = 0;
    for (int i=0; i<5; i++) {
        cout << i << "번째 사각형의 넓이: " << r[i].getArea() << endl;
        sum += r[i].getArea();
    }

    cout << "Sum: " << sum << endl;
    

}