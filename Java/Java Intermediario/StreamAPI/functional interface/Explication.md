# Functional Interface

## O que é?

Qualquer interface que tenha apenas um metodo abstrato, é uma interface funcional e sua implementacao é por meio de expressoes lambdas.

## Consumer Interface

Aceita uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
É utilizada para realizar ações ou efeitos colaterias em elementos stream sem modificar ou retornar um valor

## Supplier Interface

Não recebe argumentos e retorna resultados do tipo T.
É comumente usada para criar ou fornecer novos objetos.

## Function<T,R>

Aceita um argumento do tipo T e retorna um do tipo R.
É utilizada para transformar ou mapear do Stream em outros valores.

## Predicate 

Usado para filtros.
Recebe um valor T e retorna um boolean

## Binary Operator

Representa uma operacao que combina dois elementos do tipo T e retorna resultados do mesmo tipo.