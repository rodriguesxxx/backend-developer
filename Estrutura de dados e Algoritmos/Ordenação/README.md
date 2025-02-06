# Ordenação

Ordenar é o processo de reorganizar um conjunto de elementos em ordem crescente ou decrescente.
Um bom exemplo disso é a ordem alfabética das listas telefônicas, imagine o quanto seria difícil encontrar determinado contato se não estivesse ordenado.

Os métodos de ordenação são classificados em dois grupos: **_Ordenação interna_** e **_Ordenação externa_**.

-   ### Ordenação interna

    Nesse caso, o número(n) de registros a ser ordenados é pequeno o bastante para caber em um estrutura como o **array**, ou seja, não deve ocupar mais que a memória principal do computador(**RAM**).

-   ### Ordenação externa
    Se o conjunto a ser ordenado não cabe na memória **RAM**, ele deve ser armazenado em disco(**HDD/SSD**).

O principal motivo na escolha de um **algoritmo de ordenação** é o tempo gasto por ele para ordenar o conjunto de dados. Na **ordenação interna** as medidas de complexidade relevantes contam o número de comparações(`arr[0...i] <> arr[i...n]`) entre chaves e o número de movimentações(`n`) dos itens do conjunto.

Outra coisa **importante** é como a memória está sendo utilizada na ordenação. Métodos que utilizam arranjos e executam a permutação dos itens no próprio arranjo - sem a necessidade de cópias - são os menos custozos e mais preferidos. Isso é chamado de **_in situ_**

**_Exemplo:_**

```c
static void sort(int arr[], int n) {
    for(int i = 0; i < n-1; i++) {
        for(int j = 0; j < n; j++) {
            if(arr[j] > arr[j+1]) {
                int aux = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = aux;
            }
        }
    }
}
```

O `int arr[]` aponta para a posição do meu arranjo de fato na memória, e a permutação é feita nesse próprio arranjo, sem a necessidade de espaço extra.
