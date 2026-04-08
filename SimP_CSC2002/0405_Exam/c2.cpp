#include <iostream>
#include <string>
using namespace std;

class Cafe {
    public:
    int total = 0;
    void order(string menu, int n) {
        int value = 0;
        if (menu == "에스프레소") {
            value = n * 3000;
            cout << value << "원입니다. 맛있게 드세요." << endl;
            total += value;
        } else if (menu == "아메리카노") {
            value = n * 3500;
            cout << value << "원입니다. 맛있게 드세요." << endl;
            total += value;
        } else if (menu == "카푸치노") {
            value = n * 4000;
            cout << value << "원입니다. 맛있게 드세요." << endl;
            total += value;
        }
    }
};

int main() {
    Cafe cafe;
    while (1) {
        if (cafe.total >= 30000) {
            cout << "오늘 " << cafe.total << "을 판매하여 카페를 닫습니다. 내일 봐요~~" << endl;
            return 0;
        }

        cout << "주문>>";
        string menu;
        int count;
        cin >> menu >> count;
        
        cafe.order(menu, count);
    }



}