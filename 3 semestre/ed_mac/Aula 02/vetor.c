#include <stdio.h>

int main() {
  int v[3], i;
  printf("v = %p\n", v);
  for(i = 0; i < 3; i++){
    v[i] = 2*i;
    printf("endereco: %p \t conteudo: %d\n", v, v[i]);
  }
  return 0;
}
