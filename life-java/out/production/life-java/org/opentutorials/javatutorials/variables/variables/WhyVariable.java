package org.opentutorials.javatutorials.variables;

public class WhyVariable {
    public static void main(String[] args) {
        System.out.println(100+10);
        System.out.println((100+10/10));

        //위 코드가 길어질 수록 중복과 가독성, 유지보수를 높이기 위해
        //변수를 사용함. 아래와 같이 변수를 사용을 할 수 있음
        int a= 100;
        System.out.println(a+10);
        System.out.println((a+10)/10);
    }
}
