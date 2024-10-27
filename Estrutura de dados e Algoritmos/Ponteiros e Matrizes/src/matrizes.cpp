#include<iostream>

using namespace std;

int main() {

    int *m, n = 5, soma = 0, *pM;
    m = new int[n];
    
    for(int i = 1; i < n + 1; ++i) {
        *(m+i) = i; 
    }

    for(pM = m + 1; pM <= m + n; ++pM) {
        soma += *pM;
    }

    cout << soma << endl;

    delete [] m;
                                                                                                                                                                                                                                                                                                           
    m = 0;

    return 0;
}