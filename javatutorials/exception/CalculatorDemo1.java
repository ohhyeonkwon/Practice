/*
아래의 코드를 살펴보면 setOprands 메소드의 인자로 10과 0을 받고있고
10을 0으로 나누면 오류가 발생한다.
이러한 오류가 발생했을 때 사용하는 것이 예외이고
그 사용법은 아래와 같다.

try{
    예외의 발생이 예상되는 로직
}catch(예외클래스 인스턴스){
    예외가 발생했을 때 실행되는 로직
}
 */


package org.opentutorials.javatutorials.exception;
class Calculator1{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("오류가 발생했습니다 : "+e.getMessage());
        }
    }
}
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        c1.setOprands(10, 0);
        c1.divide();

        Calculator1 c2 = new Calculator1();
        c2.setOprands(10, 5);
        c2.divide();
    }
}