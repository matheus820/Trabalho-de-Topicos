#include<stdio.h>

void numero_Perfeito()
{
int numero,soma = 0,i = 0;
printf("Digite um numero inteiro: \n");
scanf("%d", &numero);

for(i = 1; i < numero;i++){
  if (numero % i == 0)
 { 
    soma = soma + i;
    }
  }
if (soma == numero) {
            printf("O numero digitado é perfito\n");

        } else {
            printf("O numero digitado não é perfeito \n");
        }
}
main()
{
 numero_Perfeito();
}
