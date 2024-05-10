/*
Calculator 클래스 안에 같은 이름의 메소드가 실행되고
this를 이용해 전역변수의 값을 세팅한다

그리고 이 Calculator 메소드를 생성자라고 부른다
*/

package org.opentutorials.javatutorials.constructor;

class Calculator {
    int left, right;

    public Calculator(int left, int right) {
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

public class CalculatorDemo1 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator(10, 20);
        //new 뒤의 Calculator는 클래스가 아닌 생성자다.
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }

}