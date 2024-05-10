package org.openapi.kang.Die;

public class MatDie extends Die{

    void roll(){
        super.roll();
        int number = getNumber();
        System.out.println("super.roll() :"+ number);



        setNumber(1);
    }
}
