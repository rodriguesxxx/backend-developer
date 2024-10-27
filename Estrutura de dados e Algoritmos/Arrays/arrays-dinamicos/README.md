## Mas o que é isso?

`Array dinâmico` é uma estrutura de dados que funciona com o um `array convencional`, mas com a capacidade de redimensionar automaticamente sua `capacidade de armazenamento` em tempo de execução.

## Codando um Array Dinâmico

```cpp
#include <iostream>
using namespace std;

template <typename T>
class Array {
    private:
        T *data;
        int capacity;
        int size;

    public:
        Array() : data(nullptr), capacity(0), size(0) {}

        //adiciona um valor ao array
        void add(const T& value) {

            //Caso o array esteja cheio, é aumentado a capacidade.
            if(size >= capacity) {
                int newCapacity = (!capacity) ? 1 : capacity * 2;
                T *newArray = new T[newCapacity];

                //Copia os dados do array atua, para o novo.
                for(int i = 0; i < size; ++i) newArray[i] = data[i];

                //Da aquela liberada na memoria, pra não crachar essa bomba sua.
                delete[] data;

                data = newArray;
                capacity = newCapacity;
            }

            data[size] = value;
            ++size;
        }

        //mostra todos os elementos
        void show() {
            for(int i = 0; i < size; ++i) cout << data[i] << endl;
        }

        //libera memoria alocada
        ~Array() {
            delete[] data;
        }
};

int main() {
    Array<int> array;
    array.add(3);
    array.add(10);
    array.show();
    return 0;
}
```

**_"Ah, mas o vector já faz isso pra mim..."_**

Bro, se curte usar paradas sem entender como funcionam, recomendo pensar em mudar de área, porque se continuar assim, vai acabar sendo só mais um: **_CTRL + C Dev_**

## Tudo mais simples com o `vector`

```cpp
#include <vector>
#include <iostream>
using namespace std;

int main() {

    vector<int> vector; //cria um vetor de inteiros
    vector.push_back(3); //adc um valor no final desse vetor
    vector.push_back(10);

    for(int i = 0; i < vector.size(); ++i) cout << vector[i] << endl; //mostra todos os elementos do vetor

    return 0;
}
```

Sem dúvida, o vetor é uma estrutura de dados avançada e muito útil. Em poucas linhas, podemos utilizar um array dinâmico com diversos métodos úteis.

## `Eu` vs `Bjarne Stroustrup`

Já que implementamos nosso próprio `array dinâmico`, vamos ver como ele se sai em comparação ao `vector`.

**obs: Vou testar apenas o tempo de execução, que pode variar bastante dependendo do estado da maquina. Então não leve a serio!**

```cpp
#include <chrono>
#include <vector>
#include <iostream>
using namespace std;

template <typename T>
class Array {
    private:
        T *data;
        int capacity;
        int size;

    public:
        Array() : data(nullptr), capacity(0), size(0) {}

        //adiciona um valor ao array
        void add(const T& value) {

            //Caso o array esteja cheio, é aumentado a capacidade.
            if(size >= capacity) {
                int newCapacity = (!capacity) ? 1 : capacity * 2;
                T *newArray = new T[newCapacity];

                //Copia os dados do array atua, para o novo.
                for(int i = 0; i < size; ++i) newArray[i] = data[i];

                //Da aquela liberada na memoria, pra não crachar essa bomba sua.
                delete[] data;

                data = newArray;
                capacity = newCapacity;
            }

            data[size] = value;
            ++size;
        }

        //mostra todos os elementos
        void show() {
            for(int i = 0; i < size; ++i) cout << data[i] << endl;
        }

        //libera memoria alocada
        ~Array() {
            delete[] data;
        }
};

int main() {
    cout << "Array Dinâmico by @rodriguesxxx" << endl;

    Array<int> array;
    auto start_time = std::chrono::high_resolution_clock::now();

    array.add(3);
    array.add(10);
    array.show();

    auto end_time = std::chrono::high_resolution_clock::now();
    auto time = std::chrono::duration_cast<std::chrono::microseconds>(end_time - start_time);

    cout << "-----------------------------------------" << endl;
    cout << "Tempo de execução: " << time.count() << "ms" << endl;
    cout << "-----------------------------------------" << endl;

    cout << "Array Dinâmico by @Bjarne Stroustrup" << endl;

    vector<int> vector;
    start_time = std::chrono::high_resolution_clock::now();

    vector.push_back(3);
    vector.push_back(10);
    for(int i = 0; i < vector.size(); ++i) cout << vector[i] << endl;

    end_time = std::chrono::high_resolution_clock::now();
    time = std::chrono::duration_cast<std::chrono::microseconds>(end_time - start_time);

    cout << "-----------------------------------------" << endl;
    cout << "Tempo de execução: " << time.count() << "ms" << endl;
    cout << "-----------------------------------------" << endl;

    return 0;
}
```

### output

```
Array Dinâmico by @rodriguesxxx
3
10
-----------------------------------------
Tempo de execução: 9ms
-----------------------------------------
Array Dinâmico by @Bjarne Stroustrup
3
10
-----------------------------------------
Tempo de execução: 6ms
-----------------------------------------
```

**Ele venceu.**

## Extras

**Quem é Bjarne Stroustrup:** https://pt.wikipedia.org/wiki/Bjarne_Stroustrup

**Mais sobre o vector:** https://www.learncpp.com/cpp-tutorial/introduction-to-stdvector-and-list-constructors/
