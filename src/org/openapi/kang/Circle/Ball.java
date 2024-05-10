package org.openapi.kang.Circle;

public class Ball extends Circle {

    String name;

    Ball(int r){
        super(r);
    }

    double getArea(){
        double circleArea = super.getArea();

        return 4 * circleArea;
    }
}
