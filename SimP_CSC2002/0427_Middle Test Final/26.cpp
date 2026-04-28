#include <iostream>
#include <string>
using namespace std;

class Bubble {
private:
	int radius;
public:
	Bubble(int r) { this->radius = r; }
	int getRadius() { return radius; }
	void setRadius(int r) { this->radius = r; }
};

bool combineBubble(Bubble& a, Bubble& b) {
	if (a.getRadius() == b.getRadius())
		return false;

	if (a.getRadius() > b.getRadius()) {
		a.setRadius(a.getRadius() + b.getRadius());
		b.setRadius(0);
	}
	else {
		b.setRadius(b.getRadius() + a.getRadius());
		a.setRadius(0);
	}

	return true;
}

int main() {
	Bubble a(5), b(10);
	if (combineBubble(a, b) == false)
		cout << "두 버블의 크기가 같음" << endl;
	else
		cout << "큰 쪽으로 병합됨" << endl;
	cout << "버블 a의 반지름 " << a.getRadius() << endl;
	cout << "버블 b의 반지름 " << b.getRadius() << endl;
}