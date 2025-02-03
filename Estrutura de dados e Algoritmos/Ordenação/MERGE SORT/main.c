#include<stdio.h>

struct Size {
    int a1;
    int a2;
};

void merge(int a1[], int a2[], int a[], struct Size sizes) {
    
    int i = 0, j = 0, k = 0;

    while(i < sizes.a1 && j < sizes.a2) {
        if(a1[i] <= a2[j]) {
            a[k] = a1[i];
            i++;
        } else {
            a[k] = a2[j];
            j++;
        }

        k++;
    }

    while(i < sizes.a1) {
        a[k++] = a1[i++];
    }

    while(j < sizes.a2) {
        a[k++] = a2[j++];
    }

}

int main() {
    struct Size sizes;
    
    int a1[] = {7, 10, 19, 20};
    sizes.a1 = sizeof(a1)/sizeof(a1[0]);

    int a2[] = {9, 12, 17, 21, 22, 23};
    sizes.a2 = sizeof(a2)/sizeof(a2[0]);

    int a[sizes.a1 + sizes.a2];

    merge(a1, a2, a, sizes);
    
    for(int i = 0; i < sizes.a1 + sizes.a2; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");


    return 0;
}