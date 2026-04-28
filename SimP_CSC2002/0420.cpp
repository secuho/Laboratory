#include <iostream>
#include <string>
using namespace std;

void printMatrix(int x = 2, int y = 2, char ch = '*');

void printMatrix(int x, int y, char ch) {
    for (int i=1; i<=x; i++) {
        for (int j=1; j<=y; j++) {
            cout << ch << " ";
        }   cout << endl;
    }
}

int main() {
    printMatrix();
    printMatrix(2, 5, 'a');
    printMatrix(1, 10);
}
