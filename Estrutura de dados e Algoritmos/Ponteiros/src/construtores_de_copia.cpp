#include <iostream>
#include <cstring>
using namespace std;


struct Pessoa {
    
    char *nome;
    int idade;
    
    Pessoa(const char *nome = "", int idade = 0) {
        this->nome = new char[strlen(nome) + 1];
        strcpy(this->nome, nome);
        this->idade = idade;
    }

    Pessoa(const Pessoa& p) {
        this->nome = new char[strlen(p.nome) + 1];
        strcpy(this->nome, p.nome);
        this->idade = p.idade;
    }

}; 

int main() {
    Pessoa p1("Daniel", 18), p2(p1);

    cout << p1.nome << endl << p2.nome << endl;
    cout << p1.idade << endl << p2.idade << endl;

    strcpy(p2.nome, "Paulo");
    p2.idade = 12;
    
    cout << p1.nome << endl << p2.nome << endl;
    cout << p1.idade << endl << p2.idade << endl;
    
    return 0;
}