package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
    public static void numbering() {
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering();
    }
    // 위의 메소드를 호출하여 출력하는 과정 (재활용성)
    // numbering을 더 추가하면 더 추가되어 출력됨
}
