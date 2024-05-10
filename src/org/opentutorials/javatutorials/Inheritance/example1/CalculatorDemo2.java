package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends Calculator {
    // MultiplicationableCalculator는 Calculator를 상속받음
    // Calculator 클래스는 Demo1에서 정의했기에 또 정의할 필요가 없음
    public void multiplication() {
        System.out.println(this.left * this.right);
        //부모가 갖고있는 인스턴스 변수 필드인 this.left와 this.right 로직
    }
}

public class CalculatorDemo2 {

    public static void main(String[] args) {

        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        //위 까지는 부모클래스의 메소드를 호출
        c1.multiplication();
    }
}