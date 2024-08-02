## Primeiro código em shell !!!

O shell é uma linguagem de script, ou seja, seu código é executado de cima para baixo.

arquivo: codigo.sh
```shell
#!/usr/bin/env bash

pwd
ls -l
```

OBS: O .sh no arquivo não é necessário, é apenas para diferenciar.(isso me lembra assembly)

Para executar o código, basta abrir o terminal e dar a permissão para o arquivo:
```bash
chmod +x codigo.sh # permissão
./codigo.sh # executa o código
```

## Hello World!
É deverás simples, vamos utilizar o comando `echo`(manda a saída via STDOUT)

```shell
echo "Hello World!!!"
```

Mas como quebro a linha?

Basta adicionar o `-e` e o `\n` na string.

**Explicação:**
O `-e` habilita a interpretação de sequências de escape dentro da string.
       
```shell
echo -e "Hello World!!!\n"
echo -e "@daniel.rodrigues_\n"
```