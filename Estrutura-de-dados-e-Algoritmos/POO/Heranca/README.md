## Herança

As LOOs permitem criar uma hierarquia de classes de mode que os objetos não tenham que ser instâncias de uma classe simples.
Ou seja, novas classes podem ser derivadas de classes existentes por meio da herança.
As classes que são usadas para a derivação são chamadas de **classes bases**.

## Herança unica

Na **herança única** as classes tem apenas uma classe base.

**exemplo:**

```cpp
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
```

**file: ClasseBase.h**

```cpp
#include<iostream>
#include "ClasseBase.h"
using namespace std;

void ClasseBase::print() {
    cout << this->className << endl;
}

void ClasseBase::setClassName(string name) {
    this->className = name;
}
```

**file: ClasseBase.cpp**

```cpp
#ifndef CLASSEDERIVADA_H
#define CLASSEDERIVADA_H

#include "ClasseBase.h"
class ClasseDerivada : public ClasseBase {};

#endif
```

**file: ClasseDerivada.h**

## Multipla Herança

Diferentemente do Java, o C++ permite heranças multiplas. Ou seja, uma classe derivada poderá ter mais de uma.

**exemplo:**

```cpp
#ifndef SERVIVO_H
#define SERVIVO_H
class SerVivo {
    public:
         void respirar();
};
#endif
```

file: SerVivo.h

```cpp
#include "SerVivo.h"

#ifndef ANIMAL_H
#define ANIMAL_H
class Animal : virtual public SerVivo {
    public:
        void respirar();
};
#endif
```

file: Animal.h

```cpp
#include "Animal.h"

#ifndef LEAO_H
#define LEAO_H
class Leao : public virtual SerVivo, public virtual Animal {
    public:
        void respirar();
        void rugir();
};
#endif
```

file: Leao.h
