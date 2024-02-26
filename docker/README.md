# O que é docker?

O docker cria um container onde voce pode alocar o seu ambiente de desenvolvimento.
Totalmente isolado, isso quer dizer caso a imagem seja apaga, não ficara nada salvo.

# 3 conceitos fundamentais

### - Dockerfile

É a planta do nosso sistema, onde fica as configuraçãos...

### - Imagem

É o que será executado.

### - Container

Onde a imagem é executada.

# Instalando o docker

# Principais comandos

-   docker pull <image>
-   docker run <nome_da_imagem> //executada uma imagem já criada, ou baixa do docker hub
-   docker ps //containers que está em exec
-   docker stop <id_container>
-   docker exec <image> <cmd>
-   docker build -t first-image ./
-   docker run -p 5173:5173 first-image
-   docker volume create <nome>
-   docker run -d \
    --mount source=<nome_volume>,target=/usr/shares/volumes \ <nome_imagem>

### Criando imagem do Ubuntu

```bash
docker pull ubuntu
docker run -dti --name ubuntu-test ubuntu
docker exec -ti ubuntu-test bash
```
