#include <stdio.h>
#include <stdlib.h>

struct student {
	int number;
	char name[10];
	double grade;
};

int main (void)
{
	struct student s;
	
	printf("�й��� �Է��ϼ��� :");
	scanf("%d", &s.number);
	printf("�̸��� �Է��ϼ��� :");
	scanf("%s", s.name);
	printf("������ �Է��ϼ��� :");
	scanf("%lf", &s.grade);
	
	printf(" �й� : %d\n", s.number);
	pritnf("�̸� : %s\n", s.name);
	printf("���� : %.1f\n", s.grade);
	return 0;
}
