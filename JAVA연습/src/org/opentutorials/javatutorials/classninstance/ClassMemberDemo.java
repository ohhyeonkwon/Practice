/* 인스턴스 메소드는 클래스 멤버에 접근 할 수 있다.
인스턴스 변수 = static이 아닌 것
클래스 변수 = static

클래스 메소드는 인스턴스 멤버에 접근 할 수 없다.
        > 클래스는 언제나 메소드보다 먼저 존재한다.
우리는 클래스라는 설계도를 만들고  인스턴스라는 구체적인 제품를 나중에 만들기 때문
어떤 변수에 인스턴스가 담겨있는지 조차도 클래스에서는 알 수가 없다.
*/

package org.opentutorials.javatutorials.classninstance;

class C1{
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static(){
        System.out.println(static_variable);
    }
    static void static_instance(){
        // System.out.println(instance_variable);
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없기 때문에
        // 컴파일 조차 되지 않는 오류 발생
    }
    void instance_static(){
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있음
        System.out.println(static_variable);
    }
    void instance_instance(){
        System.out.println(instance_variable);
    }
}

public class ClassMemberDemo {
    public static void main(String[] args) {
        C1 c = new C1();

        c.static_static();
        // 클래스 메소드에서 인스턴스 변수에 접근 > 성공

        c.static_instance();
        // 클래스 메소드에서 인스턴스 변수에 접근 > 실패

        c.instance_static();
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공

        c.instance_instance();
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공

        C1.static_static();
        // 클래스 메소드가 클래스 변수에 접근 -> 성공

        C1.static_instance();
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패

        //C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패

        //C1.instance_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
    }

}

