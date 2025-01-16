#include<stdio.h>

void bidirectional_sort(int arr[], size_t size) {
    int swapped;
    do {
        swapped = 0;
        for (size_t i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int aux = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = aux;
                swapped = 1;
            }
        }

        for (size_t i = size - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                int aux = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = aux;
                swapped = 1;
            }
        }
    } while (swapped);
}

void sort(int arr[], size_t size) {
    for(int j = 0; j < size - 1; j++) {
        for(int i = 0; i < size - 1; i++) {
            if(arr[i] > arr[i+1]) {
                int aux = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = aux;
            }
        }
    }
}


int main() {

    int arr[] = {4, 3, 2, 1};
    size_t size = sizeof(arr)/sizeof(arr[0]);

    bidirectional_sort(arr, size);

    for(int i = 0; i < size; i++) {
        printf("%d\n", arr[i]);
    }
    return 0;
}