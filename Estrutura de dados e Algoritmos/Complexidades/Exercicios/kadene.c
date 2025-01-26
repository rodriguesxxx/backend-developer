#include<stdio.h>

//return index of min value in array
int min(int arr[], size_t n) {
    
    if(n <= 0) return -1;
    
    int min_index = 0;

    for(int i = 1; i < n; i++) {
        if(arr[i] < arr[min_index]) min_index = i;
    }

    return min_index;
}

//return index of max value in array
int max(int arr[], size_t n) {
    
    if(n <= 0) return -1;
    
    int max_index = 0;

    for(int i = 1; i < n; i++) {
        if(arr[i] > arr[max_index]) max_index = i;
    }

    return max_index;
}

int max(int x, int y) {
    if(x > y) return x;
    else return y;
}

int max_sum(int arr[], size_t n) {
    int max_index = max(arr, n);

    printf("left_subarray:\n");
    int size_left_subarr = max_index;
    int left_subarray[size_left_subarr];

    for(int i = 0; i < max_index; i++) {
        left_subarray[i] = arr[i];
        // printf("%d\n", left_subarray[i]);
    }

    printf("right_subarray:\n");
    int size_right_subarr = n - max_index - 1;
    int right_subarray[size_right_subarr];

    for(int i = max_index + 1, k = 0; i < n; i++, k++) {
        right_subarray[k] = arr[i];
        // printf("%d\n", right_subarray[k]);
    }

    int min_index_left_subarr = min(left_subarray, size_left_subarr);
    // printf("min L: %d\n", left_subarray[min_index_left_subarr]);

    int min_index_right_subarr = min(right_subarray, size_right_subarr);
    // printf("min R: %d\n", right_subarray[min_index_right_subarr]);

    int left_sum = arr[max_index], right_sum = arr[max_index];
    
    for(int i = min_index_left_subarr; i < size_left_subarr; i++) {
        left_sum += left_subarray[i];
        // printf("[left_subarray[i]] %d\n",left_subarray[i]);
    }
    // printf("left_sum: %d\n", left_sum);

    for(int i = 0; i < min_index_right_subarr; i++) {
        right_sum += right_subarray[i];
        // printf("[right_subarray[i]] %d\n",right_subarray[i]);
    }

    // printf("right_sum: %d\n", right_sum);


    return max(left_sum, right_sum);
}

int main() {
    int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //output(6)
    int size = sizeof(arr)/sizeof(arr[0]);

    printf("%d\n", max_sum(arr, size));
    return 0;
}