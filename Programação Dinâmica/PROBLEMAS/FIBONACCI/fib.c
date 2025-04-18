#include<stdio.h>

//O(2^n)
int fib(int n) {
    if (n <= 2) return 1;
    
    return fib(n - 1) + fib(n - 2);
}

int init_memo(int memo[], size_t size) {
    for (int i = 0; i <= size; i++) {
        memo[i] = -1;
    }
}

//O(n)
//TOP-DOWN
int fib_with_memo(int n, int memo[]) {
    if(memo[n] != -1) return memo[n];

    if (n <= 2) return 1;
    
    int f = fib_with_memo(n - 1, memo) + fib_with_memo(n - 2, memo);
    memo[n] = f;
    
    return f;
}

//O(n)
//DOWN-TOP
int fib_norecursive(int n) {
    int fib[n + 1];
    fib[0] = 0, fib[1] = 1;

    for(int i = 2; i <= n; i++) fib[i] = fib[i - 1] + fib[i - 2];
    
    return fib[n];
}

int main() {
    
    int n = 45;
    int memo[n];
    init_memo(memo, n);

    printf("%d\n", fib(n));
    printf("%d\n", fib_with_memo(n, memo));
    printf("%d\n", fib_norecursive(n));

    return 0;
}