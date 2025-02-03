#include<stdio.h>


void merge(int arr[], int begin, int mid, int end) {

    int arr_aux[end - begin + 1];
    
    end++;

    int i = begin, j = mid, k = 0;
    
    while(i < mid && j < end) {
        if(arr[i] <= arr[j]) arr_aux[k++] = arr[i++];
        else arr_aux[k++] = arr[j++];
    }

    while(i < mid) arr_aux[k++] = arr[i++];

    while(j < end) arr_aux[k++] = arr[j++];

    for(i = begin, k = 0; i < end; i++, k++) {
        arr[i] = arr_aux[k]; 
    }
}

int main() {
    
    int arr[] = {5, 6, 7, 8, 1, 2, 3, 4, 5};
    int n = sizeof(arr)/sizeof(arr[0]);

    merge(arr, 0, 4, n);
    for(int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");


    return 0;
}