#include <iostream>
#include <string>
using namespace std;

class TV {
    int size;
public:
    TV(int size) {this->size = size;}
    int getSize() {return size;}
};

class WideTV : public TV {
    bool VideoIn;
public:
    WideTV(int size, bool VideoIn) : TV(size) {
        this->VideoIn = VideoIn;
    }
    bool getVideoIn() {return VideoIn;}
};

class SmartTV : public WideTV {
    string IpAddr;
public:
    SmartTV(string IpAddr, int size) : WideTV(size, true) {
        this->IpAddr = IpAddr;
    }
    string getIpAddr() {return IpAddr;}
};

int main() {
	SmartTV  htv("192.0.0.1", 32);
	cout << "size=" << htv.getSize() << endl;
	cout << "videoIn=" << boolalpha << htv.getVideoIn() << endl;
	cout << "IP=" << htv.getIpAddr() << endl;
}
