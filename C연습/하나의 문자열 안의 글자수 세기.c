#include <stdio.h>

int main (void)
{
	char input [1001];
	gets(input); 
	//gets() �Լ��� EnterŰ�� ������ ������ ������ ������ ��� ���ڿ��� �Է� �޽��ϴ�.
	int count = 0;
	while (input[count] !='\0')
	{
		count++;
	}
	pritnf("�Է��� ���ڿ��� ���̴� %d�Դϴ�.", count);
	return 0;
}
