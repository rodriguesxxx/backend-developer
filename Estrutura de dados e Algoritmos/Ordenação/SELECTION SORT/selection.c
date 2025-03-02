#include<stdio.h>
#include<stdlib.h>

void sort(int arr[], int size) {
    for(int i = 0; i < size - 1; i++) {
        int min_index = i;

        for(int k = i; k < size; k++) {
            min_index = (arr[k] < arr[min_index]) ? k : min_index;
        }

        if(arr[i] > arr[min_index]) {
            int aux = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = aux; 
        }
    }
}

int main() {

    int arr[] = {5,3,2,1};
    int size = sizeof(arr)/sizeof(arr[0]);

    sort(arr, size);
    for(int i = 0; i < size; i++) {
        printf("%d\n", arr[i]);
    }
    return 0;
}