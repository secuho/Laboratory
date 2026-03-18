#include <iostream>
#include <string>
using namespace std;

class Sum {
    int a, b;
    public:
    Sum();
    Sum(int x, int y);
    int result();
};

Sum::Sum() {
    int x, y;
    cout << "x값 입력 : ";
    cin >> x;
    cout << "y값 입력 : ";
    cin >> y;
    cout << endl;

    Sum(x, y);
}
Sum::Sum(int x, int y) {
    a = x;
    b = y;
}
int Sum::result() {
    return a+b;
}

int main() {
    Sum hello;
    int result = hello.result();
    cout << "결과값 : " << result << endl;

return 0;
}