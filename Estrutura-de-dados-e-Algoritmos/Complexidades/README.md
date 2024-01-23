## Um pouco sobre Complexidades

O principal motivo para se usar `estrutura de dados`, é resolver problemas de forma `eficaz` e `eficiente`. Mas como sei se meu programa é `eficiente`? Ai que entra(lá ele) as `complexidades`.

-   ### Complexidade de Tempo

    A `complexidade de tempo` é usada para medir a quantidade de tempo necessária para executar o código.

-   ### Complexidade de Espaço
    A `complexidade de espaço` significa a quantidade de espaço necessária para executar as funcionalidades do código.

**"_ahh, mas o tempo necessário para execução de um programa depende de vários fatores_"**

Para isso temos a `notação assintótica`.

    a notação assintótica é uma ferramenta matemática que calcula o tempo necessário em termos de tamanho de entrada e não requer a execução do código.

## 3 Marias

As três notações assintóticas a seguir são usadas para representar a complexidade de tempo dos algoritmos:

-   **Notação Big-O (O)**: Descreve o pior cenário.
-   **Notação OMega (Ω)**: Descreve o melhor cenário.
-   **Notação Theta (θ)**: Representa a complexidade média de um algortimo.

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/mypic.png" alt="representação das notações" />

**Matemática não é importante né? rsrs**

## Notação Big O

Sem dúvidas a notação mais utilizada na análise de um código é a `Big-O`. Ela fornece um limite superior do tempo de execução do código(ou a quantidade de memória usada em termos de tamanho de entrada).

**Para um problema de tamanho N:**

-   Uma função de tempo constante é `Ordem 1`: `O(1)` // + eficiente
-   Uma função de tempo linear é `Ordem N`: `O(N)` // +/- eficiente(depende do tamanho de N)
-   Uma função de tempo quadrático é `Ordem N ao quadrado`: `O(N * N)` // - eficiente

<img src="https://www.freecodecamp.org/portuguese/news/content/images/2021/12/1_KfZYFUT2OKfjekJlCeYvuQ.jpeg" alt="representação da Big O" />

## Notação OMega (Ω)

Em termos simples, `Ω` fornece um limite inferior para o desempenho de um algoritmo, indicando o menor tempo que um algoritmo pode levar para resolver o problema.

-   **Cota Inferior Assintótica**: Ω fornece um limite inferior assintótico, o que significa que estamos considerando o comportamento da função para tamanhos de entrada suficientemente grandes.

-   **Relação com O (Big O)**: Enquanto a notação O descreve um limite superior, Ω descreve um limite inferior. Em alguns casos, podemos usar ambas as notações (Ω para inferior e O para superior) para obter uma descrição mais precisa do comportamento assintótico de um algoritmo.

<img src="https://blog.pantuza.com/uploads/2f73cf82965a89f090b2cd9c99a8b307c5cbf7c0" alt="representação da Omega" />

## Extras

**Mais sobre Big(O):** https://www.freecodecamp.org/portuguese/news/o-que-e-a-notacao-big-o-complexidade-de-tempo-e-de-espaco/

**Mais sobre OMega (Ω):** https://blog.pantuza.com/artigos/a-notacao-omega
