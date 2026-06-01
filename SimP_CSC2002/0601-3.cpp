#include <iostream>
#include <vector>
using namespace std;

int main() {
	vector<int> v;
	v.push_back(1);
	v.push_back(2);
	v.push_back(3);

	vector<int>::iterator it; // iterator는 포인터 참조

	for(it=v.begin(); it != v.end(); it++) {
		int n = *it;
		n = n*3;
		*it = n;
	}

	for(it=v.begin(); it != v.end(); it++)
		cout << *it << ' ';
	cout << endl;
}
