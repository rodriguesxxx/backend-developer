## Reverter uma matriz de inteiros.

Exemplo: [3, 2, 1]

Deve Retornar: [1, 2, 3]

## Solução em C++

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

## Explicação

```cpp
    vector<int> reversed = arr;
```

Armarzena uma cópia do array em `reversed`.

```cpp
    reverse(reversed.begin(), reversed.end());
```

Utiliza o método `reverse` da bibloteca `algorithm` para inverter o array.

```cpp
    for_each(reversed.begin(), reversed.end(), [](int value) {
        cout << value << "\n";
    });
```

É utilizado um `foreach` para percorrer o array invertido e uma função `lambda` para mostrar os valores.
