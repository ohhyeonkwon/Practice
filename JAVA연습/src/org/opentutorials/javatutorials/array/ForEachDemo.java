package org.opentutorials.javatutorials.array;

public class ForEachDemo {
    public static void main(String[] args) {
        String[] members = {"권오현", "박재훈", "이유진"};
        for (String e : members) {
        // members에 담겨있는 값을 하나씩 e에 저장하여 가져옴
            System.out.println(e + "이 상담을 받았습니다");
        }
    }
}
