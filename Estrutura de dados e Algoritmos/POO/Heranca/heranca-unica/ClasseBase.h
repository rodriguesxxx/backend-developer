#include<iostream>
#include <string.h>

#ifndef  CLASSEBASE_H
#define CLASSEBASE_H
class ClasseBase {
    public:
        void print();
        void setClassName(std::string name);

    private:
        std::string className;
};

#endif
