/*
int A 메소드의 주석을 해제하면 오류가 발생함
그 이유는 같은 이름이며 매개변수가 없는 메소드가 이미 정의되어 있는데
하나는 리턴 값이 void고, 리턴 값이 int이다
근데 자바의 입장에서는 리턴 값이 void인 메소드를 호출했는지 int인 메소드를 호출했는지
인지할 수 없기에 오류가 발생함

메소드의 이름은 같아고 매개변수는 달라야 하지만, 리턴값까지 달라야 오버로딩(overloading)이다.

만약 아래 주석처리한 int param1이라는 매개변수를 가지고 리턴 값이 void인 메소드의 주석을 해제하면 또 오류가 발생한다
왜냐면 매개변수를 달리하더라도 호출될 때 어떤 것을 호출했는지 헷갈리기에.
따라서 이는 오버로딩이 아니다
 */


package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    //void A (int param1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}


