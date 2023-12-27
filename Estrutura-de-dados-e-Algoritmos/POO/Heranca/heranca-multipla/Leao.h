#include "Animal.h"

#ifndef LEAO_H
#define LEAO_H
class Leao : public virtual SerVivo, public virtual Animal {
    public:
        void respirar();
        void rugir();
};
#endif