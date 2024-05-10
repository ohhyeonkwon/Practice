/*
스티브와 레이철은 서로 다른 역할들이 있지만 프로그래머라는 공통점이 있음

스티브와 레이철은 코딩을 하면서 결과물을 만들어낸다는 점은 같지만, 그 속도가 빠르기도 하고 느리기도 한다는 점에서 차이점이 있음

같은 개발자라고 하더라도 개발하는 속도는 다를 수 있고
쉽게 말해, 이게 바로 다형성이라고 할 수 있음
 */

package org.opentutorials.javatutorials.polymorphism;

interface father{}
interface mother{}
interface programmer{
    public void coding();
}

interface believer{}
class Steve implements father, programmer, believer{
    public void coding(){
        System.out.println("fast");
    }
}

class Rachel implements mother, programmer{
    public void coding(){
        System.out.println("elegance");
    }
}

public class Workspace{
    public static void main(String[] args){
        programmer employee1 = new Steve();
        programmer employee2 = new Rachel();

        employee1.coding();
        employee2.coding();
    }
}