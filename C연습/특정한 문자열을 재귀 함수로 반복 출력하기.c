#include <stdio.h>

//��� �Լ� (�ڱⰡ �ڱ� �ڽ��� �����ϴ� ����- print �� print �Լ�) 
void print(int count)
{
	if(count ==0)
	{
		return;
	}
	else
	{
		printf("���ڿ��� ����մϴ�.\n");
		print(count-1);
	}
}

int main (void)
{
	int number;
	printf("���ڿ��� �� �� ����ұ��?");
	scanf("%d", &number);
	print(number);
	return 0;
}
