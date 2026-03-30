#include <iostream>
#include <string>
using namespace std;

// 문자열 여러 방식으로 입출력하기

int main() {

    char arr[100];
    cout << "Input your line: ";
    cin >> arr;
    cout << "Your Input: " << arr << endl;
    cin.ignore(); // cin의 버퍼에 \n 데이터가 남아 getline으로 넘어감 방지.

    string array;
    cout << "Input your line: ";
    getline(cin, array, '\n');
    cout << "Your Input: " + array;

}