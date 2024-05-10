package org.opentutorials.javatutorials.abstractclass.example;
abstract class A{
// class A가 추상클래스라는 의미
    public abstract int b();
    // 추상메소드를 갖고있는 클래스는 자동으로 추상클래스가 된다
    // 한 개의 메소드라도 추상메소드라면 그 메소드를 담고있는 클래스는 반드시 추상클래스가 됨

    //public abstract int c(){System.out.println("Hello")}
    // abstract가 붙어있는 메소드는 위의 s.out과 같은 로직을 갖고있으면 안됨
    public void d(){
        System.out.println("world");
        // 추상클래스 내에는 추상메소드가 아닌 메소드도 존재할 수 있음
    }
}
class B extends A{
    public int b(){
        return 1;
        /*
        class A를 사용하려했으나 아래의 오류가 발생하여
        class B를 만들었고 class A를 상속하고 있다
        class A안의 추상메소드 b를 바로 사용할 수 없기에
        class A를 상속받은 class B가 반드시 추상메소드 b의 구체적인 내용을
        메소드의 본체를 정의해서 오버라이딩(overriding)을 하는 것임
        */
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        // A obj = new A();
        // 위의 주석을 풀면 에러가 발생함
        // 그 이유는 class A가 추상클래스이기 때문. 반드시 상속해서 사용해야함
        B obj = new B();
    }
}