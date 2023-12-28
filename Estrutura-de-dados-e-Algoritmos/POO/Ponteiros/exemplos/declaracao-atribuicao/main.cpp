#include <iostream>
using namespace std;

int main() {
    int i = 120;
    int *p = &i;
    *p = 10;
    cout << *p << endl;
    cout << i << endl;
    return 0;
}