# PRINCIPAIS COMANDOS LINUX



## rmdir

Apaga um diretorio vazio.

    rmdir <nome_diretorio>

## touch

Cria um arquivo vazio.

    touch <nome_arquivo>.<extensao_arquivo>

exemplo:
   
    touch index.html

## locate

Localiza um arquivo, assim como você faz para procurar um arquivo no Windows. Além disso, usando o argumento -i junto com esse comando faz com que ele se torne insensível a maiúsculas ou minúsculas, permitindo que você pesquise por um arquivo mesmo sem saber exatamente o nome dele.

Para procurar um arquivo que contém duas ou mais palavras, use um asterisco (*). Por exemplo, use o comando locate -i school*note para encontrar qualquer arquivo que tenha as palavras “school” e “note”, não importando se existem letras maiúsculas ou minúsculas.

exemplo:

    locate -i Index.html

## find

Similar ao comando locate, o comando find ajuda você a procurar por arquivos. A diferença é que você usa o find para localizar arquivos dentro de um diretório específico.

procurando arquivo:

    find -name index.html

procurando repositorio:

    find ./ -type d -name Downloads


## grep

Ele permite que você encontre uma palavra pesquisando todo o conteúdo de um arquivo específico.

Quando o comando grep encontra uma correspondência, ele imprime todas as linhas que contêm o padrão específico. Esse comando ajuda a filtrar arquivos de registro grandes.

exemplo:

    grep teste log.txt


## df

obtem informações sobre o uso do espaço em disco do sistema, mostrado em porcentagem e quilobyte (KB). 

    df -h

mostra o armazenamento total.

## diff

O comando diff (diferença) compara o conteúdo de dois arquivos linha por linha. Depois de analisar esses arquivos, ele vai mostrar as linhas que não são comuns entre eles.

Os programadores frequentemente usam este comando quando precisam fazer pequenas alterações em programas. Assim, eles não precisam reescrever o código inteiro.

    diff teste1.txt teste2.txt

-q mostra apenas se os arquivos são diferentes ou não, sem especificar as diferenças.

-i torna o comando diff insensível a maiúsculas e minúsculas.

-b ignora espaços em branco como possíveis diferenças