#include <iostream>
using namespace std;

int main() {

    int *arr = new int[5];

    for (int i=1; i<=5; i++) {
        cout << i << "번째 수: ";
        cin >> arr[i-1];
    }

    int *max = arr;
    for (int i=1; i<=5; i++) {
        if (arr[i-1] < *max)
            max = &arr[i-1];
    }
	
    cout << "최대값은 " << max << endl;
}
