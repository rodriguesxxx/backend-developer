 ## Comando TEST

O comando test é utilizado para validar uma expressão, verificando se é verdadeiro ou falso.

É retornado `0` para verificações bem-sucedidas  e `1` para verificações mal-sucedidas.

**sintax**
```bash
test [expressão]
```
**exemplo**
```bash
test "Daniel" = "Lindo demais!!!" # "Daniel" é igual há "Lindo demais!!!"
```

Para verificar a saída, basta chamar essa variável mágica no echo:

```bash
echo $?
#outputs: 1 //quer dizer falso :(
```

**Comparando numeros**

 Para isso utilizaremos a variação `-eq`(equals) e `-ne`(not equals)


**exemplo**
```bash
test 1 -eq 2
echo $? #outputs: 1 //falso
```

```bash
test 1 -ne 2
echo $? #outputs: 0 //verdadeiro
```
 
 ## Bloco condicional IF

O IF é utilizado para tomar determinada ação a partir de uma resposta do test.

**sintax**
```shell
if [[ expressao ]]; then
    #o q deve ser executado(se for verdadeiro)
else
    #o q deve ser executado(se for falso)
fi
```