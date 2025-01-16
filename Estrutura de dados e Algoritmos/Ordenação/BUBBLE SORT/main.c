#include<stdio.h>
#include<stdlib.h>

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

    sort(arr, size);

    for(int i = 0; i < size; i++) {
        printf("%d\n", arr[i]);
    }
    return 0;
}