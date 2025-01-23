#include<iostream>
#include<vector>
#include<algorithm>

int second_largest(std::vector<int> arr) {
    int n = arr.size(); //0(1)
    std::sort(arr.begin(), arr.end()); //0( n * log(n) )
    return arr[n - 2];
}

int main() {
    std::vector<int> arr = {5, 4, 3, 2, 1};
    std::cout << second_largest(arr);
    return 0;
}