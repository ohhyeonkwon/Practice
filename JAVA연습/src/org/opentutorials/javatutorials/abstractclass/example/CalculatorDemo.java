/*
Calculator 클래스가 추상클래스이고 sum과 avg가 추상메소드이기에
Calculrator 클래스를 상속받는 CalculatorDecoPlus클래스는
sum과 avg메소드를 직접 구현하고 결과를 출력하게함
 */


package org.opentutorials.javatutorials.abstractclass.example;
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    int _sum(){
        return this.left + this.right;
    }
    // 공통적으로 중복되는 코드가 있기에 메소드를 만들어 변경해준다
    // 접근제어자가 존재하지 않는 것은 디폴트(default) 접근제어자 라는 뜻이고
    // 디폴트 접근제어자는 같은 패키지에서만 사용할 수 있음

    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+_sum()/2);
    }
}
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+_sum()/2);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }

}