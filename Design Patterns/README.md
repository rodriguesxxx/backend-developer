# Padrões de Projetos

Tem como objetivo tornar componentes reutilizaveis que facilitam a padronização, deixando o projeto mais organizado.

referencia: https://refactoring.guru/pt-br/design-patterns/java

### temos os seguintes tipos de padrões
----
- #### Padrões Relacionais
- #### Padrões Estruturais
- #### Padrões Comportamentais

## GOF - Gangs Of Four

O Gang Of Four Design Patterns foi criado por 4 autores, sendo eles Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides. Esse padrão de design foi apresentado, pela primeira vez, no livro “Design Patterns: Elements of Reusable Object-Oriented Software”, no ano de 1994. Por meio dele, é possível ter uma base de padrões do campo de design para objetos.

- ## Singleton

    Utilizado quando se deseja ter apenas uma instacia da uma classe:


    - classe é final, ou seja: não pode ser herdada

    - O construtor da classe fica privado, assim não se pode instacia aquela classe

    - O acesso a instacia e feita atraves de um metodo, que criara ou retornara aquela instacia unica;

        <a href="GOF - EXEMPLES/Singleton/Impressora.java">exemplo</a>
- ## Builder
    Esconde os detalhes de como os componentes são criados

    <a href="GOF - EXEMPLES/builder/">exemplo</a>

