# Ordenação: BubbleSort

A ordenação por `bolha` funciona comparando pares de elementos adjacentes, trocando os de lugar se necessário.

**Exemplificação**

```c
int arr[] = {3, 5, 1, 0};

// 1.1° -> [|3 > 5|, 1, 0]
           false
// 1.2° -> [3, |5 > 1|, 0]
               true
// 1.3° -> [3, 1, |5 > 0|]
                 true
// 2.1° -> [|3 > 1|, 0, 5]
              true

// ... assim por diante
```

**Implementação**

```c
void sort(int arr[], size_t n) {
    for(int j = 0; j < n - 1; j++) {
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i+1]) {
                int aux = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = aux;
            }
        }
    }
}
```
