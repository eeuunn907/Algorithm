#include <stdio.h>

int main(void) {
  int a;
  int j,i,k,l;
  scanf("%d",&a);
  for(i = 1; i<= a; i++){
    for(int j = 1; j <= a-i; j++){
      printf(" ");
    }
    for(k = 1; k <= i; k++){
      printf("*");
    }
    for(l = 1; l <= i-1; l++){
      printf("*");
    }
    printf("\n");
  }
  for(i = 1; i<= a-1; i++){
    for(j = 1; j<=i; j++){
      printf(" ");
    }
    for(k = 1; k <= a-i; k++){
      printf("*");
    }
    for(l = 1; l <= a-i-1; l++){
      printf("*");
    }
    printf("\n");
  }
}