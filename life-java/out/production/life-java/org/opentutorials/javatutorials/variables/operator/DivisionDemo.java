package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);
        //두 변수가 정수형이기에 소수점 이하의 값은 다 잃어버림

        System.out.println(c/d);
        //두 변수가 실수형이기에 소수점 이하의 값을 다 잃지않게 됨

        System.out.println(a/d);
        /*a는 정수형, d는 실수형이지만 데이터형식을 맞추게되는데
        정수와 실수 중 실수가 더 넓은 수를 표현할 수 있기에
        자동으로 형 변환이 되어 두 변수가 실수형으로 계산이 된다.
        따라서 소수점 이하의 값을 잃지 않게 된다.
         */

    }
}
