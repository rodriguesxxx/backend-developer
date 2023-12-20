#include <iostream>
using namespace std;

template <class T, int capacidade>
void Lista<T, capacidade>::add(const T& valor) {
    valores[this->tamanho] = valor;
    this->tamanho++;
}

template <class T, int capacidade>
void Lista<T, capacidade>::listar() {
    for (int i = 0; i < this->tamanho; i++) {
        cout << this->valores[i] << std::endl;
    }
}

    
    
