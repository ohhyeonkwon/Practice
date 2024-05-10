package org.opentutorials.javatutorials.interfaces.example1;

interface I{
    public void z();
    /*
    I는 class가 아닌 interface임을 의미
    I안에는 z라는 메소드가 정의됨
    하지만 그 본체의 내용은 어디에도 없음
    마치 추상클래스의 추상메소드가 본체가 없는 것과 같음
     */
}

class A implements I{
    //implements는 구현을 의미 즉, A는 I를 구현한다
    public void z(){}
    //위 interface I의 z메소드를 구현하고있고 본체의 로직은 없지만 존재는 함
}