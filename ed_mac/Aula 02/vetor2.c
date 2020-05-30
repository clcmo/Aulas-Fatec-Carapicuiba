#include <stdio.h>
#include <stdlib.h>

int main() {
  //int v[1000000];
  int * v;
  while (1)
    v = (int *) malloc (1000000 * sizeof (int));
  return 0;
}
