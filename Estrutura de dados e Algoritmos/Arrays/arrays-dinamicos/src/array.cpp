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