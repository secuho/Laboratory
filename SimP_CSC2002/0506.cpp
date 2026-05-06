#include <iostream>
#include <string>
using namespace std;

class RectManager {
public:
    bool equals(Rect r, Rect s);
};

class Rect {
    int width, height;
public:
    Rect() {this->width = 1; this->height = 1;}
    Rect(int w, int h) {width = w; height = h;}
    friend bool equals(Rect r, Rect s);
};

bool RectManager::equals(Rect r, Rect s) {
    if (r.width == s.width && r.height == s.height)
        return true;
return false;
}


int main() {
    Rect a(3, 4), b(4, 5);
    RectManager man;

    if (man.equals(a, b)) cout << "equal" << endl;
    else cout << "not equal" << endl;
}