#include<stdio.h>

int second_largest(int arr[], size_t n) {
    int largest = arr[0];
    int second_largest = largest;
    for(int i = 1; i < n; i++) { //0(n - 1)
        if(arr[i] > largest) {
            second_largest = largest;
            largest = arr[i];
        }
    }

    return second_largest;
}

int main() {
    int arr[] = {1, 2, 3, 4, 5}; //4
    size_t size = sizeof(arr)/sizeof(arr[0]);

    printf("%d\n", second_largest(arr, size));

    return -1;
}