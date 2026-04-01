#include <iostream>
#include <string>
using namespace std;

class Circle {
	int radius; 
public:
	Circle(); 
	Circle(int r);
	~Circle();
	double getArea()  { return 3.14*radius*radius; }
	int getRadius() { return radius; }
	void setRadius(int radius) { this->radius = radius; }
}; 

Circle::Circle() {
	radius = 1;
	cout << "생성자 실행 radius = " << radius << endl;
}

Circle::Circle(int radius) {
	this->radius = radius;
	cout << "생성자 실행 radius = "  << radius << endl;
}

Circle::~Circle() {
	cout << "소멸자 실행 radius = " << radius << endl;
}

Circle getCircle() {
	Circle tmp(25);
	return tmp; // 객체 tmp을 리턴한다.
}

int main() {
	Circle c; // 객체가 생성된다. radius=1로 초기화된다.
	cout << c.getArea() << endl;

	c = getCircle(); 
	cout << c.getArea() << endl;
}

