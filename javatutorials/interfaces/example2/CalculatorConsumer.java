/*
사용하는 클래스에서는 똑같이 CalculatorDummy를 사용하고 있음
그리고 Dummy클래스의 아까와 다른점은 Calculatable 클래스를 구현하고 있다는 점임


 */

package org.opentutorials.javatutorials.interfaces.example2;
class CalculatorDummy implements Calculatable{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}