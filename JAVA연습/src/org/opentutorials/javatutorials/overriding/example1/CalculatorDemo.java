/*
오버라이딩 (overriding)은 재정의를 뜻한다
: 부모클래스가 갖고있는 기본적인 기능에 자식클래스의 기능을 필요에따라 변경하는 것

자식클래스가 더 가치있게 사용되기 위해서는 부모가 물려준 클래스나 메소드 중에
어떤 메소드에 대해서는 자식클래스에서 해당 기능을 덮어씌워 자식클래스에서만의 필요한 기능을 정의할 때가 있다

부모클래스의 메소드를 물려받았지만 해당 메소드를 사용하지 않고 자식클래스의 필요에 따라
해당 메소드를 재정의하여 기능을 변경하는 방법이 아래 코드에 있다.
 */

/*
오버라이딩 (overriding)의 제약사항

메소드의 이름, 메소드가 갖는 매개변수, 그 매개변수의 개수와 데이터타입, 순서가 모두 일치해야
오버라이딩(overriding)이 된다.

이러한 메소드의 형태를 정의하는 사항을 통틀어 메소드의 서명이라고 한다


부모클래스 avg메소드의 리턴타입은 void이고, 자식클래스의 avg메소드 리턴타입은 int이라면
avg메소드의 리턴타입이 서로 호환되지 않는다는 에러가 발생한다

위의 에러를 해결하기 위해서는 리턴타입을 수정하면 된다.

그리고 만약, 부모클래스에 있는 return((this.left. + this.right)/2); 의 로직이 자식클래스에서도 중복되고 있다면
이를 다시 해결하기 위해서는 super()메소드를 사용하면 된다.
super는 현재 클래스의 부모 클래스를 의미하고 부모클래스에 소속된 avg메소드를 호출하기에 적합하다
그리고 이후 더 추가하고 싶은 로직을 추가해도 된다.
 */

package org.opentutorials.javatutorials.overriding.example1;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }
    // 부모클래스의 sum 메소드

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {

    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
    // 부모클래스에도 sum 메소드가 있지만
    // 부모클래스의 sum 메소드는 무시되고 자식클래스의 sum 메소드가 실행된다

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}