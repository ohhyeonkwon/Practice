/*
final 메소드 b가 있는 class A를 class B가 상속하려고하면 오류가 발생함
final이 있는 클래스는 오버라이딩(overriding) 할 수 없기 때문
 */

package org.opentutorials.javatutorials.finals;

class A{
    final void b(){}
}
class B extends A{
    //void b(){}
}

