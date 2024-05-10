/*
아래 코드에서 System.out.println(obj.x(),obj2.x());의 결과는 어떻게 출력될까?
결과는 obj.x()는 B1.x가, obj2.x는 B2.x가 출력됨

부모클래스를 데이터타입으로 하고있지만
쉽게 생각해서, class B1과 class B2를 인스턴스화했지만
각자 본인의 클래스 안에 x가 없다면 부모클래스에서 x의 리턴값을 가져오는 것이고
본인 클래스 안에 x가 있다면 본인클래스의 x 리턴값을 반환한다고 생각하면 될 거 같다
 */

package org.opentutorials.javatutorials.polymorphism;
class A1{
    public String x(){return "A1.x";}
}
class B1 extends A{
    public String x(){return "B1.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo2 {
    public static void main(String[] args) {
        A obj1 = new B1();
        A obj2 = new B2();
        System.out.println(obj1.x());
        System.out.println(obj2.x());
    }
}