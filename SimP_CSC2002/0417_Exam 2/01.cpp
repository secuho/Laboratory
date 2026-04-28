#include <iostream>
#include <String>
using namespace std;



int main() {
    string url;

    while(1) {
        string address;
        cout << "웹 주소 입력 >> ";
        cin >> address;

        string protocol;
        cout << "프로토콜 : ";
        cin >> protocol;

        string host;
        cout << "호스트 : ";
        cin >> host;
        if (host.empty()) {
            host = "80";
        }

        string port;
        cout << "포트 : ";
        cin >> port;

        string rest;
        cout << "나머지 부분 : ";
        cin >> rest;

        
        

    }



}