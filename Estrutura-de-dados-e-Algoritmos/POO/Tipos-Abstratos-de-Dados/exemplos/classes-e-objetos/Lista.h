#ifndef LISTA
#define LISTA

template <class T, int capacidade=10>
class Lista {
    private:
        T valores[capacidade];
        int tamanho = 0;

    public:
        void add(const T& valor);
        void listar();
};

#include "Lista.tpp"

#endif