#include<stdio.h>

//melhor caso: 0(n)
//pior caso: 0(n²)
//caso médio: 0(n²)

int selection_sort(int arr[], size_t n) {
    
    int i1 = 0; //quantidade de iterações do primeiro for
    int i2 = 0; //quantidade de iterações do segundo for

    for(int i = 0; i < n - 1; i++) { //0(n)
        for(int j = 0; j < n - 1; j++) { //0(n)
            if(arr[j] > arr[j+1]) {
                //O INTUITO N É ORDENAR O ARRAY, POR ISSO ISSO N É PRECISO FAZER AS TROCAS!
                
                // int aux = arr[j];
                // arr[j] = arr[j+1];
                // arr[j+1] = aux;
                
                i2++;
            }
        }
        i1++;
    }

    return i1 - i2 + 1;
}

int is_ordered(int arr[], int n) {
    int iterations = selection_sort(arr, n);
    
    return iterations == n;
}

int main() {

    int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    size_t size1 = sizeof(arr1)/sizeof(arr1[0]);

    printf("%d\n", is_ordered(arr1, size1)); //1

    int arr2[] = {4, 3, 5, 1, 2};
    size_t size2 = sizeof(arr2)/sizeof(arr2[0]);
    
    printf("%d\n", is_ordered(arr2, size2)); //0
    
    return -1;
}

//complexidade: 0(n) * 0(n) -> 0(n²)