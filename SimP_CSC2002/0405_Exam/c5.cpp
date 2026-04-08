#include <iostream>
#include <string>
using namespace std;

class Chart {
public:
	string title;
	string color[3] = {"빨강", "파랑", "노랑"};
	int count[3] = {0};
	Chart(string a) {title = a;};
	Chart() {};

	int getNumberOfColors() {
		return 3;
	}
	string getColor(int i) { return color[i]; };
	void add(int i, int c) {
		count[i] = c;
	}
	void draw() {
		int sum = count[0] + count[1] + count[2];

		cout << title << "*****************" << endl;
		for (int i = 0; i < 3; i++) {
			double percent = (double)count[i] / sum * 100;
			cout << color[i] << ": " << percent << "%" << endl;
	}
		cout << "****************************" << endl;
    }
};


int main() {
	Chart chart{ "색 선호도 조사 차트" };
	for (int i = 0;i < chart.getNumberOfColors();i++) {
		cout << chart.getColor(i) << "이 좋은 학생>>";
		int count;
		cin >> count;
		chart.add(i, count);
	}
	chart.draw();
}
