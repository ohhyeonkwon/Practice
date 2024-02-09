#include <stdio.h>

int main (void)
{
	int i=1, sum=0;
	while(i<= 100)
	{
		sum= sum+i;
		i++;
	 } 
	 printf("1부터 100까지의 합은 %d입니다.\n", sum);
	return 0;
}
