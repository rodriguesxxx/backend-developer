# Testes de Softwares

É muito importante o teste de software poís a partir do teste, indetificamos e corrigimos bugs.

## Definição

É o processo de execução de um produto(software), para determinar se ele antigiu suas especificacoes e funcionou corretamente.

## Modelo cascata

Especificacao -> Projeto do Software -> Implementacao -> Testes -> Implantacao

Esse modelo não é tão utilizado hoje em dia.

## Desenvolvimento Agil

while(true):

    - Meet & Plan

    - Design

    - Code & Test

    - Release

    - Feedback

Esse modelo é o mais utilizado hoje em dia.


## Defeito, Erro e Falha

Pode paracer a mesma coisa, **MAS NÃO É.**

### Falha

Todo cenario inesperado onde o usuario acaba tendo contato, em outras palavras: Tudo que é visivel para o usuario.

Por trás da falha tem um erro.

### Erro

É um caminho ou cenario o desenvolvedor não se atentou a testar para resolver.

Todo erro indica um defeito(bug)

### Defeito

A causa da raiz do problema, no caso o codigo em si.

## Verificação e Validação

- **Verificação:** Estamos construindo o sistema certo?

Verificar é entender.

- **Validação:** Estamos construindo o software certo?

Entender se as regras de negocios estão sendo aplicadas

## Niveis de Testes

Unidade -> Integração -> Sistema -> Regressão -> Aceitação

### Testes de Unidade

Unit Test(Testes unitarios)

Testar certas partes do codigo de forma unitaria.

### Testes de Integração

Bem mais amplo que os testes unitarios, os Testes de Integração testa varias partes do sistema em conjunto, por exemplo: Temos um endpoint para validar informacoes pessoais de um usuario( nome, cpf, email ), que envolve desde algoritmos para validacao(cpf, email), até mesmo querys ao banco de dados, para verifica se o usuario não existe no sistema, a partir desse resultado será tomada decicoes.

### Testes de Sistema

Nós testes de sistema, tudo que foi desenvolvido até o momento deve ser testado. Inclusive o deploy é realizado, para que alguns usuarios acessem, e assim pode ser testada a escabilidade do sistema.

- #### Teste Alpha
    Esse é o teste inicial, voltado para poucas pessoas, na maioria dos casos após esse teste alguns problemas seram identificados

- #### Teste Beta
    Um teste mais maduro, onde a gama de usuario será maior. Muito utilizado para testar a escabilidade e velocidade do sistema.
- #### Teste Cannary

    É mais relacionado ao deploy(implantar em producao)

disponibiliza um certa versao apenas para um grupo de usuario.
### Testes de Regressão

O momento que deve ser reavaliado tudo que está sendo desenvolvido. 
Onde o desenvolvedor verá se as novas features que estão sendo desenvolvidas não quebrara partes do software.


### Teste de Aceitação

Quando tudo está finalizado e o usuario dar o **"OK"**.

#### DICA: O selenium é uma otima ferramenta para o teste de software, nele se pode simular um "usuario real"

## Técnicas de Testes

- ### Caixa Branca(Teste Estrutural)
    É a validação dos dados, o controle, fluxo e as chamadas 
    do sistema
    
    **niveis**: Unidade, Intregracao, Regrassao

- ### Caixa Preta(Teste Funcional)
    Você não sabe o que acontece, não conhece a estrutura.
    
    **niveis**: Integração, Sistema e Aceitação


## Testes não funcionais

São testes que não tem haver com as regras de negocios.

- ### Comportamento do sistema
- ### Performace
- ### Escalabilidade
- ### Segurança
- ### Infraestrutura


### Teste de Carga

Utilizado para verificar qual o volume de transações, acessos simultaneos ou usuarios que um servidor/software suporta.

**ferramentas**: Gatling e Apache Jmeter

### Testes de stress

Submete o software em situações extremas. Testa os limites do software.

**ferramentas**: Apache Jmeter

### Testes de segurança

Processo critico de seguranca cibernetica que visa detectar vulnerabilidades no seu software.

**ferramentas**: OWASP

...