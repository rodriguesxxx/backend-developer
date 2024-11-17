# Sistemas Operacionais: Introdução

## Qual a principal função de um SO?

O Sistema operacional(em termos claros), é a ponte que liga os componentes de hardware(RAM, Disco, Sensores, etc...) ás aplicações em última instância. Ou seja, a principal função de um sistema operacional é executar uma ou várias aplicações para os seus usuários.

## Como ele gerencia os recursos?

Para facilitar a programação, foram criadas linguagens de programação que permitem trabalhar com modelos lógicos, substuindo abstrações próprias da Linguagem de Máquina(registros, endereços de memória, bytes, etc...). Mesmo que com esse mundo colorido do SO, é perfeitamente possível desenvolver aplicações sem o auxílio do sistema operacional, escrevendo programas que controlam todos os detalhes da máquina física, mas é óbvio que isso é coisa de psicopata(risos).

**Resumindo:**
Considere o SO como o responsável pelo gerenciamento de um conjunto de recursos lógicos que simplificam a utilização dps computadores, em particular a programação de aplicações.(peguei isso de um livro, to com preguiça pra botar referências - ABNT2 chatona...)

## Processos

Uma das funções primordias de um sistema operacional é executar programas computacionais, este fluxo de execução é chamado de `processo`.

```shell
# processo.bat
# processo.sh
-#  ...
echo -e "Um processo pode ser definido como o ambiente de execução independente das caracteristicas do computador e da linguagem em que a aplicação foi programada. Após a compilação deste programa em shell para a plataforma desejada(Linux, Windows, Mac, etc...) ele deve se comportar da mesma forma, ou seja, essa mensagem deve ser impressa."

```

-   ### Mão na massa

    Para melhor entendimento, vamos práticar uma pouco.(Os comandos contidos aqui são para o shell do linux)

    **Visualizar processos em execução**

    ```bash
    ps aux
    ```

    **Visualizar processos em execução - (real time)**

    ```bash
    top
    ```

    **Parando um processo**

    ```bash
    #encontre o id do processo:
    pidof <nome_processo>
    ```

    ```bash
    #pare o processo:
    kill <PID> #caso não parar, use flag -9 para forçar a parada
    ```

    **Parando um processo - pelo nome direto**

    ```bash
    pkill <nome_processo> #caso não parar, use flag -9 para forçar a parada
    ```

## Memória Virtual

Como seu cérebro precisa de memória motora para te fazer andar, por exemplo, o sistema operacional necessita de memória física para execução dos processos. Mas a memória do computador(como a do ser humano) é escassa, e gerenciar o endereçamento dos programas é algo bem complexo(e custozo). Para resolver este dilema, o sistema operacional implementa o gerenciamento de espaços endereçaveís, escalonando da memória principal(RAM) para uma memória virtual alocada em disco(SSD, HD, etc...)

## Sistema de arquivos

É função do SO também o gerenciamento de informações persistentes(arquivos, por exemplo).

-   ### Mão na massa

    **Ler arquivos**

    ```bash
    cat <nome_arquivo>
    ```

    **Criar arquivos**

    ```bash
    touch <nome_arquivo>
    ```

    ```bash
    nano <nome_arquivo> #CTRL-O & CTRL-X para salvar
    ```

    **Remover arquivos**

    ```bash
    rm <nome_arquivo>
    ```

## Periféricos

O computador precisa mostrar o seu lado bonito para o mundo. E isso é possível por meio de periféricos, tanto de entrada(mouse, teclado, etc...), quanto de saída(monitor, p2, alto-falantes). O sistema operacional gerencia esses periféricos de uma forma padronizada.

## Usuários

O sistema operacional mantém ainda a informação sobre os seus usuários, gerencia sua identificação e respectivos privilégios, garantindo que apenas os que estão registrados possam utilizar o sistema corretamente.

-   ### Mão na massa

    **Listagem de usuários**

    ```bash
    cat /etc/passwd
    ```

    **Cadastro de usuários**

    ```bash
    sudo adduser <nome_usuario>
    ```

    **Remoção de usuários**

    ```bash
    sudo userdel <nome_usuario> #caso queira apagar a home do usuário, utilize a flag -r
    ```

    **Alterando senha usuário**

    ```bash
    sudo passwd <nome_usuario>
    ```

    **Listando grupos do usuário**

    ```bash
    groups <nome_usuario>
    ```

    **Alterando grupo do usuário**

    ```bash
    sudo usermod -aG <grupo> <usuario>#A flag -aG adiciona o usuário ao grupo sem remover os outros
    ```

    **Alterando grupo principal do usuário**

    ```bash
    sudo usermod -g <grupo> <usuario>
    ```

    **Bloqueando usuário**

    ```bash
    sudo usermod -L <usuario> #impede o login
    ```

    ```bash
    sudo usermod -U <usuario> #desbloqueia
    ```

## Interface

O sistema operacional também pode ser descrito como duas interfaces, a primeira é a operacional, com comandos simples para criar, usar, configurar e apagar os recursos, disponível para todos os usuários, em uma forma gráfica ou textual(shell do linux). A segunda interface disponibilizada pelo sistema é a **bibloteca de chamadas do sistema operacional(system calls)**. Ela pode ser invocada pelos programas, permitindo uma interação direta com os objetos gerenciados pelo sistema.

<a href="./PRATICA/systemcalls.c">PRÁTICA </a>
