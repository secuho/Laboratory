#include <iostream>
using namespace std;

namespace jaeho {
    int sum(int a, int b) {
        return a+b;
    }
}

int main() {

    int n1 = 20, n2 = 30;

    cout << n1 << " + " << n2 << " = " << jaeho::sum(n1, n2);

return 0;
}