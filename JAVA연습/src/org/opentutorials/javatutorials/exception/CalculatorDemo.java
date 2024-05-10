/*
예외를 만들어보겠다.

아래 코드에서 예외가 발생하는 이유는 10을 0으로 나누려고 하기 때문이고
setOprands메소드의 두번째 인자값이 0이기에 발생한다.

따라서 setOprands의 두번째 인자로 0이 들어오면 예외를 발생시키거나
메소드 divide를 실행할 때 right의 값이 0이라면 예외를 발생시키는 방법이 있다.
 */

package org.opentutorials.javatutorials.exception;
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        if(right==0){
            throw new IllegalArgumentException("두번째 인가의 값은 0이다.");
        }
        /* 두번째 인자의 값이 0이 되었을 때
         setOprands의 사용자에게 예외 클래스인 IllegalArgumentException을 던지고 있고,
         예외와 함께 '두번째 인자의 값은 0이 될 수 없습니다.'라는 메시지를 받게 됨.
        */

        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
        /*
        if(this.right == 0){
            throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
        }
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();

            이러한 형식처럼 divide 내에서 예외를 처리할 수도 있음
         */
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}