## Teoria vs Prática

Imagine que construir uma casa é como criar um `desenho especial`. Antes de começarmos a desenhar, precisamos de uma ideia, como se fosse um plano para saber como a casa vai ficar. Isso é chamado de `teoria`. É como se estivéssemos planejando cada detalhe da casa para que ela seja perfeita.

A `teoria` é como uma planta mágica que mostra como a casa vai ser. Mas, para tornar essa casa real, precisamos colocar as `mãos na massa`, ou seja, começar a construir de verdade. Isso é a `prática`. É quando pegamos ferramentas e materiais para dar vida ao nosso desenho e transformá-lo em uma casa de verdade.

<img src="https://s2.glbimg.com/-BWfDAZ2fb9HOp4Y2R5LrJOjO8Q=/smart/e.glbimg.com/og/ed/f/original/2020/08/11/image_ImqyThW.png">

## Happy!

Para facilitar o entendimento, vamos inventar nossa própria linguagem de programação.

Que tal chamarmos de `Happy!`?

**obs:** **Happy!** é apenas para aprender. Não há documentação nem um compilador para ela, então, por favor, não leve isso muito a sério.

## Básico de matrizes

-   **Declaração**

    ```
    matriz meusNumeros = [1, 2, 3];
    ```

    -   Isso declara uma matriz de numeros.

    -   O `ponto e virgula(;)` indica que aquele trecho de código acabou.

-   **Mostrando valores**

    ```
    meusNumeros.imprimirValores();
    ```

    -   Mostra todos os valores da nossa matriz.

    -   O `ponto final(.)` é usado para acessar funcionalidades da nossa matriz.

-   **Pegando valor em posição especifica**

    ```
    variavel posicao = 2;
    imprimir(meusNumeros.pegarValor(posicao));
    ```

    -   É declarado uma variavel chamada `posicao` com o valor `2`;

    -   A função `imprimir` mostra determinado valor na tela.

    -   A função `pegarValor` recebe uma `posição` da `matriz` e retorna o `valor` dela.

    **_saída_:**
    `   3`

    **_"Mas porque a posição `2` é igual a `3`, não era pra ser `2`?"_**

    Não. Na programação a primeira posição de determinado conjunto não é `1`, é `0`.

    Por isso o valor da posição `2` é `3`.

-   **Inserindo valor**
    ```
    meusNumeros.inserirValor(4);
    ```
    -   A função `inserirValor` adiciona um valor ao final da matriz.

## Invertendo Matriz

Dada uma matriz de numeros inteiros, sua tarefa é `inverter` essa matriz.

**Exemplo**

```
Entrada: [1, 2, 3]
Saída: [3, 2, 1]
```

### Solução em Happy!

Antes da solução, precisamos conhecer o `laço de repetição` `para`.

-   **Para**

    ```
    para numero dentro de numeros {
        imprimir(numero);
    }
    ```

    O `para` entra dentro da matriz e guarda os números um depois do outro na variavel `numero`.

**_Vamos para solução_**

```
matriz numeros = [1, 2, 3];
matriz numerosInvertidos = [];
numerosInvertidos.tamanho = 3;

variavel posicao = 2;

para numero dentro numeros {
    numerosInvertidos.inserirValor(posicao, numero);
    posicao = posicao - 1;
}

numerosInvertidos.imprimirValores();

```

-   **Passo 1:**

    Imagine que temos uma caixa mágica chamada "numeros" com os números 1, 2 e 3 dentro.

-   **Passo 2:**

    Agora, pegamos outra caixa mágica vazia chamada "numerosInvertidos" para guardar nossos números de forma diferente.

-   **Passo 3:**

    Pegamos um número da caixa "numeros" (começamos com o 1) e o colocamos na "numerosInvertidos". Agora, a "numerosInvertidos" tem o número 1.

-   **Passo 4:**

    Dizemos a um ajudante mágico chamado "posicao" que ele começa na posição 2.

-   **Passo 5:**

    Pegamos o próximo número na "numeros" (agora é o 2) e o colocamos na posição indicada pela "posicao" na "numerosInvertidos". Agora, a "numerosInvertidos" tem os números 2 e 1.

-   **Passo 6:**

    Diminuímos a posição do nosso ajudante "posicao" em 1, então agora ele está na posição 1.

-   **Passo 7:**

    Pegamos o último número na "numeros" (agora é o 3) e o colocamos na posição indicada pela "posicao" na "numerosInvertidos". Agora, a "numerosInvertidos" tem os números 3, 2 e 1.

-   **Passo 8:**

    Abrimos a caixa "numerosInvertidos" e mostramos os números 3, 2 e 1, que são os números da "numeros" organizados de trás para frente!

### Solução em C++ - Para adultos

```cpp
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

vector<int> reverseArray(vector<int> arr) {
    vector<int> reversed = arr;
    reverse(reversed.begin(), reversed.end());
    return reversed;
}

int main() {
    vector<int> arr{1, 2, 3};
    vector<int> reversed = reverseArray(arr);
    for_each(reversed.begin(), reversed.end(), [](int value) {
        cout << value << "\n";
    });
    return 0;
}
```

## Extras

Como mencionei anteriormente, "Happy!" é uma criação da minha imaginação, e o compilador para essa linguagem está na minha mente.

No entanto, se você estiver interessado em aprender a programar em português, eu recomendo o [Portugol](https://dgadelha.github.io/Portugol-Webstudio/). É uma ferramenta muito útil para começar a entender como a programação funciona. Divirta-se explorando o mundo da programação!
