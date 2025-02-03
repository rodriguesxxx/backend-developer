#include<stdio.h>

static void merge(int arr[], int begin, int mid, int end) {

    int arr_aux[end - begin + 1];
    
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

void sort(int arr[], int begin, int end) {
    if(begin < end - 1) {
        int mid = (begin + end) / 2;
        sort(arr, begin, mid);
        sort(arr, mid, end);
        merge(arr, begin, mid, end);
    }
}

int main() {
    
    int arr[] = {3,2,4,2,1,4,5,3,24};
    int n = sizeof(arr)/sizeof(arr[0]);

    sort(arr, 0, n);
    for(int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");


    return 0;
}