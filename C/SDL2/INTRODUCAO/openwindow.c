#include<SDL2/SDL.h>
#include<stdio.h>

int main() {

    if(SDL_Init(SDL_INIT_VIDEO) != 0) {
        printf("Erro interno ao iniciar SDL %s\n", SDL_GetError());
        return 1;
    }

    SDL_Window* window = SDL_CreateWindow("ThePcWindow", SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED, 1080, 720, SDL_WINDOW_SHOWN);
    if(window == NULL) {
        printf("Erro interno ao iniciar SDL %s\n", SDL_GetError());
        SDL_Quit();
        return 1;
    }

    SDL_Renderer* renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_ACCELERATED);
    if(renderer == NULL) {
        printf("Erro interno ao criar contexto de renderização: %s\n", SDL_GetError());
        SDL_DestroyWindow(window);
        SDL_Quit();
        return 1;
    }

    SDL_SetRenderDrawColor(renderer, 255, 255, 255, 255);

    // SDL_RenderClear(renderer);

    // SDL_SetRenderDrawColor(renderer, 255, 0, 0, 255);

    // SDL_RenderDrawLine(renderer, 100, 100, 500, 500);

    SDL_RenderPresent(renderer);

    SDL_Delay(10000);

    SDL_DestroyRenderer(renderer);
    SDL_DestroyWindow(window);
    SDL_Quit();
    
    return 0;
}