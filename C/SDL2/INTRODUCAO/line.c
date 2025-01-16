#include <SDL2/SDL.h>
#include <stdio.h>
#include <stdbool.h>

#define RUNNING true;

void keyb_actions(SDL_Event *event, bool *state) {
    while(SDL_PollEvent(event)) {
        if(event->type == SDL_QUIT) {
            *(state) = !RUNNING;
        } else if(event->type == SDL_KEYDOWN) {
            const Uint8 *keyb_state = SDL_GetKeyboardState(NULL);
            if ((keyb_state[SDL_SCANCODE_LCTRL] || keyb_state[SDL_SCANCODE_RCTRL]) && keyb_state[SDL_SCANCODE_C]) {
                *(state) = !RUNNING;
            };
        }
    }
}

int main() {


    if(SDL_Init(SDL_INIT_VIDEO) != 0) {
        printf("Erro interno ao iniciar SDL: %s\n", SDL_GetError());
    }

    SDL_Window *window = SDL_CreateWindow("Lines", SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED, 1280, 720, SDL_WINDOW_SHOWN | SDL_WINDOW_RESIZABLE);
    if(window == NULL) {
        printf("Erro interno ao criar janela: %s\n", SDL_GetError());
        SDL_Quit();
    }

    SDL_Renderer *renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_ACCELERATED);
    if(renderer == NULL) {
        printf("Erro interno ao instanciar contexto de renderização: %s\n", SDL_GetError());
        SDL_DestroyWindow(window);
        SDL_Quit();
    }

    SDL_Event event;

    SDL_SetRenderDrawColor(renderer, 255, 255, 255, 255);
    SDL_RenderClear(renderer);

    bool state = RUNNING;

    while(state) {
        
        //encapsula a logica de fechamento de janela
        keyb_actions(&event, &state);

        SDL_SetRenderDrawColor(renderer, 0, 0, 0, 255);
        
        //coordenada X,Y do centro  
        int cX = 640;
        int cY = 360;
        
        //r1 -> x1 = cX-100, x2 = cX + 100 | y1 = cY-100, y2 = cY + 100
        SDL_RenderDrawLine(renderer, cX-100, cY-100, cX+100, cY + 100);

        //r2 -> x1 = cX + 100, x2 = cX - 100 | y1 = cY + 100 | y2 = cY + 100
        SDL_RenderDrawLine(renderer, cX+100, cY-100, cX-100, cY+100);

        SDL_RenderPresent(renderer);
        
    }
    

    SDL_Log("Fechando o programa...");
    SDL_DestroyRenderer(renderer);
    SDL_DestroyWindow(window);
    SDL_Quit();

    return 0;
}