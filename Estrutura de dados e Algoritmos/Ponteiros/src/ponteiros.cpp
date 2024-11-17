#include<iostream>

using namespace std;

int main() {
    int *pX =  new int;
    *pX = 11;
    cout << pX << endl;
    delete pX;
    pX = new int; //ou nulo(0)
    return 0;
}