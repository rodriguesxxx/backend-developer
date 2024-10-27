/*
Author: Daniel Rodrigues
"""capturing the middle value in a 
given fibonacci sequence.
"""
*/

#include<iostream>
using namespace std;

int main() {

    long long *fib, n, k, mid;

    cout << "Informe um valor: ";
    cin >> n;

    fib = new long long[n];
    
    for(k = 1, *(fib) = k; k < n+1; ++k) {
        *(fib + k) = *(fib + k - 1) * k;                     
    }

    if(n % 2 != 0) {
        mid = *(fib + (n / 2 + 1));
    } else {
        mid = (*(fib + (n / 2)) + *(fib + (n / 2 + 1))) / 2;    
    }

    cout << "Valor do meio(aproximadamente): " << mid << endl;

    delete [] fib;
    
    return 0;
}