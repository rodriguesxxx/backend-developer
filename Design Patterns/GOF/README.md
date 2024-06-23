## GOF - Gangs Of Four

O Gang Of Four Design Patterns foi criado por 4 autores, sendo eles Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides. Esse padrão de design foi apresentado, pela primeira vez, no livro “Design Patterns: Elements of Reusable Object-Oriented Software”, no ano de 1994. Por meio dele, é possível ter uma base de padrões do campo de design para objetos.

-   ## Singleton

    Utilizado quando se deseja ter apenas uma instacia da uma classe:

    -   classe é final, ou seja: não pode ser herdada

    -   O construtor da classe fica privado, assim não se pode instacia aquela classe

    -   O acesso a instacia e feita atraves de um metodo, que criara ou retornara aquela instacia unica;

        <a href="./EXEMPLES/Singleton/Impressora.java">exemplo</a>

-   ## Builder

    Fornece uma interface genérica para a construção incremental de agregações. Esse padrão esconde os detalhes de como os componentes são criados, representados e compostos.

    <img src="https://sourcemaking.com/files/v2/content/patterns/Builder_example1.png">

    <a href="./EXEMPLES/Builder/">exemplo</a>

-   ## Abstract Factory

    Permite elaborar uma interface para criação de famílias de objetos relacionados ou abstratos. A partir desse padrão, consegue-se criar fábricas concretas, que são responsáveis éça criação de novos objetos, eliminando a dependência entre cliente e classe dos objetos usados por ele.

    <img src="https://refactoring.guru/images/patterns/content/abstract-factory/abstract-factory-en-3x.png">

    <a href="./EXEMPLES/AbstractFactory/">exemplo</a>
