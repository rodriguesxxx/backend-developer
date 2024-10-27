#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

vector<int> reverseArray(vector<int> arr) {
    vector<int> reversed = arr;
    reverse(reversed.begin(), reversed.end());
    return reversed;
}

int main() {
    vector<int> arr{1, 2, 3};
    vector<int> reversed = reverseArray(arr);
    for_each(reversed.begin(), reversed.end(), [](int value) {
        cout << value << "\n";
    });
    return 0;
}