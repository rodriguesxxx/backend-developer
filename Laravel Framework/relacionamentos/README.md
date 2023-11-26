## Entendendo Relacionamentos
Os relacionamentos é um padrão utilizado em banco de dados relacionais, onde busca abstrair os dados.

**Exemplo de relacionamento:**

No nosso banco de dados temos as seguintes tabelas: usuario e eventos
E queremos relacionar essas tabelas, poís os eventos tem usuarios e usuarios participa de eventos.
Mas não podemos fazer isso de forma direta, poís um usuario pode participar de centenas de eventos, imagina essa tanto de evento na tabela usuario(vice-versa). Para isso criaremos uma tabela intermediaria, chamada: usuarios_eventos. Onde contera o id do usuario e o id do evento que ele esta inscrito. Mas para fazer a relacao entre essas tabelas usaremos os Relacionamentos do laravel.

## Tipos de relacionamentos

- ### Has One
    Relacionamento: **Tem Um** 

    Quando se quer indicar que uma entidade tem apenas um(unico) valor de outra entidade, se usa o Has One(é meio dificil de descrever).

    Isso significa que o Has One é uma relação  1:1 - um para um.

- ### Belongs To
    Relacionamento: **Pertence a**

    Esse relacionamento é o inverso do Has One.
    O relacionamento "Belongs To" indica uma relação
    N:1 - muitos(N) para um.

- ### Has Many
    Relacionamento: **Tem Muitos**

    O relacionamento "Has Many" indica uma relação 1:N - um para muitos(N)

- ### Many to Many
    Relacionamento: **Muitos para Muitos** //esse é cabuloso kk

    É necessario criar uma tabela intermediaria Para relacionamentos Many to Many, esse relacionamento se encaixa no exemplo dado mais acima.

    O relacionamento "Many to Many" indica uma relação N:N - muitos para muitos(N)

## Relacionamentos na pratica

- ### Has One

    Dentro do model Usuario, adicione a seguite funcao:
    ```php
    public function enderecos(){
        return $this->hasOne(Endereco::class, 'id', 'endereco_id');
    }
    ```
    Isso indica um relacionamento da tabela usuarios com a tabela enderecos representada pelo model Endereco.

    Onde é comparado o id(do endereco) com o endereco_id(salvo na tabela usuarios)

...