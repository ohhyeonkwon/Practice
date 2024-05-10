/*
example2 CalculatorConstructorDemo4에서 기본 생성자를 만들어야한다고 했지만
하지만 기본 생성자를 만들지 않고도 객체가 동작하도록 할 수 있음
상위클래스의 생성자를 하위클래스가 생성될 때 생성자에서 호출해서 실행시킬 수 있도록 하는 방법임

super라는 것은 부모 클래스를 의미함
마치 this가 자기 자신을 의미하는 것과 같은 원리로, super()는 부모클래스의 생성자이며
하위클래스의 초기화 코드는 항상 슈퍼클래스를 호출 한 후에 나타나야함
*/

package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
    int left, right;

    public Calculator(){}

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

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
        super(left, right);
        //부모클래스 생성자 호출
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}