#include <iostream>
#include <string>
using namespace std;

class Temp {
public:
    double temp;
    Temp() {    temp = 1;   }
    Temp(double temp) { this->temp = temp;  }
    void setTemp(double temp) { this->temp = temp;  }
};

int main() {
    
    Temp *temp = new Temp[5];

    cout << "온도 5개 입력 >> ";
    for (int i=0; i<5; i++) {
        int tempo = 0;
        cin >> tempo;
        temp[i].setTemp(tempo);
    }

    double sum = 0;
    for (int i=0; i<5; i++) {
        sum += temp[i].temp;
    }

    double avg = sum / 5;

    cout << "AVG: " << avg << endl;

    delete [] temp;
}