package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
    public static void numbering(int limit) {
        // limit을 설정하여 아래 main 메소드에 기입한 5를 전달받아
        // i가 5보다 작은 동안의 반복을 실행
        int i = 0;
        while(i < limit){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        numbering(5);
    }
}


