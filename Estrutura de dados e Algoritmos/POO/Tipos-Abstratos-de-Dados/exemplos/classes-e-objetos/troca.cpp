#include <iostream>
#include<stdio.h>
#include <array>
using namespace std;

template<typename type>
array<type, 2> troca (type v1, type v2) {
    type tmp = v1;
    v1 = v2;
    v2 = tmp;

    array<type, 2> values = {v1, v2}; 
    return values;
}

int main() {
    array<int, 2> t = troca(1, 2);
    
    for(size_t i = 0; i < t.size(); i++) {
        cout << t[i] << endl;
    }
    
    return 0;
}

