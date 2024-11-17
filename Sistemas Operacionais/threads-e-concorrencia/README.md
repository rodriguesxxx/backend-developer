# O que é um Thread? 

Os processos podem ter uma série de threads associadas e as threads de um processo são conhecidas como threads de usuário, por executarem no modo-usuário e não no modo-kernel. Uma thread é uma “linha” de execução dentro de um processo. Cada thread tem o seu próprio estado de processador e a sua própria pilha, mas compartilha a memória atribuída ao processo com as outras threads “irmãs” (filhas do mesmo processo).

O núcleo (kernel) dos sistemas operacionais também implementa threads, mas essas são chamadas de threads de kernel (ou kernel-threads). Elas controlam atividades internas que o sistema operacional precisa executar/cuidar.

# O que é Concorrência?

É comum achar que concorrência e paralelismo são a mesma coisa, mas não são. Rob Pike - um dos criadores da linguagem Go - em uma apresentação pontuou:

<i>“Concurrency is about dealing with lots of things at once. Parallelism is about doing lots of things at once.”</i>

Concorrência é sobre lidar com várias coisas ao mesmo tempo e paralelismo é sobre fazer várias coisas ao mesmo tempo. Concorrência é um conceito mais a nível de software e paralelismo mais a nível de hardware.

### Concorrência 
é sobre a execução sequencial e disputada de um conjunto de tarefas independentes. Sob o ponto de vista de um sistema operacional, o responsável por esse gerenciamento é o escalonador de processos. Já sob o ponto de vista de concorrência em uma linguagem de programação como Go, por exemplo, o responsável é o scheduler interno da linguagem. Escalonadores preemptivos (como é o caso dos sistemas operacionais modernos) favorecem a concorrência pausando e resumindo tarefas (no caso de sistemas operacionais estamos falando de processos e threads no que chamamos de trocas de contexto) para que todas tenham a oportunidade de serem executadas.

Podemos fazer uma analogia em que concorrência (no contexto de um sistema operacional) é uma fila de drive thru em que carros estão disputando o recurso do atendimento, um por vez. Mas esse drive thru é especial, diferente do da vida real, ele é baseado num sistema preemptivo onde os carros possuem um tempo máximo em que podem ficar ali parados pelo atendimento, passando esse tempo, o carro tem que obrigatoriamente sair para dar oportunidade pro próximo carro da fila.

