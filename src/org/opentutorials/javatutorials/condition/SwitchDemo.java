package org.opentutorials.javatutorials.condition;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Switch(1)");
        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }
        //switch의 조건 값만을 출력하고 싶다면 break를 활용

        //switch의 조건 값이 case의 어느 부분에도 속하지 않는다면
        //default로 정의된 부분이 실행됨

        int val = 1;
        if(val == 1){
            System.out.println("one");
        }else if(val==2){
            System.out.println("two");
        }else if(val ==3){
            System.out.println("three");
        }
        //위 switch문과 같지만 변수를 이용한 if문의 방식

        System.out.println("Switch(2)");
        switch(2){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }

        System.out.println("Switch(3)");
        switch(3){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }
    }
}
