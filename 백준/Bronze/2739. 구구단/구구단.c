#include <stdio.h>

int main(void) {
  int num;
  scanf("%d",&num);
  for(int i = num; i<=num; i++){
    for(int j = 1; j<=9; j++){
      printf("%d * %d = %d\n",i,j,i*j);
    }
  }

  return 0;
}