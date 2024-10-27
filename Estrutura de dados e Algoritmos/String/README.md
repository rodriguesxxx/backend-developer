## Strings

<img src="https://cselectricalandelectronics.com/wp-content/uploads/2020/08/strings-in-data-structure-and-algorithms.jpg">

`Strings` são usadas na programação para representar dados de `textos`.

**Mas o que é uma String**: É uma sequência de `caracteres`, como `letras`, `números` e `simbolos`.

### Tipos de dados de String

As Strings possuem seu próprio conjunto de `operações` e `propriedades`.
Em algumas linguagens, as strings são implementadas como `cadeia de caracteres` tornando-as um tipo de dados derivado.

### Operações de Strings

Operações fundamentais executadas em Strings:

-   **Concatenação** - Combinar `duas` ou `mais` strings, resultando em `outra`.
-   **Comprimento** - Determinar o `número` de `caracteres` da string.
-   **Acesso** - Acessar determinados caracteres por `índice`
-   **Substring** - Extrair parte de uma string.
-   **Modificação** - Alterar ou substituir caracteres dessa string
-   **Pesquisa** - Encontrar a posição de um substring dentro dessa string.

### Strings na memória

Em linguagens como o `C` um string pode ser `referenciada` usando um `ponteiro` de `caracter` ou uma matriz de `caracteres`.

Quando são declaradas como matrizes de caracteres, elas são definidas da mesma forma que uma matriz de inteiros.

Se definirmos uma `matriz` de caracteres `automatica` então a `string` será armazenada no segmento `pilha`, caso seja global ou estática, então será armazenada no segmento de `dados`.

### Implementando a String na Mão

Assim como muitos aqui, eu me considero um `penteador de bits`. Então vamos codar uma classe em C++ que simula a string.

**string.hpp**

```cpp
#include <iostream>
#include <cstring>

#ifndef STRING_H
#define STRING_H

class String {

    private:
        char *str;

        void setStr(const char *s) {
            str = new char[strlen(s) + 1];
            strcpy(str, s);
        }

        char* getStr() {
            return str;
        }

    public:

        String(const char *s = "") {
            this->setStr(s);
        }

        friend std::ostream& operator<<(std::ostream &out, const String &s) {
            out << s.str;
            return out;
        }

        friend std::istream& operator>>(std::istream &in, String &s) {
            char buffer[256];
            in >> buffer;
            s.setStr(buffer);
            return in;
        }

        ~String() {
            delete[] str;
        }
};

#endif
```

-   `const char *s`

    Recebe um ponteiro constante para um sequência de caracteres.

-   `void setStr(const char *s)`

    Esse método aloca um no novo tamanho de memória para `str` de acordo com o tamanho de `s`.

-   `friend std::ostream& operator<<(std::ostream &out, const String &s)`

    Declara uma função amiga de sobrecarga do operador ` <<``, essa função recebe como parâmetros: uma  `referência`para o objeto de saída`std::ostream`e outra`refêrencia`a própria`string`. Basicamente é adicionando o valor da string ao objeto `out`.

-   `friend std::istream& operator>>(std::istream &in, String &s)`

    É uma sobrecarga ao operador `>>`, essa função recebe como parâmetros: uma `referência` para o objeto de entrada `std::istream` e outra `refêrencia` a própria `string`. Então é criado um vetor de tamanho `256` nomeado de `buffer`, na linha seguinte é lido a entrada do usuário e armazenamos no buffer. Após isso `setamos` de novo a `string` e por fim é retornado a `entrada``.

**main.cpp**

```cpp
#include "string.hpp"
#include <iostream>
using namespace std;

int main() {
    String str;
    cout << "Informe um valor: ";
    cin >> str;
    cout << "Valor lido: " << str << endl;
    return  0;
}
```

Dessa forma podemos utilizar a `String` semelhantemente a outras `estruturas`.

**_Calma `JavaScripto` sei que essa solução não é a mais otimizada e que a maioria das linguagens tem nativamente a `string`._**
