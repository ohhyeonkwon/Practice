package org.opentutorials.javatutorials.polymorphism;

interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2, I3{
    //I2, I3를 구현
    public String A(){
        return "A";
        //interface I2를 구현
    }
    public String B(){
        return "B";
        //interface I3를 구현
    }
}

public class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        obj.A();
        obj.B();

        objI2.A();
        //objI2.B();
        // objI2는 I2를 데이터 타입으로 지정하고 있고
        // I2 클래스는 A만을 갖고있기에 B는 오류가 발생함

        objI3.B();
        //objI3.A();
        // 위와 마찬가지로 I3는 B만을 갖고있기에 A를 호출하면 오류발생
    }
}