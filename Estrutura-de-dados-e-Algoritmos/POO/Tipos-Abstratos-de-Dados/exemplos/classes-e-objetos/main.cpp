#include <iostream>
#include <string>
#include "Lista.h"
using namespace std;

int main() {
    Lista<int, 3> inteiros;
    Lista<string, 2> strings;

    inteiros.add(1);
    inteiros.add(2);
    inteiros.add(3);

    strings.add("Calabrezo");
    strings.add("Joca");

    inteiros.listar();
    strings.listar();
}