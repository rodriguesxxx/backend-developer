#include<iostream>
#include <cstdlib>
using namespace std;

int *n;


void make_matriz(int s) {
    
    n = new int[s];

    for(int i = 0; i < s; ++i) {
        *(n+i) = i;
    }

}

int sort(int i) {
    srand(static_cast<unsigned int>(time(0)));
    int r = rand() % i;
    return *(n + r - 1);
}

int main() {

    int qtyT = 3; //quantidade de tentativas
    int t;
    int sN = 10;
    make_matriz(sN);

    int v = sort(sN);

    do {
        --qtyT;
        cout << "informe um número: ";
        cin >> t;
        cout << endl;
        if(t == v) {
            cout << "Você ganhou, Gayzão!" << endl;
            cout << "Bye, Bye..." << endl;
            system("shutdown -h now");
            break; 
        }
        cout << "Restam " << qtyT << " tentativas seu boco!" << endl;
    } while(qtyT > 0);

    return 0;   
}