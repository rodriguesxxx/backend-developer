# HATEOAS - Hypermedia As the Engine Of Application State

HATEOAS(ou Hypermedia) é uma restrição da arquitetura REST, cujo objetivo é ajudar a clientes(quem está consumindo a API) a consumirem determinada API sem conhecimento prévio.
Ao ser implementado, a API passa a fornecer endpoints que indicarão aos clientes como navegar através dos seus recursos;

### Exemplo de API que não implementa o padrão HATEOAS

**endpoint**: ***https://api.devcursos.com.br/cursos***

```json
{
    "cursos": [
        {
            "id": 1,
            "nome": "C# (C Sharp)",
            "aulas": [
                {
                    "id": 1,
                    "titulo": "Título da aula 3"
                },
                {
                    "id": 2,
                    "titulo": "Título da aula 3"
                },
                {
                    "id": 3,
                    "titulo": "Título da aula 3"
                }
            ]
        },
        {
            "id": 2,
            "nome": "PHP",
            "aulas": [
                {
                    "id": 1,
                    "titulo": "Título da aula 3"
                },
                {
                    "id": 2,
                    "titulo": "Título da aula 3"
                },
                {
                    "id": 3,
                    "titulo": "Título da aula 3"
                }
            ]
        },
        {
            "id": 3,
            "nome": "Java",
            "aulas": [
                {
                    "id": 1,
                    "titulo": "Título da aula 3"
                },
                {
                    "id": 2,
                    "titulo": "Título da aula 3"
                },
                {
                    "id": 3,
                    "titulo": "Título da aula 3"
                }
            ]
        }
    ]
}
```

Veja que está sendo retornado cada aula, caso seja necessario redirecionar o usuario para aulas de um curso em especifico não seria possivel, poís o cliente não sabe o endpoint.

### Exemplo de API que mplementa o padrão HATEOAS

**endpoint**: ***https://api.devcursos.com.br/cursos***

```json
{
    "cursos": [
        {
            "id": 1,
            "nome": "C# (C Sharp)",
            "aulas": "api.devcursos.com.br/cursos/1/aulas"
        },
        {
            "id": 2,
            "nome": "PHP",
            "aulas": "api.devcursos.com.br/cursos/2/aulas"
        },
        {
            "id": 3,
            "nome": "Java",
            "aulas": "api.devcursos.com.br/cursos/3/aulas"
        }
    ]
}
```

Nesse caso é deixado claro em qual endpoint está as aulas daquele curso em espefico. Isso vai além, o cliente pode deduzir o seguinte **endpoint**: ***https://api.devcursos.com.br/cursos/3/aulas/1***
Que retornara a terceira aula.

```json
"aula":
    {
        "id": 1,
        "titulo": "Título da aula 3"
    }

```

**obs: Os exemplos acima o HATEOAS foi implementado como uma url no retorno da requisição. Mas na prática é recomendado que seja seguido o seguinte padrão**

### <a href="https://datatracker.ietf.org/doc/html/rfc5988"> RFC 5988 </a>

-   **URI:** Cada link deve conter uma URI, representada no atributo href.234
-   **Tipo de Relação:** Descreve como a URI se relaciona como recurso atual. representado pelo atributo rel.
-   **Atributos para URI:** Para que a URI seja descrita de uma forma melhor, podem ser adicionados os atributos `hreflang`, `media`, `title`, `type`.

### API que implementa o HATEOAS e segue BOAS práticas

```json
{
    "cursos": [
        {
            "id": 1,
            "nome": "C# (C Sharp)",
            "links": [
                {
                    "type": "GET",
                    "rel": "self",
                    "uri": "api.devcursos.com.br/cursos/1"
                },
                {
                    "type": "GET",
                    "rel": "curso_aulas",
                    "uri": "api.devcursos.com.br/cursos/1/aulas"
                },
                {
                    "type": "PUT",
                    "rel": "curso_atualizacao",
                    "uri": "api.devcursos.com.br/cursos/1"
                },
                {
                    "type": "DELETE",
                    "rel": "curso_exclusao",
                    "uri": "api.devcursos.com.br/cursos/1"
                }
            ]
        },
        {
            "id": 2,
            "nome": "PHP",
            "links": [
                {
                    "type": "GET",
                    "rel": "self",
                    "uri": "api.devcursos.com.br/cursos/2"
                },
                {
                    "type": "GET",
                    "rel": "curso_aulas",
                    "uri": "api.devcursos.com.br/cursos/2/aulas"
                },
                {
                    "type": "PUT",
                    "rel": "curso_atualizacao",
                    "uri": "api.devcursos.com.br/cursos/2"
                },
                {
                    "type": "DELETE",
                    "rel": "curso_exclusao",
                    "uri": "api.devcursos.com.br/cursos/2"
                }
            ]
        },
        {
            "id": 3,
            "nome": "Java",
            "links": [
                {
                    "type": "GET",
                    "rel": "self",
                    "uri": "api.devcursos.com.br/cursos/3"
                },
                {
                    "type": "GET",
                    "rel": "curso_aulas",
                    "uri": "api.devcursos.com.br/cursos/3/aulas"
                },
                {
                    "type": "PUT",
                    "rel": "curso_atualizacao",
                    "uri": "api.devcursos.com.br/cursos/3"
                },
                {
                    "type": "DELETE",
                    "rel": "curso_exclusao",
                    "uri": "api.devcursos.com.br/cursos/3"
                }
            ]
        }
    ]
}
```

O HATEOAS é o ultimo nível de uma API RESTfull. De fato que o componente HATEOAS facilita e muito a manutenção de uma API e a sua integração com outras aplicações.