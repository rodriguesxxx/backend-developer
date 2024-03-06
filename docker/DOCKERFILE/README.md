## Criando Dockerfile

Crie um arquivo chamado **Dockerfile** na pasta **root** da sua aplicação

### Comandos básicos

-   **FROM**: Especifica a base do container
-   **RUN**: O que vai ser executado dentro do container
-   **COPY**: O que vai ser copiado para dentro do container
-   **CMD**: Executa comandos do bash

### Criando dockerfile ubuntu

```dockerfile
FROM ubuntu

RUN apt update && apt install -y python3

COPY app.py /opt/app.py

CMD python3 app.py
```

Para buildar a imagem usaremos o comando **build**

```bash
docker build . -t nome-da-imagem
```
