/*
오버로딩(overloading)
클래스에 메소드를 정의할 때 같은 이름이지만 서로 다른 매개변수의 형식을 갖고있는 메소드를 여러 개 정의할 수 있는 방법

자바는 같은 이름의 메소드여도 매개변수의 수나 데이터 타입이 다르면 다른 메소드로 인식함

같은 이름의 메소드가 2개있어서 충돌중이지만 오버로딩(overloading) 덕분에 문제가 없이 실행 가능

3개의 인자를 전달하게 되면 매개변수가 3개인 메소드를 자동으로 호출
 */

package org.opentutorials.javatutorials.overloading.example1;

class Calculator{
    int left, right;
    int third = 0;

    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        // 2개의 값을 대상으로한 합과 평균
        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();
        // 3개의 값을 대상으로한 합과 평균

    }

}