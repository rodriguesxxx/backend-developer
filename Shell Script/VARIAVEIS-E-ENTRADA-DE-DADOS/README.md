## Variáveis

Na programação é comum o uso de variáveis para armazenar dados temporários, aqueles que ficam salvos na memória RAM.

Shell script é uma linguagem de tipagem fraca, ou seja, não importa o tipo do dado, pode ser um texto, um número, etc...

arquivo: codigo.sh
```shell
#!/usr/bin/env bash

# Declarando variávies
nome="Daniel"
idade=17
DATA="A DATA ATUAL É: $(date +%F)"

# Imprimindo valor variável no terminal
echo "Meu nome é $nome
Tenho $idade anos de idade
$DATA"
```

## Entrada de dados
Para lermos valores do terminal, utilizaremos o comando `read`.

```shell
#!/usr/bin/env bash
echo "Qual seu nome?"
read nome

echo "Olá $nome, tudo bem?"
```