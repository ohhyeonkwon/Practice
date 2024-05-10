/*
추상이 상속을 강제하는 것이라면 final은 상속/변경을 금지하는 규제

final을 지정하게되면 3.14가 지정되어있는 PI값이 바뀔 수 없는 값이 되어버림

이미 PI값은 3.14로 지정되어있고 final로 확정시켰기에 나중에 PI값을 변경하려고하면
자바는 이를 거부하게 됨
 */


package org.opentutorials.javatutorials.finals;

class Calculator {
    static final double PI = 3.14;
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
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

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;


    }

}