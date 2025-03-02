#include<stdio.h>

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

int main() {
    int arr[] = {2, 3, 4,1};
    size_t n = sizeof(arr)/sizeof(arr[0]);

    sort(arr, n);
    for(int i = 0; i < n; i++) {
        printf("%d\n", arr[i]);
    }
    return 0;
}