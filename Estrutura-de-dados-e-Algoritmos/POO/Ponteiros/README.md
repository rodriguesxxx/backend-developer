# Ponteiros

As variaveis de um programa são como caixas, e nunca estão vazias. E são prenchidas pelo programado(quando inicializadas) ou pelo sistema(quando não inicializadas).
Tal variavel tem dois atributos: **localização na memoria / valor**.
No entando esse **valor** pode ser a localização de outra variavel, essas variaveis são chamadas de ponteiros.

### Declaração de ponteiros

```cpp
int i = 10; //variavel normal
int *p; //variavel que aceita a localizacao de outra variavel(ponteiro)
```

### Atribuição de ponteiros

```cpp
p = &i; //a localizacao de i vai para p
```

O '&' comercial significa que estamos amarzenando o endereço de 'i', não seu conteudo.

### Alterando valor a partir do ponteiro

```cpp
*p = 10; //o valor de i agora é 10.
```

O (\*) indica que você quer alterar o valor de 'i', não o valor do ponteiro(que é a referencia para i);

<a href='./exemplos/declaracao-atribuicao/main.cpp'>exemplo</a>

## Alocando/Desalocando memória de forma dinâmica

Para se alocar memória de forma dinâmica usamos a função **new**, é tomado da memória apenas o necessario para alocar tal elemento.

```cpp
int *p;
p = new int; //aloca a memória suficiente para um inteiro
*p = 10;
delete p; //desaloca o p da memória
```
O programa solicita ao gerenciador de memória espaço suficiente para estocar um valor inteiro e o endereço dessa porção de memória fica estocado em p.

Isso acaba se tornando um pointeiro que aponta para uma referencia anonima. 
