# Domain Driven Design

Antes de falar sobre DDD, devemos falar sobre `o que é um domínio?`

## O que é Domínio?

Esse termo vai além da programação, poís o domínio é a alma do negócio/projeto que você está trabalhando. Se baseia em um conjunto de idéias, conhecimento e processos de negócio.

## Modelos Criativos

Quando se fala em `Domain Driven Design` muitos pensam em apenas boas práticas de design ou codificação de software, mas `DDD` preza que desenvolvedores façam parte do processo de entender o negócio e todos os seus modelos nos mais diversos ângulos. Sobre isso, atualmente faço parte como bolsista de um projeto na minha instituição, para reconstrução de uma sistema de gerência de eventos, e uma das histórias de usuário é a parte de certificados. Ao analisar a versão anterior, o PO notou uma certa complexidade na criação de tarefas e pediu minha ajuda para simplificar isso, mesmo eu sendo apenas um júnior.

## Mas por que devo aprender isso?

Em meados de `2003` o `Eric Evans` publicou um livro 'Domain-Driven Design', conhecido por muitos como "O livro da capa azul". O livro ficou muito conhecido, mas Evans vinha falando sobre isso há anos; por isso, ele é considerado um pioneiro. Segundo ele, o `DDD` é algo mutável e pode ser aprimorado ao longo do tempo. O Domain Driven Design é normalmente utilizado em aplicações complexas, portanto, não gaste tempo e esforço implementando isso em seus projetos pequenos.

## Linguagem Ubíqua

No dia a dia devemos usar uma linguagem comum no contexto da empresa. Pensem comigo, se colocarmos um cozinheiro e um pedreiro para discutirem termos técnicos de suas profissões, seria um desastre.

```
Cozinheiro: Oi, tudo bem? Você sabia que o segredo de um bom prato é o tempero certo?

Pedreiro: Ah, olá! Tempero? Não seria a argamassa certa para assentar os tijolos?

Cozinheiro: Não, não, eu estou falando de tempero mesmo, como sal, pimenta, ervas... Isso faz toda a diferença no sabor!
```

Então, se na sua empresa são utilizados termos de `Java`, utilize-os também.

### Glossário

A linguagem obíqua é um dos três pilares do DDD, e possui algumas características, uma delas é glossário(conjunto de palavras chaves que rodeia o projeto). Deve ser feito de maneira simples, pode ser em uma folha de papel ou planilha do excel. Para exemplificar, vou utilizar um projeto como base: um sistema de catálogo de jogos.

**Glossário do projeto**

```
1 - Jogos = Conteúdo que será visto pelo usuário
2 - Minha Lista = Lista de jogos do usuário
3 - Catálogo = Jogos disponíveis
4 - Gênero = Estilo do jogo(Ex: RPG, FPS, Mundo aberto, ...)
5 - Personagens = Seres que fazem parte do enredo do jogo
6 - Ano lançamento = Data de lançamento do jogo
7 - Requisitos = O que é preciso para jogar
```

### Referências

https://www.youtube.com/watch?v=eUf5rhBGLAk&t=218s
