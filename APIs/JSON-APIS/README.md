# JSON:API

## O que é?

O Json API é uma especificacao de como um cliente deve solicitar que os recursos sejam buscados ou modificados e como o servidor deve responder a isso.

## Tipos de mídia JSON:API

O tipo de midia JSON:API é application/vnd.api+json.
Ele é um formato de mídia utilizado para trocar dados em conformidade com a especificação JSON:API.

### Quais são os parametros de tipo de midia?

O JSON:API suporta dois parametros de tipo de midia: **ext** e **profile**.
São usados para especificar **extensões** e **perfis**

#### profile
Pode ser usado para especificar uma URL que aponta para um docuemento de perfil JSON:API

#### ext
É usado para indicar que extensoes especificas que podem ser usadas com API.

# Estrutura do documento
```json
 
    {   
        "type":"robot",
        "id":"robot@293902",
        "name":"CalabrezoBot",
        "relationships": {
            "creator": { 
                "data" : {
                    "type":"people", 
                    "id":"creator@322342",
                    "name":"Daniel Rodrigues"
                }
            }
        }
    }

```

