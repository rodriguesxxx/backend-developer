#include "ClasseBase.h"
#include "ClasseDerivada.h"

int main () {
    ClasseDerivada* c = new ClasseDerivada();
    c->setClassName("teste");
    c->print();
    return 0;
}