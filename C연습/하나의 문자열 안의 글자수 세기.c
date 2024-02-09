#include <stdio.h>

int main (void)
{
	char input [1001];
	gets(input); 
	//gets() 함수는 Enter키를 누르기 전까지 공백을 포함한 모든 문자열을 입력 받습니다.
	int count = 0;
	while (input[count] !='\0')
	{
		count++;
	}
	pritnf("입력한 문자열의 길이는 %d입니다.", count);
	return 0;
}
