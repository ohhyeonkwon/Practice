/*여기서 알 수 있는 것은
어떠한 class를 인스턴스화 시킬 때 인스턴스를 담는 변수의 데이터 타입은
해당 클래스가 될 수도 있고 그 클래스의 부모클래스가 될 수도 있음

이때의 효과는 obj변수가 부모클래스인 class A처럼 동작하게 할 수도 있음

오버라이딩하면 오버라이딩한 메소드의 우선순위가 더 높음
즉, 자식클래스의 메소드가 우선순위가 높다는 뜻
 */

package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "x";}
}
class B extends A{
    //class A를 상속받는 class B.
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        //PolymorphismDemoe1 class는 new B를 obj변수에 인스턴스화 시켰고
        //이는 A의 행세를 하고있음

        obj.x();
        //obj.x() 메소드는 잘 실행되어 x를 반환함
        //왜냐? obj변수가 A 행세를 하고있고 class A에 x가 있기 때문

        //obj.y();
        //하지만 obj.y는 실행되지 않고 오류가 발생함
        //obj변수의 데이터 타입이 class A이고 여기에 y가 없기 때문
    }
}


/*
package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.x());
    }
}
 */

/*
만약 위와 같은 코드를 실행하면 48번째 줄의 obj.x()의 결과는 어떻게 나올까?
class A의 값을 리턴한다면 A.x가 출력되고 class B의 값을 리턴하면 B.x가 출력될 것임

결과는 B.x가 출력됨
이유는 아래와 같다.

클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때
클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 되고,
동시에 클래스 B에서 오버라이딩한 맴버의 동작방식은 그대로 유지함
 */