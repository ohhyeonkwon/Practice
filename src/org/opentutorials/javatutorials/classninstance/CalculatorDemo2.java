package org.opentutorials.javatutorials.classninstance;

class Calculator2{
    static double PI = 3.14;
    static int base = 0;
    //클래스 변수 base 추가
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right + base);
        //더하기에 base 값 포함
    }
    public void avg(){
        System.out.println((this.left + this.right + base)/2);
        //평균치에 base 값 포함
    }
}

public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10,20);
        c1.sum();
        //30

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20,40);
        c2.sum();
        //60

        Calculator2.base = 10;
        //클래스 변수 base 값을 10으로 지정

        c1.sum();
        //40

        c2.sum();
        //70
    }
}
