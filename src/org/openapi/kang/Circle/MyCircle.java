package org.openapi.kang.Circle;

public class MyCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(0);
        c1.setRadius(5);

        Circle c2 = new Circle(0);
        c2.setRadius(10);

        Circle c3 = new Circle(20);

        Circle c4 = new Circle(30, "red");
        c4.setColor("red");
        // this는 자기자신을 의미. 즉, c4가 this.
        // this()는 클래스가 가지고있는 '자기 자신을 가르키는 생성자' 메소드

        System.out.println("C1 반지름"+ c1.getRadius());
        System.out.println("C2 반지름"+ c2.getRadius());
        System.out.println("C3 반지름"+ c3.getRadius());
        System.out.println("C4 반지름"+ c4.getRadius());
        System.out.println("C4 색상"+ c4.getColor());

    }
}