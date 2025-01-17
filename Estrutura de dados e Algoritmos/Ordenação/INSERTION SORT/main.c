#include<stdio.h>

void sort(int arr[], size_t size) {
    for(int i = 1; i < size; i++) {
        int key = arr[i];
        int sublist_index = i - 1;

        while(sublist_index >= 0 && key < arr[sublist_index]) {
            arr[sublist_index + 1] = arr[sublist_index];
            sublist_index--;
        }

        arr[sublist_index + 1] = key;
    }
}


void __format(int arr[], size_t size, char _) {
    for(int i = 0; i < size; i++) {
        printf("%d", arr[i]);
        if(i < size - 1) {
            printf(" %c ", _);
        } 
    }

    printf("\n");
}

int main() {
    
    int arr[] = {3, 8, 2, 0};
    size_t size = sizeof(arr)/sizeof(arr[0]);
    
    __format(arr, size, '-');

    sort(arr, size);
    
    __format(arr, size, '|');

    return 0;
}