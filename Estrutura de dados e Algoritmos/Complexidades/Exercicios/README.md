# Exercícios de Notação Big O

### Exercício 1: Soma de Elementos de um Array

Escreva um algoritmo que receba um array de números inteiros e retorne a soma de todos os seus elementos.

```c
// Entrada: [1, 2, 3, 4, 5]
// Saída esperada: 15
#include<stdio.h>


int sum(int arr[], size_t n) {
    int sum = 0;//0(1) //ingnora

    for(int i = 0; i < n; i++) sum+=arr[i]; //0(n)

    return sum;
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    size_t n = sizeof(arr)/sizeof(arr[0]); //0(1) //ingnora

    printf("%d\n", sum(arr, n));

    return -1;
}

//complexidade: 0(n)
```

**Pergunta:** Qual a complexidade desse algoritmo?

**Resposta:** _*0(n)*_

---

### Exercício 2: Contar Ocorrências de um Elemento

Implemente um algoritmo que conta quantas vezes um determinado elemento aparece em um array.

```c
// Entrada: array=[1, 2, 3, 2, 2, 4], elemento=2
// Saída esperada: 3
#include<stdio.h>

int count(int arr[], int n, int element) {
    int count = 0;

    for(int i = 0; i < n; i++) { //0(n)
        if(arr[i] == element) count++; //0(1)
    }

    return count;
}

int main() {
    int arr[] = {1, 2, 3, 2, 2, 4};
    int size = sizeof(arr)/sizeof(arr[0]);

    printf("%d\n", count(arr, size, 2));

    return -1;
}

//complexidade: 0(n)
```

**Pergunta:** Qual a complexidade desse algoritmo?

**Resposta:** _*0(n)*_
---

### Exercício 3: Verificar se um Array está Ordenado

Escreva um algoritmo que verifica se os elementos de um array estão ordenados em ordem crescente.

```c
// Entrada: [1, 2, 3, 4, 5]
// Saída esperada: True
// Entrada: [5, 3, 2, 1]
// Saída esperada: False
```

**Pergunta:** Qual a complexidade desse algoritmo?

---

### Exercício 4: Encontrar o Segundo Maior Elemento

Implemente um algoritmo para encontrar o segundo maior elemento de um array de números inteiros.

```c
// Entrada: [1, 3, 4, 5, 2]
// Saída esperada: 4

```

**Pergunta:** Qual a complexidade desse algoritmo?

---

### Exercício 5: Subarray com Soma Máxima (Kadane)

Implemente o algoritmo de Kadane para encontrar a soma máxima de um subarray contíguo em um array de números inteiros.

```c
// Entrada: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
// Saída esperada: 6 (subarray: [4, -1, 2, 1])
```

**Pergunta:** Qual a complexidade desse algoritmo?
