# Tipos Abstratos de Dados

Antes de comerçarmos a escrever um programa, deveríamos ter uma ideia otima de como deve ser escrito esse programa. Quais métodos essa classe deve ter, o que eles devem retornar, recebem parametros?
Nos estagios iniciais não deveriamos nos preocupar em como o programa poderia ou deveria ser feito e sim focar nossa atenção no que ele deveria fazer.
O comportamento do programa é mais importante do que as engrenagens do mecanismo que o executa.
Depois que essas operações são especificadas, a implementação do programa pode começar.
um item especificado em termos de operações é chamado de **tipo abstrato de dados**.

## Encapsulamento

Os dados em linguagens orientadas a objetos são fortemente acoplados, ou seja, os objetos se comunicam trocando mensagens que revelam um para o outro tão poucos detalhes sobre suas estruturas internas quanto o necessario para uma comunicação adequada.
em LOOs os objetos são como um relogio, estamos interrasados em seus ponteiros mas não no funcionamento interno, isso é abstração.

## Tipos Genéricos de dados

Um tipo genérico é um unico elemento que se adpta para executar a mesma funcionalizade para diversos tipos de dados.
Ao definir uma classes ou método generico, você não precisa definir uma versão para cada tipo de dados que aquele método ou classe irá atender.

### template c++

Os templates em c++ permite que você escreva código generico, tanto para classes, métodos ou estruturas de dados.

#### exemplo 1:

```cpp
#include <iostream>
#include<stdio.h>
#include <array>
using namespace std;

template<typename type>
array<type, 2> troca (type v1, type v2) {
    type tmp = v1;
    v1 = v2;
    v2 = tmp;

    array<type, 2> values = {v1, v2};
    return values;
}

int main() {
    array<int, 2> t = troca(1, 2);

    for(size_t i = 0; i < t.size(); i++) {
        cout << t[i] << endl;
    }

    return 0;
}
```

Esse é um exemplo de função que implementa os tipos genericos com o template.

#### exemplo 2:

```cpp
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
```

##### file: Lista.h

```cpp
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
```

##### file: Lista.tpp

Esse é um exemplo de classe que implementa os tipos genericos com o template
