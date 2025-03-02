#include<stdio.h>
#include<stdlib.h>

void sort(int arr[], size_t n) {
    for(int i = 1; i < n; i++) {
        int key = arr[i];
        int sub_i = i - 1;
        while(sub_i >= 0 && arr[sub_i] > key) {
            arr[sub_i + 1] = arr[sub_i];
            sub_i--;
        }

        arr[sub_i + 1] = key; 
    }
}

int main() {
    int arr[] = {3, 1, 4, 2, 1};
    size_t n = sizeof(arr)/sizeof(arr[0]);

    sort(arr, n);
    for(int i = 0; i < n; i++) {
        printf("%d\n", arr[i]);
    }

    return 0;
}