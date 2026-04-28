#include <iostream>
#include <string>
using namespace std;

class Account {
private:
	string name;
	int money;
public:
	Account(string name) { this->name = name; money = 0; }
	void deposit(int deposit) { money += deposit; }
	string getOwner() { return name; }
	int inquiry() { return money; }
	int withdraw(int withdraw);
};

int Account::withdraw(int withdraw) {
	money -= withdraw;
	return withdraw;
}


int main() {
	Account a("È²¼öÈñ");
	a.deposit(20000);
	cout << a.getOwner() << " ÀÜ¾×Àº " << a.inquiry() << endl;
	int money = a.withdraw(15000);
	cout << money << "¿ø Ãâ±Ý" << endl;
	cout << a.getOwner() << " ÀÜ¾×Àº " << a.inquiry() << endl;
	money = a.withdraw(5000);
	cout << money << "¿ø Ãâ±Ý" << endl;
	cout << a.getOwner() << " ÀÜ¾×Àº " << a.inquiry() << endl;
}