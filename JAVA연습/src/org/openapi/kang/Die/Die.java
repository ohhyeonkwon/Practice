package org.openapi.kang.Die;
import java.util.Random;

public class Die {
    private int number;
    String name;

    final int SIDES= 6;

    Die (String name){
        this.name = name + noOfDie;
    }

    static int noOfDie = 0;

    Die(){
        noOfDie++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    void roll(){
        Random r = new Random();
        int no = r.nextInt(SIDES);
        //this.number = (no %SIDES) +1;
        this.setNumber(no+1);
    }



}

