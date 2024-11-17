## Ponteiros e Matrizes

### Ponteiros - Definição

As variáveis de uma programa são como caixas que nunca estão vazias. Elas podem ser definidas por você(mero mortal programador) ou pelo sistema operacional. O motivo das variáveis nunca estarem vazias vem do fato de que o SO precisa alocar um espaço na memória para tal. Composta por valor e o endereço na memória, as variáveis são umas das coisas mais utilizadas na programação.

Mas o que isso tem haver com ponteiros?

    Primeiro precisamos entender o que é de fato um ponteiro.

O ponteiro é uma referência a outra variável, nele é guardado as coordenadas que localizam aquela variável na memôria do computador.

Assim podemos acessar aquela variável a partir do ponteiro.

As variáveis que contém no seu valor a localização para outra variável são chamadas de ponteiros.

### Ponteiros - Implementação

```cpp
int x = 10, *pX; // o '*' indica ao compilador que a variável será um ponteiro.

pX = &x; // agora o ponteiro 'pX' está apontado para 'x'.

//obs: O '&' indica para o compilador que queremos pegar o endereço de x, não o seu valor.

cout << *pX << endl; // O '*' é uma operador de indireção, ele força o SO a buscar o valor de 'x' a partir do seu endereço salvo em 'pX'
```

### Ponteiros - Na prática

Ao trabalharmos com micro controladores, temos uma gama limitada de memória, por isso precisamos alocar de forma precisa(para não desperdiçar).

```cpp
#include<iostream>

using namespace std;

int main() {
    int *pX =  new int; //Toma a memória necessária para estocar um objeto inteiro

    *pX = 11; //atribuir a esse endereço o valor '11'

    cout << *pX << endl;

    delete pX; //libera a memória alocada dinamicamente para evitar vazamento.

    cout << pX << endl;

    return 0;
}
```

Mesmo liberando a memória com o `delete`, os endereços do bloco de memória liberados ainda estão em 'pX', embora o valor não exista mais(mas o espaço sim). Para evitar esse problema, um endereço deve ser atribuido a esse ponteiro, se não poder ser um novo local, deve se atribuir o um endereço nulo(0).

```cpp
//...

pX = new int; //ou nulo(0)
```

### Matrizes - Alocação dinâmica usando ponteiros

Antes de deixarmos nossa matriz dinâmica, precisamos entender qual é a relação entre matrizes x ponteiros. Uma matriz é um conjunto de ponteiros que apontam para determinados valores na memória. Esses endereços são alocados de forma ordenada, ou seja, sabendo o primeiro eu consigo chegar ao último.

Exemplo:

    Valor:        [1, 101, 201, 301, 401]
    End. Memória  [1080, 1081, 1082, 1083]

A partir do primeiro endereço `1080` conseguimos chegar no último `1083`, basta somar(1080 + 3 = 1083)

    ISSO DEPENDE DO NÚMERO DE BYTES

```cpp
#include<iostream>

using namespace std;

int main() {

    int nSize = 5, n[nSize] = {1, 2, 3, 4, 5}, *pN, soma, i;

    for(soma = *n, i = 1; i < nSize; ++i) { //'*n' chama o primeiro valor do array
        soma += *(n+i); // o compilador aloca os elementos um ao lado do outro, ou seja, podemos acessa-los de forma ordenada.
    }

    cout << soma << endl;


    //Uma maneira alternativa
    for(soma = *n, pN = n + 1; pN < n+nSize; ++pN) { //n + 1 é o mesmo que o próximo endereço da memória | n +  nSize é o mesmo que proximo depois do ultimo endereço de memória
        soma += *pN;
    }

    cout << soma << endl;

    return 0;
}
```

**Alocação dinâmica**

```cpp
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
```

## Ponteiros e Construtores de Cópias

A cópia de dados de um objeto para outro, pode causar alguns problemas. Um deles é cópia inadequada de ponteiros de um objeto para outro.

**Exemplificação**

```cpp
struct Pessoa {
    char* nome;
    int idade;

    Pessoa(const char *nome = "", int idade = 0) {
        this->nome = new char[strlen(nome) + 1];
        strcpy(this->nome, nome);
        this->idade = idade;
    }
};

int main() {

    Pessoa p1("Daniel", 18), p2(p1); //copia o objeto p1 para p2

    strcpy(p2.nome, "Leinad"); //altera o nome de p2(só que NÃO)
    p2.idade = 108;

    cout << p1.nome << endl; //Leinad
    cout << p1.idade << endl; //18

    return 0;
}

```

Quando `p2` recebe uma cópia de `p1`, o compilador cria por padrão um `construtor de cópia`, só que quando se tem um ponteiro como membro(no caso o `nome`), o que é passado na cópia é o endereço na memória, não o valor. Por isso `p2.nome` é uma referência a `p1.nome`, em outras palavras, `p2.nome` aponta para `p1.nome`.

**Solucionando o problema**

Para resolver isso, precisamos nós mesmos implementar o nosso construtor de cópia.

```cpp
struct Pessoa {
    char* nome;
    int idade;

    Pessoa(const char *nome = "", int idade = 0) {
        this->nome = new char[strlen(nome) + 1];
        strcpy(this->nome, nome);
        this->idade = idade;
    }

    Pessoa(const Pessoa& p) {
        this->nome = new char[strlen(p.nome) + 1];
        strcpy(this->nome, p.nome); //assim é copiado o valor, não a referencia.
        this->idade = p.idade;
    }

};

int main() {

    Pessoa p1("Daniel", 18), p2(p1); //copia o objeto p1 para p2

    strcpy(p2.nome, "Leinad"); //altera o nome de p2
    p2.idade = 108;

    cout << p1.nome << endl; //Daniel
    cout << p2.nome << endl; //Leinad

    return 0;
}

```

### Problema da atribuição!

O operador de atribuição sofre um problema parecido.
