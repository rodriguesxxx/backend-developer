#include <iostream>
#include<string>
#include<vector>
#include <sstream>
#include <algorithm>

using namespace std;

/*
entrada: abacaxi
saida: ixacaba
*/

int count_words(const string& str) {
    istringstream stream(str);
    string word;
    
    int count = 0;

    while(stream >> word) {
        count++;
    }

    return count;
}

string reverseWithoutFunc(const string &str) {
    
    if(str.empty()) {
        cout << "Informe uma string válida!" << endl;
        exit(1);
    }

    string reversed;
    for(int i = str.length(); i >= 0; --i) {
       reversed.push_back(str[i]); 
    }
    return reversed;

}

int main() {
    string str;

    while(true) {
        cout << "digite algo: ";
        getline(cin, str);

        string r;
        if(count_words(str) > 5) {
            reverse(str.begin(), str.end());
            r = str;
        } else {
            r = reverseWithoutFunc(str);
        }

        cout << r << endl;
    }
    
    return 0;
}