/*
키보드를 예시로 다형성을 설명하자면
키보드의 esc와 enter키는 조작법은 누른다는 점에서 같지만
esc는 취소, enter는 실행한다는 점에서 다름

다형성의 가장 쉬운 예제는 오버로딩임
같은 메소드지만 매개변수에 따라 다르게 인식됨을 뜻함

a메소드와 b메소드는 둘 다 다른 매개변수를 갖고있음
a의 매개변수는 정수형이고, b는 문자열임

o.a(1)의 데이터 타입은 int이므로 매개변수가 int인 a메소드를 실행하게 되며
o.a("one")의 데이터 타입은 문자열이기에 매개변수가 String인 메소드를 실행하게 됨
 */

package org.opentutorials.javatutorials.polymorphism;
class O{
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);;
        o.a("one");
    }
}