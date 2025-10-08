#include <stdio.h>
#include <string.h>

#define MAX_STACK 100

typedef struct {
    char func[50];
    int addr;
    int vars[10];
    int n_vars;
} Frame;

typedef struct {
    Frame frames[MAX_STACK];
    int top;
} Stack;


void push(Stack *stack, Frame frame) {
    if(stack->top > MAX_STACK - 1) {
        printf("Transbordou!!!");
        return;
    }

    stack->frames[++stack->top] = frame;
}

void print(Stack *stack) {
    printf("\n=== PILHA DE EXECUÇÃO ===\n");
    for (int i = stack->top; i >= 0; i--) {
        printf("Função: %s | Retorno: %d | Locais: ", 
            stack->frames[i].func,
            stack->frames[i].addr);
        for (int j = 0; j < stack->frames[i].n_vars; j++)
            printf("%d ", stack->frames[i].vars[j]);
        printf("\n");
    }
    printf("==========================\n");
}

int main() {
    Stack stack;
    stack.top = -1;

    Frame f1 = {"f1", 0, {1,2}, 2};
    Frame f2 = {"f2", 100, {3}, 1};
    Frame f3 = {"f3", 200, {5,6}, 2};

    push(&stack, f1);
    push(&stack, f2);
    push(&stack, f3);

    print(&stack);
    return 0;
}