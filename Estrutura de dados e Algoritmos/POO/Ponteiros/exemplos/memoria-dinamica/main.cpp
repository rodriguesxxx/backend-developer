#include <iostream>
using namespace std;

int main() {
    int *p;
    int z = 1;
    p = new int;
    *p = 10;
    cout << *p << endl;
    delete p;
    return 0;
}