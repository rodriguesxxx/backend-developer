#include<stdio.h>

int count(int arr[], int n, int element) {
    int count = 0;

    for(int i = 0; i < n; i++) { //0(n)
        if(arr[i] == element) count++; //0(1)
    }

    return count;
}

int main() {
    int arr[] = {1, 2, 3, 2, 2, 4};
    int size = sizeof(arr)/sizeof(arr[0]);

    printf("%d\n", count(arr, size, 2));

    return -1;
}

//complexidade: 0(n)