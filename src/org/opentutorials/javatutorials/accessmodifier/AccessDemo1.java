/*
접근 제어자는 객체 내의 멤버에 대한 권한을 주는 역할을 함
그리고 접근 제어자에는 public, private 등이 있고,
private 메소드는 클래스 내부에서는 사용할 수 있지만 외부에서는 사용할 수 없음
동일한 클래스 내에서는 private 메소드를 다른 메소드를 통해 호출할 수 있음

접근제어자에는 퍼블릭(public), 프라이빗(private)말고도 프로텍트(protected), 디폴트(default)가 있음
퍼블릭은 언제나 접근 가능하며, 프라이빗은 같은 클래스에서만 접근 가능한다면
프로텍트(protected)는 상속 관계에 있다면 서로 다른 패키지에 있는 클래스의 접근도 허용하고
디폴트(default)는 접근 제어 지시자가 없는 경우를 의미함
즉, 접근 제어자가 없는 메소드는 같은 패키지에 있고 상속 관계에 있는 메소드에 대해서만 접근을 허용함


public 멤버 : public 은 '공개'를 나타내며, 모든 클래스에서 접근이 가능 (패키지와 상관없음)
private 멤버 : private은 '비공개'를 나타내며, 같은 클래스안에 있는 멤버들만 접근이 가능
protected 멤버 : 같은 패키지안의 모든 클래스와, 다른 패키지의 자식 클래스에서 접근이 가능
default(생략) 멤버 : 접근지정자가 없으면 default 멤버로, 같은 패키지안의 클래스에서만 접근이 가능
*/

package org.opentutorials.javatutorials.accessmodifier;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        //System.out.println(a.z());
        // 위 코드는 private의 z을 호출하기에 오류가 발생함
        System.out.println(a.x());
    }
}