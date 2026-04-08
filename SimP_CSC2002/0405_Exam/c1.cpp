#include <iostream>
#include <string>
using namespace std;

int main() {

    double n[5];

    cout << "실수 5개를 입력하시오 >> ";
    cin >> n[0] >> n[1] >> n[2] >> n[3] >> n[4];

    double sum = 0;
    for (int i = 0; i<5; i++) {
        if (n[i] > 0) {
            sum += n[i];
        }
    }

    cout << "양수의 합은 " << sum << "입니다." << endl;
}