/*
기본 생성자가 없음
에러가 발생하는데 그 내용은 부모 클래스의 생성자가 정의되어 있지 않다는 내용

47번째 줄의 SubstractionableCalculator를 인스턴스화 시키면 부모클래스인 Calculator의 생성자를
자동으로 호출하도록 약속되어 있음
31번째 줄의 하위클래스가 상속을 받을 때 상위클래스에 있는 Calculator 기본 생성자를 호출해야 하는데
그 생성자가 존재하지 않기에 에러가 발생함
따라서 Calculator 기본 생성자를 정의해야함
 */

package org.opentutorials.javatutorials.Inheritance.example2;


//기본 생성자 코드 위치

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
