/*
부모객체(A)를 상속받는 자식객체(B)가 있다면 자식객체(B)에
또 자식객체를 생성하려 한다면 얼마든지 가능하다.

아래는 그 예시

이러한 상속으로 인한 장점은 부모의 기능을 물려받기 때문에 또 만들 필요가 없어진다.
따라서 코드의 중복을 제거할 수 있으며, 가독성이 좋아지며, 코드의 재활용성,
그리고 부모 클래스에서 기능이 개선된다면 자식 클래스들에도 모두 적용되기에 코드의 유지보수가 좋다.
 */

package org.opentutorials.javatutorials.Inheritance.example1;

class DivisionableCalculator extends MultiplicationableCalculator {
    //더하기,평균의 클래스를 상속받은 곱하기 클래스를 또 상속받은 나누기 기능의 클래스
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo3 {

    public static void main(String[] args) {

        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        //위까지는 Demo1
        c1.multiplication();
        //Demo2
        c1.division();
        //Demo3
    }

}