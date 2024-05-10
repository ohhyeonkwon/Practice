/*
CalculatorDemo1 파일에서 코드를 조금 수정했다

그 내용은 아래 코드에서 주석으로 설명
 */

package org.opentutorials.javatutorials.exception;
class Calculator2{
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
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            /* 출력 결과는 아래와 같다.
            계산결과는

            e.getMessage()
            / by zero
            > 줄바꿈 후 어떠한 에러가 발생되고 있는지 출력
             */

            System.out.println("\n\ne.toString()\n"+e.toString());
            /*
            e.toString()
            java.lang.ArithmeticException: / by zero
            > 예외 사항에 대한 더 자세한 상황을 출력 (어떠한 형태의 예외인지)
             */

            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
            /*
            e.printStackTrace()
            java.lang.ArithmeticException: / by zero
            at org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:11)
            at org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:25)
            > 어떤 예외가 발생했고 그 원인과, 어떤 로직이나 소스코드때문인지도 알려줌
             */
        }
        System.out.println("Divide End");
        /* 위의 출력 명령어를 사용할 경우 자바는 예외를 발생하고
         catch안의 구문을 실행한 다음 실행을 중지하는 것이 아닌
         try바깥쪽의 sout을 실행하게 된다
         */
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 0);
        c1.divide();
    }
}