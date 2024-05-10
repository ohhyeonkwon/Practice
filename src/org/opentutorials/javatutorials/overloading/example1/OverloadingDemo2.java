/*
String 매개변수를 갖고 리턴 값이 void인 A메소드는 부모클래스와 같은 메소드가 있지만
매개변수가 다르기에 이는 오버라이딩(overriding)이 된다.

하지만 그 아래의 매개변수가 없는 리턴 값이 void인 A메소드는 부모클래스에서도 존재하고 있기에
이는 오버로딩(overloading)이 아닌 오버라이딩(overriding)이다.
 */


package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo2 extends OverloadingDemo{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");}
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");

    }
}