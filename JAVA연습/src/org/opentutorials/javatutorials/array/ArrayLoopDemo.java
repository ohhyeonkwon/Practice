package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {
    public static void main(String[] args) {

        String[] members = {"권오현", "박재훈", "이유진"};
                for (int i=0; i<members.length; i++) {
                    //i를 초기화, i의 반복조건, i의 반복실행
                    String member = members[i];
                    System.out.println(member + "이 상담을 받았습니다");
                }
    }
}
