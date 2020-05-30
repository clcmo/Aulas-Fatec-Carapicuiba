#include<stdio.h>
#include<stdlib.h>

void f1(int * a, int * b){
  *a = *a + 1;
  *b = *b + 1;
}

int main(){
  int a = 3, b = 2;
  printf("antes:\na=%d\tb=%d\n", a, b);
  f1(&a, &b);
  printf("depois:\na=%d\tb-%d\n", a, b);
  return 0;
}
