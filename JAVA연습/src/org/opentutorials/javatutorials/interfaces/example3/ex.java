/*
인터페이스는 클래스가 구현해야 하는 규칙을 정의함
또, 다중 상속이 가능하며 메소드의 본체를 인터페이스가 가져서는 안 됨
인터페이스는 모든 멤버가 퍼블릭이어야 함
 */

package org.opentutorials.javatutorials.interfaces.example3;

interface I1{
    public void x();
}

interface I2{
    public void z();
}

class A implements I1, I2{
    public void x(){}
    public void z(){}
}

interface I5{
    //private void x();
    // public이어야 함
}