#include <iostream>
#include <string>
#include <math.h>
using namespace std;

// 두 점 사이의 거리 구하는 문제

int main() {
    
    int x1, y1, x2, y2;
    cout << "Input X1: ";
    cin >> x1;
    cout << "Input Y1: ";
    cin >> y1;
    cout << "Input X2: ";
    cin >> x2;
    cout << "Input Y2: ";
    cin >> y2;

    double distance = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2)); // pow 제곱 함수

    cout << "Distance: " << distance;
}