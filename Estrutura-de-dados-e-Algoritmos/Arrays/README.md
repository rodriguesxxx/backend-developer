## Arrays na Prática
Os arrays são estruturas de dados que consistem em uma coleção ordenada de elementos, onde cada elemento é armazenado em um local de memória sequencial. Eles permitem agrupar vários itens do mesmo tipo, facilitando o acesso e a manipulação desses elementos através de índices numéricos. Isso significa que cada item em um array está localizado em um local específico na memória, facilitando o acesso rápido aos elementos e oferecendo a capacidade de armazenar dados do mesmo tipo de forma organizada e eficiente.

## Mão na massa

Como linguagem, escolhi o `C++`, por ser mais fácil que o `C` e não tão patética quanto o `JS`. Uma coisa interessante: o motor V8 do `Node.js` é construído em cima do `C++`.;

### Declarando um array em C++

```cpp
    int arr[3]; //simples não?
```

Isso significa que estamos definindo um `array` de `inteiros` com capacidade para `3` inteiros.
O compilador reserva um espaço na memória para armazenar três inteiros consecutivos. Cada int geralmente ocupa `4 bytes`` em arquiteturas (32/64 bits) na maioria dos sistemas.

### Atribuindo valores
```cpp
    arr[0] = 1;
    arr[2] = 3;
    arr[1] = 2
```
Para `atribuirmos` um `valor` ao array passamos seu `nome[a posicao desejada]` = e o `valor`.

***Igual morder água***.

### Tudo em uma linha
Veja que apenas esse `códigozinho` simples que fizemos foi `4 linhas`.
Mas é possivel fazer isso tudo em `1 linha`.
```cpp
int arr[3] = {1, 3, 2};
```
### "A mas eu não sei o tamanho do meu array"
***Relaxe e deixe o compilador trabalhar para você***
```cpp
int arr[] = {1, 3, 2};
```
Dessa forma, o compilador gerencia automaticamente a alocação de memória, ajustando-a conforme a quantidade de elementos fornecidos na inicialização.

---
### "Então posso fazer algo como arr[3] = 4"
**Tá achando que é brincadeira?**

Faça isso e você irá tomar um `stack smashing detected`

---

Continuaremos amanhã a falar sobre `arrays`, em especial sobre uma biblioteca chamada `vector`, que é semelhante ao array, porém possui algumas funcionalidades adicionais

## Extras
### Estrutura base de um código C++
```cpp
#include <iostream>
using namespace std;

int main() {
    //seu codigo.
    return 0;
}
```