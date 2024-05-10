/*
finally는 예외여부와 관계없이 실행되는 로직임

아래의 코드에서 try 내의 구문은 10을 0으로 나누려하기에
예외가 발생하여 catch 구문이 실행되고
아래의 finally 구문은 예외와 상관없이 try 내의 구문이 실행되면 항상 실행됨


finally는 어떤 작업의 경우는 예외와는 상관없이 반드시 끝내줘야 하는 작업에 사용하는 것이 효율적임

데이터베이스를 사용한다면 데이터베이스 서버에 접속해야 하고, 이때, 서버와 애플리케이션은 서로 접속상태를 유지하는
데이터베이스를 제어하는 과정에서 예외가 발생해서 후속 작업을 수행하는 것이 불가능한 경우가 있을 수 있다.

예외가 발생했는데 데이터베이스 접속을 끊지 않으면 데이터베이스와 연결 상태를 유지하게 되고
그렇게되면 데이터베이스는 더 이상 접속을 수용할 수 없는 상태에 빠질 수 있기에 접속을 끊는 작업은 예외 발생여부와 상관없기 때문에 finally에서 처리하기 좋음.

즉, finally는 작업의 뒷정리를 담당한다고 볼 수 있음.
 */

package org.opentutorials.javatutorials.exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }

    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}