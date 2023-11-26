## Docker fundamentals

acesse o docker hub: https://hub.docker.com/
## Principais comandos docker

- #### docker pull <image>
    Instalar imagem do docker hub

- #### docker run <image>
    
    roda a imagem

    **princiapais tags**
    - ##### sleep 10 
    
        roda a imagem por 10 seg
    
    - ##### -it 
        
        i = interactive

        t = Allocate a pseudo-TTY

- #### docker images
    lista todas as imagens

- #### docker ps
    lista os containers em execucao, passando a tag -a é listado os containers executados recentemente.