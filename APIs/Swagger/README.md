# Documentando APIs com o Swagger

## O que é o Swagger?
O swagger é uma aplicação open source que auxilia desenvolvedores no processos de criar, documentar e consumir APIs REST.

## Utilizando o Swagger em sua aplicação laravel
```bash
composer require zircote/swagger-php
```
Esse comando adiciona o swagger a sua aplicação.

## Configurando ambiente
O Swagger requer algumas informações sobre a nossa aplicação.


```bash
mkdir development && cd development
touch swagger.sh && chmod +x swagger.sh
touch swagger-variables.php
touch swagger-v1.php
```
Dentro do arquivo swagger.sh, vamos adicionar um script para a geração automatica do nosso arquivo de documentação

```shell
#!/bin/bash

mkdir ../public/swagger

php ../vendor/bin/openapi --bootstrap ./swagger-constants.php --output ../public/swagger ./swagger-v1.php ../app/Http/Controllers
```
file: swagger.sh

Adicione o seguinte codigo de configuracao dentro do swagger-variables.php
```php
<?php

define("API_HOST", 'localhost');
```

Executando script:

```bash
cd development | ./swagger.sh
```

## Interface do usuario
Para adicionar uma interface, acesse https://github.com/swagger-api/swagger-ui e baixe a pasta inteira. Copia o conteudo da pasta dist e cola dentro da pasta do swagger.

## Configurando Swagger
Nosso index.html precisa ser atualizado para o servidor localhost, você pode copiar e colar diretamente daqui:

```html
<!-- HTML for static distribution bundle build -->
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Swagger UI</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700|Source+Code+Pro:300,600|Titillium+Web:400,600,700" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/swagger/swagger-ui.css" >
    <link rel="icon" type="image/png" href="/swagger/favicon-32x32.png" sizes="32x32" />
    <link rel="icon" type="image/png" href="/swagger/favicon-16x16.png" sizes="16x16" />
    <style>
      html
      {
        box-sizing: border-box;
        overflow: -moz-scrollbars-vertical;
        overflow-y: scroll;
      }

      *,
      *:before,
      *:after
      {
        box-sizing: inherit;
      }
      
      body
      {
        margin:0;
        background: #fafafa;
      }
    </style>
  </head>

  <body>
    <div id="swagger-ui"></div>
    <script src="/swagger/swagger-ui-bundle.js"> </script>
    <script src="/swagger/swagger-ui-standalone-preset.js"> </script>
    <script>
    window.onload = function() {

      // Build a system
      const ui = SwaggerUIBundle({
        url: url = window.location.protocol + "//" + window.location.hostname + ":" + window.location.port + "/swagger/swagger.json",
        dom_id: '#swagger-ui',
        deepLinking: true,
        presets: [
          SwaggerUIBundle.presets.apis,
          SwaggerUIStandalonePreset
        ],
        plugins: [
          SwaggerUIBundle.plugins.DownloadUrl
        ],
        layout: "StandaloneLayout"
      })
      window.ui = ui
    }
  </script>
  </body>
</html>
```