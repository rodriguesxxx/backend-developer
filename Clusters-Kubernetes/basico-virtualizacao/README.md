# Básico em virtualização

## Virtualização total

## Paravirtualização

## Contêiners

São um método de virtualização a nivel de sistema operacional, onde é permitido empacotar um aplicativo juntamente com suas dependências.
Além disso o ambiente de um containêr é isolado.
E é extremamente portátil, podem ser executados em vários ambientes

### Orquestração
As soluções de orquestração, como Kubernetes, onde é permitido o gerenciamento escalável e automatizado.

### DevOps e CI/CD
Os contêineres são amplamente utilizados por DevOps em entregas continuas.

### Imagens de Contêiner
São modelos para leitura que servem como base para criação dos contêiners.

## Funcionamento das imagens
- ### Construção:
    As imagens de container são criadas usando um processo de construção. Isso seguindo um passo-a-passo do dockerfile

- ### Isolamento:
    Quando um container é executado a partir de uma image, ele é isolado.

- ### Cache:
    O docker salva cache para otimizar e ganhar tempo.
    
- ### Distribuição
    DOCKER HUB