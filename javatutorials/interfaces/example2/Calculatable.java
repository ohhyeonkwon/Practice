/*
서로 약속하여 인터페이스를 만드는 것이 그 해결 방법이다
Calculatable이라는 interface를 만들고
setOprands 메소드에게 정수 인자를 3개 갖게한 후,
sum과 avg는 리턴 값으로 int를 반환하기로
개발자끼리 상호합의한다.
 */

package org.opentutorials.javatutorials.interfaces.example2;

public interface Calculatable {
    public void setOprands(int first, int second, int third) ;
    public int sum();
    public int avg();
}