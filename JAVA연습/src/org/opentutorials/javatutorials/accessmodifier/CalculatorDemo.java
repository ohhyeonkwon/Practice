/*
접근 제어자는 객체를 보호하고 외부 접근을 제한하기 위해 사용되고
퍼블릭 영역과 프라이빗 영역을 나누어 코드의 중복을 줄일 수 있음

프라이빗 영역은 내부적으로 사용되는 메소드를 통제할 수 있게 하며,
프라이빗으로 지정된 변수는 사용자가 직접 변경할 수 없게 되어 예기치 않은 동작을 방지할 수 있음

아래 코드에서는 인스턴스 left와 right가 private으로 지정되었고
외부에서 호출될 필요가 없기에 외부로부터 해당 변수를 숨기기 위해서 private으로 지정함
이렇듯 사용자가 접근하면 안되거나 접근 할 필요가 없는 멤버에 대한 접근을 규제할 수 있음
*/

package org.opentutorials.javatutorials.accessmodifier;

class Calculator{
    private int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){
        return this.left+this.right;
    }
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}