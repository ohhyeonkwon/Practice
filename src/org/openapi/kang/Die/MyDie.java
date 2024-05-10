package org.openapi.kang.Die;

public class MyDie {
    public static void main(String[] args) {

        Die d1 = new Die("BK");
        Die d2 = new Die("BK");

        d1.roll();
        d2.roll();

        System.out.println(d1.name + ":" + d1.getNumber());
        System.out.println(d2.name + ":" + d2.getNumber());
        System.out.println(Die.noOfDie);

        EvenDie d3 = new EvenDie();
        d3.roll();

        System.out.println("d3 : "+d3.getNumber());

        MatDie d4 = new MatDie();
        d4.roll();
        System.out.println("d4 : " + d4.getNumber());
    }
}
