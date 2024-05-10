package org.opentutorials.javatutorials.numberString;

public class CharString {
    public static void main(String[] args) {
        /*자바는 문자(Character)와 문자열(String)을 구분.
        문자는 한 글자, 문자열은 여러 개의 문자가 결합한 것.
        문자는 작은 따옴표(''), 문자열은 큰 따옴표("")
        */

        System.out.println('권');

        System.out.println("권오현");
        //문자열은 문자열을 작은 따옴표로 할 경우 오류 발생

        System.out.println("권");
        //하나의 문자를 큰 따옴표로 감싸도 에러는 발생하지 않음.
        // 한 글자도 문자열이 될 수 있기 때문

        System.out.println("보디빌딩"+"코딩");
        //문자열을 서로 더할 수 있음

        System.out.println("1"+"1");
        //숫자가 아닌 문자열의 합이기에 2가 아닌 11이 출력됨

        System.out.println("kwonohhyeon \"bodybuilding\"");
        //문자열 속 문자열을 넣고 싶다면 역슬래시를 활용

        System.out.println("kwonohhyeon\n \"bodybuilding\"");
        //따옴표 안의 내용을 다음 줄에 출력하고 싶다면 \n(줄바꿈)을 추가
    }
}

