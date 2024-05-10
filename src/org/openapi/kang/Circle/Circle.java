package org.openapi.kang.Circle;

public class Circle {
    private int radius;
    double PI = 3.14159265358979323846;
    private String color;

    Circle(int r){
        radius = r;
    }
    //기본생성자

    Circle(int r, String color){
        this(r); // = Circle(r);
        //생성자를 호출하는 것이 첫 번째로 나와야하기에 this(r);이
        // this.color = color; 의 아래에 호출된다면 에러가 발생함
        this.color = color;
    }
    //기본생성자를 오버로딩

    double getArea(){
        return radius * radius * PI;
    }

    public int getRadius() {
        return radius;
    }
    // radius의 getter

    public void setRadius(int radius) {
        this.radius = radius;
    }
    // radius의 setter

    public String getColor() {
        return color;
    }
    // color의 getter

    public void setColor(String color) {
        this.color = color;
    }
    // color의 setter

    int getDiameter(){
        int result = radius * 2;
        return result;
    }
}

