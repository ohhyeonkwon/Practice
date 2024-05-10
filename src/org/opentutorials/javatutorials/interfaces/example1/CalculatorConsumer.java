/*
CalculatorDummy클래스는 가짜 클래스임

예를 들어 계산기를 만드는 클래스와 사용하는 클래스가 있다고하고
사용하는 클래스 입장에서 이야기를 하면
계산기 클래스를 만드는데에 3개월의 시간이 소모되면 사용하는 쪽에서는 아무런 작업을 하지 못 하기 때문에
이를 해결하기 위해 사용하는 입장에서 계산기 클래스에 대한 가짜클래스를 만들게 됨
그리고 이 가짜클래스는 사용클래스의 메소드를 호출할 수 있지만 구체적인 내용은 비어있고
sum이나 avg의 값을 호출하는 리턴 값도 계산이 아닌 상수가 고정적으로 박혀있음

이러한 가짜클래스를 만들게 되면 이를 사용하는 클래스는 그 클래스의 구체적인 내용이나 로직이
잘 만들어져 나중에 3개월 뒤 자신에게 인계될 것임을 기대하고 그냥 가짜클래스를 만들어 나머지 로직을 쭉 만들어가며 완성시킴이 목적임

이렇게되면 계산기 클래스를 만들고 사용자클래스를 만들면 2배의 시간이 걸리지만 계산기클래스의 작업과 동시에
사용자클래스의 작업을 동시에 진행하여 같이 끝나게되어 이론적으로 2배의 시간이 줄어듦

추가설명은 같은 폴더 내 Carculator 파일로.
 */

package org.opentutorials.javatutorials.interfaces.example1;
class CalculatorDummy{
    //가짜 클래스
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}

