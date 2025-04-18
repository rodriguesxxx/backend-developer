# O que é DP?

A programação dinâmica é uma técnica de otimização utilizada para solucionar problemas complexos, ela se baseia na quebra do problema em subproblemas, solucionando cada um apenas uma vez e armazenando seus resultados para evitar repetições.

# Quando devo aplicar a DP?

Nem todos os problemas devem ser resolvidos com programação dinâmica; é preciso que o problema atenda aos princípios dessa abordagem.

```
[PROBLEMA] -> [DP] -> SOLUÇÃO
```

# Princípios da DP

-   ### Subestrutura ótima

    O problema pode ser resolvido a partir das soluções ótimas de seus subproblemas.

    Imagine, qual a melhor rota saindo de Itaobim para chegar em Almenara.

    Rotas:

    ```
    ITAOBIM -> JOAIMA : 115KM
    ITAOBIM -> JEQUI : 90 KM
    JEQUI -> JOAIMA : 25 KM
    JEQUI -> ALMENARA: 40 KM
    ```

    MELHOR ROTA: `ITAOBIM -> JEQUI -> ALMENARA : 130KM`

    Dividimos em 2 subproblemas, Itaobim para Jequi | Jequi para Almenara

    Podemos observar a otimalidade nisso quando queremos ir de `JOAIMA` para `Almenara`, sabemos que a rota mais próxima de almenara é jequi, logo para chegarmos em almenara a partir de `JOAIMA` teremos que passar por jequi, seguindo a mesma rota do subproblema anterior.

-   ### Subproblemas sobrepostos

    Os subproblemas se repetem durante a solução

    O melhor exemplo para isso é o cálculo do Fibonacci de um número

    ```
            f(4)
        f(3)  -   [f(2)]
    [f(2)] - f(1)   ...
    ```

    veja que ao solucionar o f(4), estamos calculando o f(2) 2x.
