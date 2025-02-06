# Ordenação: SelectionSort

O princípio de funcionamento do **selection sort** é o seguinte: selecione o menor item do vetor e a seguir troque-o como item da primeira posição.

**Exemplificação**

```c
int arr[] = {3, 5, 1, 0};

//1° rodada(i -> 0)(n)
    //menor item: 0
    //ação: trocar com o 3(1° posição)

int arr[] = {0, [5, 1, 3]};

//2° rodada(i -> 1)(n - 1)
    //menor item: 1
    //ação: trocar com o 5(1° posição)

int arr[] = {0, 1 [5, 3]};

//3° rodada(i -> 2)(n - 2)
    //menor item: 3
    //ação: trocar com o 5(1° posição)

int arr[] = {0, 1, 3, [5]};

//4° rodada(i -> 3)(n - 3)
    //menor item: 5
    //ação: sem trocas

int arr[] = {0, 1, 3, 5}; //arranjo ordenado!

```

**Implementação**

```c
void sort(int arr[], size_t n) {
    for(int i = 0; i < n - 1; i++) {
        int min_index = i;
        for(int j = i; j < n; j++) {
            if(arr[j] < arr[min_index]) min_index = j;
        }
        int aux = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = aux;

    }
}
```
