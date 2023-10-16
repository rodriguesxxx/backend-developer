## Instalação do docker

    sudo apt install docker.io docker-compose


## Configurando container MySql

crie um arquivo chamado <docker-compose.yml>

salve os seguintes codigos:

```yml
# Use root/example as user/password credentials

version: '3.1'

services:

  mysqlDB:
    image: mysql
    container_name: mysqlDB
    hostname: mysqlDB
    restart: always

    command: 
      - --default-authentication-plugin=caching_sha2_password
      - --character-set-server=utf8mb4
      - --collation-server=utf8mb4_unicode_ci
      - --innodb_force_recovery=0

    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: backend_study
      MYSQL_USER: blkd
      MYSQL_PASSWORD: blkd
      
    ports:
      - 3306:3306
    
    

```

para mais containers acesse: https://hub.docker.com/

## Subindo a imagem
    sudo docker-compose up

esteja dentro da pasta do docker-compose.yml

Para deixar a imagem rodando em segundo plano, passe a seguinte tag:

    sudo docker-compose up -d


## Verificando imagens ativas

    sudo docker ps


## Iniciando imagem
    sudo docker start <nome_da _imagem>
    
  só ir funcionar se a imagem foi subida.

## Parando imagem

    sudo docker stop <nome_da _imagem>
