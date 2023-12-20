#include <stdio.h> // stdio importa do nosso POSIX as funcoes: stdin, stdout e stderr.

int main(){
    
    int anoAtual;
    int anoNascimento;

    printf("informe o ano atual: "); //stdout -> imprimi uma valor na terminal
    scanf("%d", &anoAtual); //stdin -> recee um valor inteiro do teclado e guarda dentro da variavel;

    printf("informe o ano do seu nascimento: ");
    scanf("%d", &anoNascimento);

    int diasDeVida = (anoAtual - anoNascimento) * 365;

    printf("Você tem %d anos de vida\n",diasDeVida);
}