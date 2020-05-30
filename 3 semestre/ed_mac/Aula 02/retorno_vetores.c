#include <stdio.h>
#include <stdlib.h>

int * cria_vetor_certo(int t){
  int *v;
  int i;
  v = (int *) malloc(t * sizeof(int));
  for(i = 0; i < t; i++){
    v[i] = 2*i;
  }
  return v;
}

int main(){
  int * x = cria_vetor_certo(10);
  int i;
  for (i = 0; i < 10; i++){
    printf("%d\n", x[i]);
  }
  free(x);
  return 0;
}
