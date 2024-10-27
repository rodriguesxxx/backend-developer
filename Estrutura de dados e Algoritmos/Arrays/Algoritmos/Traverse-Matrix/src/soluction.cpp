#include<vector>
#include <iostream>
using namespace std;

void percorrerVetor(vector<int>& vetor, int index = 0) {
    if(index < vetor.size()) {
        cout << vetor[index] <<  " ";
        percorrerVetor(vetor, index+1);
    }
}

void percorrerMatriz(vector<vector<int>>& matriz, int index = 0) {
    if(index < matriz.size()) {
         percorrerVetor(matriz[index]);
         percorrerMatriz(matriz, index+1);
    }
}

int main() {
    vector<vector<int>> matriz = {{1, 2, 3}, {4, 5, 6}};
    percorrerMatriz(matriz);
    return 0;
}