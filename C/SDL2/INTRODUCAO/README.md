# Linguagem C: Anotações sobre Simple DirectMedia Layer (SDL)

## Introdução

O SDL é uma bibloteca multiplataforma que provê funções que auxiliam no gerenciamento de vídeo, áudio, controle e etc...

Essas anotações tem como foco principal a criação de gráficos com o auxílio desta ferramenta.

### Instalação(Fedora)

```bash
sudo dnf install SDL2 SDL2-devel
```

```bash
sudo dnf gcc
```

### Primeiros passos

-   **_importando a bibloteca_**

    ```c
    #include <SDL2/SDL.h>
    ```

-   **_compilando código_**

    **obs:** execute este comando direto no shell do seu sistema, ou seja, não utilize o terminal do seu editor.

    ```bash
    gcc -o meuprograma meuprogra.c -lSDL2
    ```

-   **_abrindo janela_**

    ```c
    #include<SDL2/SDL.h>
    #include<stdio.h>
    int main() {
        if(SDL_Init(SDL_INIT_VIDEO) != 0) {
            printf("Erro interno ao iniciar SDL %s\n", SDL_GetError);
        }
    }

    ```

    -   **_SDL_Init(Uint32 flags)_**

        Está função recebe como parâmetro o subsistema que você deseja acessar. É retornado `0` caso ocorra sucesso na operação!

        <table border="1">
        <tr>
        <th>Flags</th>
        <th>Desc.</th>
        </tr>

        <tr>
        <td>SDL_INIT_AUDIO</td>
        <td>subsistema de áudio</td>
        </tr>
        <tr>
        <td>SDL_INIT_VIDEO</td>
        <td>subsistema de vídeo</td>
        </tr>
        <tr>
        <td>SDL_INIT_JOYSTICK</td>
        <td>subsistema de controle remoto</td>
        </tr>
        <tr>
        <td>SDL_INIT_EVENTS</td>
        <td>subsistema de eventos</td>
        </tr>
        <tr>
        <td>SDL_INIT_EVERYTHING</td>
        <td>todos os subsistemas acima</td>
        </tr>
        </table>

    -   **_SDL_CreateWindow(const char \*title, int x, int y, int w, int h, Uint32 flags)_**

        Está função serve para instancia uma nova janela, recebendo as seguintes informações:

        `title` -> `titulo da janela`

        `x` -> `eixo x da janela`(pode ser as contantes, SDL_WINDOWPOS_CENTERED, ou SDL_WINDOWPOS_UNDEFINED)

        `y` -> `eixo y da janela`(pode ser as contantes, SDL_WINDOWPOS_CENTERED, ou SDL_WINDOWPOS_UNDEFINED)

        `w` -> `largura em pixels da janela`

        `h` -> `altura em pixels da janela`

        `flags` -> `0, várias flags separa por '|'` <a href="https://wiki.libsdl.org/SDL2/SDL_WindowFlags">WindowFlags</a>

        **_Essa função retorna um ponteiro do tipo(`SDL_Window`)._**

    -   **_SDL_CreateRenderer(SDL_Window \*window, int index, Uint32 flags)_**

        Está função serve para instanciar um novo contexto de renderização 2D para uma janela.

        `window` -> `ponteiro da janela`

        `index` -> `driver de renderização a ser inicializado`(-1 para iniciar o primeiro que suporte as flags)

        `flags` -> `um ou mais sinalizadores` <a href="https://wiki.libsdl.org/SDL2/SDL_RendererFlags">RendererFlags</a>
