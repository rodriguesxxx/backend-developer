#include "SerVivo.h"

#ifndef ANIMAL_H
#define ANIMAL_H
class Animal : virtual public SerVivo {
    public:
        void respirar();
};
#endif