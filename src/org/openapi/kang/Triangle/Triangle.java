package org.openapi.kang.Triangle;

public class Triangle {
    private double width;
    private double height;
    static int numOfTriangles;

    public Triangle() {
        numOfTriangles++;
    }

    Triangle(int width, int height){
        this();
        this.width = width;
        this.height = height;
    }

    double findArea(){
        return (this.width * this.height)/2;
    }

    boolean isSameArea(Triangle yours){

        return this.findArea() == yours.findArea() ? true : false;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }


}
