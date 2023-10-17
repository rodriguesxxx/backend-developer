# REST - Representational State Transfer

## O que é?

A Transferêrencia Representacional de Estado é um modelo de arquitetura que fornece diretrizes para sistemas distribuidos se comuniquem diretamente, sem a necessidade de SOAP.

## STATELESSNESS - Sem estado

No modelo REST o servidor não precisa saber em qual estado o cliente está e vice-versa. A ideia fundamental do REST é que o servidor e o cliente se comunicam apenas por meio de solicitações e respostas, e não mantêm um estado compartilhado. Isso significa que cada solicitação do cliente para o servidor deve conter todas as informações necessárias para que o servidor compreenda e processe a solicitação.
A comunicação entre cliente e servidor ocorre através da troca de mensagens usando um padrão de solicitação-resposta. O cliente basicamente envia uma solicitação de serviço e o servidor retorna uma resposta.

## Requisições e comunicações

O REST precisa que um cliente faça uma requisição para o servidor para enviar ou modificar dados.
#### Uma requisição consiste em:

- **Um verbo ou método HTTP** (GET, POST, PUT, DEL)

- **Um header** Passa informações sobre a requisição

- **Um path** (caminho ou rota)

- **body** (JSON, TEXT, etc) No caso de requisições POST

## Codigos de Respostas

Cada resposta que a aplicação REST retorna, é enviado um código definindo o status da requisição. Por exemplo:

- 200 (OK), requisição atendida com sucesso;
- 201 (CREATED), objeto ou recurso criado com sucesso;
- 204 (NO CONTENT), objeto ou recurso deletado com sucesso;
- 400 (BAD REQUEST), ocorreu algum erro na requisição (podem existir inumeras causas);
- 404 (NOT FOUND), rota ou coleção não encontrada;
- 500 (INTERNAL SERVER ERROR), ocorreu algum erro no servidor.