#include <cstdlib>
#include <iostream>
#include <stdio.h>
using namespace std;

void quicksort(int *v, int inicio, int fim) {
    int i, f, pivo, aux;

    i = inicio;
    f = fim;
    pivo = v[(inicio + fim) / 2];

    while(i <= f) {
        while(v[i] < pivo && i < fim) {
            i++;
        }
        while(v[f] > pivo && f > inicio) {
            f--;
        }
        if(i <= f) {
            aux = v[i];
            v[i] = v[f];
            v[f] = aux;
            i++;
            f--;
        }
    }

    if(f > inicio) {
        quicksort(v, inicio, f);
    }
    if(i < fim) {
        quicksort(v, i, fim);
    }
}

int main(){

   int  v[10];  //vetor de 10 elementos
   int  i;      //posicionador;

   for (int k = 0; k<10; k++)
     v[k] = 0;

   for (i=0; i<10; i++)
   {
      printf("Digite o valor de v[%d]:", i);
      scanf("%d", &v[i]);
   }

   //ordenando

   quicksort(v, 0, 9);

   //respoosta:

   printf("\n--->Vetor Ordenado:");
   for (i=0; i<10; i++)
   {
      printf("\n  |--> v[%d] = %d", i, v[i]);
   }
   printf("\n");

   //getch();
   return(0);

}
