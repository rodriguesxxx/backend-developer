#include<stdio.h>


int sum(int arr[], size_t n) {
    int sum = 0;//0(1) //ingnora

    for(int i = 0; i < n; i++) sum+=arr[i]; //0(n)

    return sum;
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    size_t n = sizeof(arr)/sizeof(arr[0]); //0(1) //ingnora
    
    printf("%d\n", sum(arr, n));
    
    return -1;
}

//complexidade: 0(n)