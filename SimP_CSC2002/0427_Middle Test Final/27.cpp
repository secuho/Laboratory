#include <iostream>
#include <string>
using namespace std;

class Container {
	int* p;
	int size;
public:
	Container(int size);
	~Container();
	void read();
	void write();
	void rotate();
	double avg();
};

Container::Container(int size) {
	this->size = size;
	p = new int[this->size];
}
Container::~Container() { delete[] p; }

void Container::read() {
	cout << "정수 " << size << "개 입력 >> ";
	for (int i = 0; i < size; i++) {
		cin >> p[i];
	}
}

void Container::write() {
	for (int i = 0; i < size; i++) {
		cout << p[i] << " ";
	}	cout << endl;
}

void Container::rotate() {
		int temp = p[size-1];
		for (int k = size-1; k > 0; k--) {
			p[k] = p[k - 1];
		}	p[0] = temp;
}

double Container::avg() {
	int sum = 0;
	for (int i = 0; i < size; i++) {
		sum += p[i];
	}
	double avg = (double)sum / size;
return avg;
}

int main() {
	Container c(10);
	c.read();
	c.write();
	c.rotate();
	c.write();
	cout << "평균은 " << c.avg() << endl;
}