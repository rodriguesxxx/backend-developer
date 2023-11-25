# O que é SOLID?

SOLID é um acrônimo dos principios da POO.
É um auxilio ao programador a escrever codigos mais limpos, o que facilita a refatoração e estimula o reaproveito do código.

### S
** Single Resonsibility Principle **

Uma classe deve ter um, e somente um, motivo para mudar.

A classe deve possuir uma única responsabilidade dentro do software.

### O
Open Closed Principle

Você deve poder estender um comportamento de classe, sem modificá-lo

Objetos devem estar abertos para extensão, mas fechados para modificação.

Quando novos comportamentos precisam ser adicionados no software, devemos estender e não alterar o código fonte original

### L
Liskov Substitution Principle

Classes derivadas dever ser substituives por suas classes bases.

Se para cada objeto o1 do tipo S há um objeto o2 do tipo T de forma que, para todos os programas P, o comportamento de P é inalterado quando o1 é substituido por o2, então S é um subtipo de T


### I
Interface Segregation Principle

Crie Interfaces refinadas que são especificas do cliente.

Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados

É melhor criar interfaces mais especificas ao inves de termos uma unica interface generica.


### D
Dependency Inversion Principle

Dependa de abstrações e não de implementações.

Um modulo de alto nivel não deve depender de modulos de baixo nivel, ambos devem depender da abstracao

PS: Inversao de dependencia nao é o mesmo que Injecao de dependencia