## Introdução ao Assembly

O seu codigo fonte em Assembly pode ter qualquer extensao, por exemplo: .asm, .xxx, .fds. Qualquer coisa.

Um programa em Assembly é definido em 3 seções, sendo elas:

-   ### data

    Onde vai as constantes

-   ### bss

    Onde vai as variaveis

-   ### text
    Onde vai nosso codigo

**Para compilar**

    nasm -f elf64 hello.asm

**para criar o executavel**

    ld -s -o hello hello.o
