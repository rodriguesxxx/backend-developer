#include<iostream>
#include "ClasseBase.h"
using namespace std;

void ClasseBase::print() {
    cout << this->className << endl;
}

void ClasseBase::setClassName(string name) {
    this->className = name;
}
 
