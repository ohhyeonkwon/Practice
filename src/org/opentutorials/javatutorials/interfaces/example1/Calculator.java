/*
나중에 완성이 되었을 때 사용자클래스는 setOprands 메소드에서 3개의 인자를 받지만
계산기클래스에서는  setOprands 메소드의 피연산자가 2개임

이는 개발자간의 커뮤니케이션 문제로 인해 발생할 수 있으며 interface를 통해 해결할 수 있음

해결방법은 example2폴더 내의 Calculatable 파일로.
 */

package org.opentutorials.javatutorials.interfaces.example1;

class Calculator {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}