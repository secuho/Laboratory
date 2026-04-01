#include <iostream>
#include <string>
using namespace std;

class Circle {
    int id;
    string name;
public :
    int getId();
    string getName();
    Circle();
    Circle(int a, string b);
    ~Circle();
};

int Circle::getId() {
    return id;
}

string Circle::getName() {
    return name;
}

Circle::Circle(int a, string b) : id(a), name(b) {}
Circle::Circle() : Circle(0, "None") {} // 위임 생성자
Circle::~Circle() {}

int main() {

    Circle jaeho(21, "jaeho");

    cout << "jaeho.id: " << jaeho.getId() << endl;
    cout << "jaeho.name: " << jaeho.getName() << endl;


    Circle *p = &jaeho;

    cout << "p->id: " << p->getId() << endl;
    cout << "p->name: " << p->getName() << endl;

    // int a[3] = {1, 2, 3} => Circle a[3] = ...
    // Circle *pa = new Circle[3];
    Circle a[3] = {Circle(), Circle(), Circle()};

    for (int i=0; i<3; i++) {
        cout << "a[" << i << "].id: " << a[i].getId() << endl;
        cout << "a[" << i << "].name: " << a[i].getName() << endl;
    }


    Circle *pa = new Circle[3];

    for (int i=0; i<3; i++) {
        cout << "pa[" << i << "].id: " << pa[i].getId() << endl;
        cout << "pa[" << i << "].name: " << pa[i].getName() << endl;
    }

    delete [] pa;


    Circle *ppa[3];

    ppa[0] = new Circle(1, "One");
    ppa[1] = new Circle(2, "Two");
    ppa[2] = new Circle();

    for (int i=0; i<3; i++) {
        cout << "ppa[" << i << "]의 id: " << ppa[i]->getId() << endl;
        cout << "ppa[" << i << "]의 name: " << ppa[i]->getName() << endl;
    }

    for (int i=0; i<3; i++) {
        delete ppa[i];
    }


    Circle b1(1, "One");
    Circle b2(2, "Two");
    Circle b3(3, "Three");

    Circle *ppb[3] = {&b1, &b2, &b3};

    for (int i=0; i<3; i++) {
        cout << "ppb[" << i << "]의 id: " << ppb[i]->getId() << endl;
        cout << "ppb[" << i << "]의 name: " << ppb[i]->getName() << endl;
    }


}