#include <stdio.h>

int fun(int g){
  int ca = 0;

  for(int i = 0; i < 3; i++){
    ca = ca * 10 + g % 10;
    g = g /= 10;

  }
  return ca;
}
int main(void) {
  int a,b;
  scanf("%d %d",&a,&b);

  a = fun(a);
  b = fun(b);
  
  if(a > b){
    printf("%d\n",a);
  }
  else{
    printf("%d\n",b);
  }

  return 0;
}