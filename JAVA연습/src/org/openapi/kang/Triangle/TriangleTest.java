package org.openapi.kang.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 5);
        Triangle t2 = new Triangle(10, 10);

        System.out.println("the number of Triangles : " +
                Triangle.numOfTriangles);

        System.out.println("t1 area : " + t1.findArea());
        System.out.println("t2 area : " + t2.findArea());

        System.out.println("t1 is the same area with t2 : "
                + t1.isSameArea(t2));

        t1.setHeight(10);
        t1.setWidth(10);
        System.out.println("t1 is the same area with t2 : "
                + t1.isSameArea(t2));
    }
}
