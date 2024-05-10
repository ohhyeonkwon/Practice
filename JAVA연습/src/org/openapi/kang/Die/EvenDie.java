package org.openapi.kang.Die;

public class EvenDie extends Die{

    void roll(){
        super.roll();
        int number = getNumber();

        if (number % 2 ==0)
            setNumber(number);
        else
            setNumber(number + 1);
    }
}
