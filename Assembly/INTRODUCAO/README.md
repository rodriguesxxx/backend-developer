Vejo muitas pessoas que já estão na área de tecnologia há algum tempo e não sabem como funcionam os binários, ou até mesmo o que são.

Então, pensei em escrever este artigo de uma maneira que uma criança de 6 anos consiga entender o que são códigos binários e um pouco sobre Assembly.

## PRIMÓRDIOS

Era uma vez um garoto muito inteligente, cujo nome era Leibniz, mas ele era conhecido como Lelê. Esse garoto adorava entender como as coisas funcionavam, e ele viu na matemática uma forma de descobrir coisas novas todos os dias. Então, ele descobriu que sociedades antigas usavam códigos secretos para se comunicarem. Mas aquilo era muito complexo para que eu e você entendêssemos. Então, como um bom amigo, ele simplificou isso para apenas dois dígitos: 0 e 1, que significam Desligado e Ligado, respectivamente. Sabe o interruptor de luz do seu quarto? Para controlar a luz, você precisa apenas de dois movimentos, certo? É justamente aí que o conceito de binário entra. Ou seja, 0 - Desliga a luz, 1 - Liga a luz.

## MATEMÁTICA DA COISA

Hoje, para nos comunicarmos, utilizamos palavras na maior parte das vezes. Mas você sabia que é possível se comunicar em binário?

Sabendo disso, vamos fazer uma "continha". Sabemos que 10 + 10 é igual a 20, mas você sabe como é em binário?

**Para isso, basta dividir o número por 2 até que o resultado seja 0.**

-   20 dividido por 2, é igual a 10(O mesmo que a metade de 20).
    -   **Resto -> 0**
-   10 dividido por 2, é igual a 5(O mesmo que a metade de 10).
    -   **Resto -> 0**
-   5 dividido por 2, é igual a 2(O resultado deve ser exato).
    -   **Resto -> 1**
-   2 dividido por 2, é igual a 1(O mesmo que a metade de 2).
    -   **Resto -> 0**
-   1 dividido por 2, é igual a 0(Não a resultado exato).
    -   **Resto -> 1**

Olhando os restos debaixo para cima, temos como resultado: **10100**

## ASSEMBLY

Computador é uma máquina que faz muitas coisas, como jogar, desenhar, escrever e calcular. Mas como ele faz isso? Ele usa uma linguagem especial chamada código de máquina, que são números e letras que ele entende. Mas esses números e letras são muito difíceis para as pessoas entenderem. Por isso, as pessoas usam outra linguagem chamada Assembly, que usa palavras e símbolos mais fáceis de lembrar. Essas palavras e símbolos são chamados de mnemônicos.

Por exemplo, o computador sabe o que significa (B0 61), mas as pessoas podem se confundir. Então, as pessoas usam a palavra MOV AL, 61h, que quer dizer: coloque o número 61 dentro de uma caixinha chamada AL. O h no final é para dizer que esse número é diferente dos números que você aprendeu na escola. Ele é chamado de hexadecimal, e tem mais letras do que números.

Mas como o computador entende a linguagem Assembly? Ele usa um programa chamado montador, que transforma as palavras e símbolos em números e letras que ele entende. O montador também faz outras coisas, como encontrar o lugar certo onde guardar e pegar os números e letras. Assim, o computador pode fazer as coisas que as pessoas querem.

## ASSEMBLY PARA ADULTOS

Admito, o assembly chega a um nível de complexidade que é difícil de explicar para crianças. Então, essa seção do artigo terá conceitos mais técnicos, inclusive vamos fazer um hello world em assembly.

## "HELLO WORLD" EM ASSEMBLY

```
segment .data

    ; CONSTANTES USADAS NO EBX
    RETURN_EXIT equ 0x0
    STD_OUTPUT equ 0x1

    ; CONSTANTES USADAS NO EAX
    SYS_EXIT equ 0x1
    SYS_WRITE equ 0x4

    ; DECLARA MENSAGEM
    message: db 'Hello world!!!'
    size: equ $- message

section .text

global _start

    _start:

        mov EAX, SYS_WRITE
        mov EBX, STD_OUTPUT
        mov ECX, message
        mov EDX, size
        int 0x80

        mov EAX, SYS_EXIT
        mov EBX, RETURN_EXIT
        int 0x80
```

_*Não se assuste jovem.*_

### Explicação

O seu codigo fonte em Assembly pode ter qualquer extensao, por exemplo: .asm, .nasm, .xxx; Qualquer coisa.

Um programa em Assembly é definido em 3 seções, sendo elas:

-   ### data

    Onde vai as constantes

-   ### text
    Onde vai nosso codigo

**Entendendo os conceitos**

---

**GPR**

**_Registradores de uso geral_** servem para armazenar temporariamente qualquer tipo de dado, para qualquer função.

-   **equ -** Comando usado para declarar uma constante
-   **db -** _Define Byte_: alocação de 8 bits.
-   **EBX -** _Base_: ponteiro para dados.
-   **EAX -** _Accumulator_: Usado em operações aritméticas.
-   **MOV -** Comando usado para mover valores para os registradores.
-   **int -** _interrupt_: 0x80 é o numero para interrupções no linux.

---

## MAS POR QUE APRENDER ASSEMBLY? SE TENHO MEU JAVASCRIPT!

Sei que talvez você nunca precise escrever uma linha de código em assembly em sua vida JavaScripto. Mas como **_Sun Tzu_** disse:

"**_Conhecer o campo de batalha é antecipar o movimento do inimigo. Conhecer o inimigo é antecipar a vitória_**"

O seu código **JavaScript** é traduzido para **C/C++**, que por sua vez é convertido em **Assembly** e, por fim, compilado para **código de máquina**.

---

Agradeço sua atenção e peço desculpas caso tenha cometido algum erro. Sou apenas um júnior. 😊
