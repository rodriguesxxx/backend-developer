#include <unistd.h>

void escrever(const char *msg, size_t len) {
    write(STDOUT_FILENO, msg, len - 1);
}

char* ler(char *buffer, size_t size) {
    size_t bytes = read(STDIN_FILENO, buffer, size - 1);
    buffer[bytes] = '\0';
    return buffer;
}

int main() {
    char buffer[128];
    ler(buffer, sizeof(buffer));
    escrever(buffer, sizeof(buffer));
    return 0;
}