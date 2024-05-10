/*
메소드의 이름이 같을 수 있기에 충돌을 방지하기 위해
유효범위 또는 스코프(Scope)라고 불리는 개념을 사용한다.

a라는 메소드 안의 i의 값이 반복문의 변수 i에도 영향을 주진 않는다.
*/

package org.opentutorials.javatutorials.scope;

public class ScopeDemo {

    static void a() {
        int i = 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}