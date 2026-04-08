#include <iostream>
#include <string>
using namespace std;

class Cube {
    int a, b, c;
public:
	Cube(int x, int y, int z);
	Cube();
    int getVolue();
	void increase(int x, int y, int z);
	bool isZero();
};

Cube::Cube(int x, int y, int z) {
    a = x; b = y; c = z;
};

Cube::Cube() {
    a = 1; b = 1; c = 1;
}

int Cube::getVolue() {
	return a * b * c;
}

void Cube::increase(int x, int y, int z) {
	a += x;
	b += y;
	c += z;
}

bool Cube::isZero() {
	return getVolue() == 0;
}

int main() {
		Cube cube(1, 2, 3);
		cout << "큐브의 부피는 " << cube.getVolue() << endl;
		cube.increase(1, 2, 3);
		cout << "큐브의 부피는 " << cube.getVolue() << endl;
		if (cube.isZero()) cout << "큐브의 부피는 0" << endl;
		else cout << "큐브의 부피는 0이 아님" << endl;
}
