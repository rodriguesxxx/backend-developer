## Introducao ao clusters

Um cluster consiste em computadores fracamente ou fortemente ligados que trabalham em conjunto, de modo que, em muitos aspectos, podem ser considerados como um único sistema.

## Serventia
- ### Alta Disponibilidade e Tolerancia a Falhas
    O clusters pode ser configurado para garantir que mesmo se um dos nó falhar, o serviço continue funcionando.

- ### Escalabilidade
    Clusters permitem escalabilidade horizontal, isso significa que voce pode remover ou adicionar nós conforme a demanda.

- ### Desempenho
    O cluster tem a capacidade de dividir uma tarefa em varias partes e distribui0la entre os nós do cluster, isso resulta um melhor desempenho.
- ### Facilidade de Manutenção 
    É mais facil de efetuar manutancao.


## Kubernets

### Orquestração de conteiner

- #### Pods
    Unidade mais basica de implantacao do kubernetes. Um pod pode conter um ou mais conteiner que compartilham o mesmo espacao de rede e recursos
- #### Deployment
    São usados para gerenciar a implatacao de Pods.

- #### Services
    Permitem a descoberta de servicos balanceando a carga para os Pods em um clusters. Uma camada para comunicacao sem precisar de IPs especificos dos Pods

- #### Namespace
    São usados para isolar recursos em  um cluster.

- #### Nós(Nodes)
    Os nós são as maquinas fisicas ou virtuais que compoe o cluster kubernetes. Cada nó executa um agente chamado Kubelet.

- #### Mestre(master)
    O cerebro do cluster kubernetes. Ele opera todo o cluster e gerencia o estado desejado dos recursos, como Pods e Servicos.

### Balanceamento de carga
- #### Ingress Controlllers
    Os controladores de ingress são usados para gerenciar o trafego de entrada para o cluster Kubernete.
- #### Helm Charts
    O Helm é um sistema de gerenciamento de pacotes para kubernetes que permite implantar app complexos com configs proprias.