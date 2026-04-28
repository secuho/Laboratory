#include <iostream>
#include <string>
using namespace std;

int main() {
	string line, dest = "";
	cout << "텍스트 입력 >> ";
	getline(cin, line, '\n');

	for (int i = 0; i < line.size() - 1; i++) {
		if ((line[i] == ' ') && (line[i + 1] == ' '))
			continue;

		dest.append(1, line[i]);
	}	dest.append(1, line[line.size() - 1]);

	cout << dest << endl;
}