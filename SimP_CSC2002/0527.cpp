#include <iostream>
#include <string>
using namespace std;

template <typename T>
void safeswap(T& a, T& b)

template <class T1, class T2>
void m_swap(T1& a, T2& b) {
    T1 temp = a;
    a = static_cast<T1>(b);
    b = static_cast<T2>(temp);
}

class Item {
private:
    std::string name;
    int rarity;

public:
    Item(std::string n, int r) : name(n), rarity(r) {}

    int getRarity() const {return rarity;}
    std::string getName() const {return name;}

    bool operator>(const Item& other) const {
        return this->rarity > other.rarity;
    }
};


int main() {

    Item i1("슬라임", 1);
    Item i2("늑대의 말로", 5);

    cout << "교환 전: " << i1.getName() << " vs " << i2.getName() << endl;

    safeswap(i1, i2);

    cout << "교환 후: " << i1.getName() << " vs " << i2.getName() << endl;

return 0;
}
