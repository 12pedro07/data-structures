#include <stdio.h>
#include <conio.h>

int p = -1;
int v[100];

int pilhaVazia(){
	if(p==-1)
	    return(1);
	else
	    return(0);
}

int pilhaCheia(){
	if(p==99)
		return(1);
	else
	    return(0);
}

void push(int x){
	if(!pilhaCheia()){
		p++;
		v[p]=x;
	}
	else
	    printf("Pilha Cheia!");
}

int pop(){
	int y;
	if(!pilhaVazia()){
		return(v[p--]);
	}
	else{
		printf("pilha vazia");
		return(-1);
	}
}

void esvaziaPilha(){
	p=-1;
	}

int main(){
	int c;
	p=-1;
	for(c=0;c<10;c++)
		push(c);
	printf("Desempilhando...\n");
	for(c=0;c<10;c++)
		printf("%d\n",pop());
	getch();
	return(0);
}
