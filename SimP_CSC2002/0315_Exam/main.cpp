#include <iostream>
using namespace std;

int main() {

for (int i = 1; i <= 5; i++) { // 층
    for (int j = 1; j <= i; j++) // 열
        cout << '*';
    cout << endl;
}

return 0;
}