#include <cstdlib>
#include <iostream>
#include <stdio.h>
using namespace std;

void insertionsort(int *v, int tam){

  int temp,j,index;
  for(j=1;j<tam;j++){
    index = j-1;
    temp = v[j];
    while(v[index]>temp && index>=0){
      v[index+1] = v[index];
      index--;
    }
    v[index+1] = temp;
  }
}

int main(){

  int v[10];

  for(int k = 0;k<10;k++){
    printf("v[%d] = ",k);
    scanf("%d", &v[k]);
  }

  insertionsort(v,10);

  for(int k=0;k<10;k++){
    printf("v[%d] = %d\n", k,v[k]);
  }

  //getch();
  return(0);
}
