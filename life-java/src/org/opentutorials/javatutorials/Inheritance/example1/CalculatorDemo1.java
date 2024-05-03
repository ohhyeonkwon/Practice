/*
상속은 객체지향에서 아주 중요한 기능.
기존의 한 객체와 새로운 객체가 있다면, 새로운 객체가 기존의 객체의 변수나 메소드들을 그대로 물려받으며
필요에 따라 새로운 변수나 메소드를 추가하거나 변경하여 사용하는 것이 상속임.

Calculator c1 = new Calculator();
c1.setOprands(10, 20);
c1.sum();
c1.avg();
c1.substract();

위 예제에서 빼기기능을 추가하기 위해 substract을 추가하려면 메소드를 추가하면 되지만
Calculator 클래스를 본인이 만들지 않았거나 소스를 받아서 사용해도 코드 상의 변화가 생긴다면
메소드의 추가가 어렵거나 불가능할 수 있다.

따라서 기존의 객체를 그대로 유지하며 기능을 추가하기 위해 상속을 필요로 하는 것이고
기존의 기능을 물려주는 부모 객체(상위 클래스), 새로운 객체가 기존 객체의 기능을 물려받는 자식 객체(하위 클래스)가 된다.

하나의 부모 객체가 있다면 자식 객체는 얼마든지 많아도 가능
*/


package org.opentutorials.javatutorials.Inheritance.example1;

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
    //SubstractionableCalculator는 Calculator를 상속한다 라는 의미
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {

    public static void main(String[] args) {

        SubstractionableCalculator c1 = new SubstractionableCalculator();
        //c
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        //c1.substract() 을 호출하면
        //class SubstractionableCalculator extends Calculator 안의 명령어를 호출
        //
    }

}