/*
아래의 코드에서 throw new IOException();은 오류가 발생된다.

에러메세지는 아래와 같다.
unreported exception IOException; must be caught or declared to be thrown
이 에러메세지는 IOException을 try, catch하거나 throw 해야한다는 뜻이다.
근데 ArithmeticException도 예외인데 IOException을에만 try, catch나 throw를 해야한다는 뜻이다.

왜 그럴까?

ArithmeticException 예외와 IOException예외를 발생시키는 부분에는 차이가 있다.
ArithmeticException 예외는 throwable클래스를 상속 받기에 오류가 발생하지 않는 것이다.

throwalbe 클래스란,공통적인 인터페이스, 공통적인 조작방법을 제공하는 클래스이다.
또, 위의 throwable 클래스가 존재하기에 상속받는 클래스들만 예외의 정보를 담고있는 클래스로서
인스턴스화 되어 던져질 수 있는 형태를 갖게된다.
ArithmeticException은 부모클래스로 RuntimeException이 있지만,
IOException은 부모클래스가 RuntimeException이 아니라 Exception이다.

그리고 RuntimeException을 제외한 Exception의 하위 클래스를 checked 예외,
RuntimeException의 하위 클래스를 unchekced 예외라 한다.
checked 예외는 반드시 예외처리를 해야 하는 되는 것이고, unchekced는 해도 되고 안 해도 되는 예외다.

try {
    System.out.println(arr[first] / arr[second]);
} catch(ArrayIndexOutOfBoundsException e){
    System.out.println("ArrayIndexOutOfBoundsException");
} catch(ArithmeticException e){
    System.out.println("ArithmeticException");
} catch(Exception e){
    System.out.println("Exception");
}

예를 들어 위 코드의 catch구문 중에 ArrayIndexOutOfBoundsException >
ArithmeticException > Exception 순서로 되어있는 이유는
Exception가 가장 포괄적이기 때문이고, 왜 가장 포괄적이냐면 더 앞에있는 catch 구문들
모두의 부모클래스이기 때문이다

checked 예외 - RuntimeException을 제외한 Exception의 하위 클래스
unchekced 예외 - RuntimeException의 하위 클래스


표준 예외 클래스로도 예외 상황을 표현할 수 있지만 그렇지 않은 때는 직접 예외를 만들면 된다.

예외를 만들기 전에는 예외를 checked로 할지 unchecked로 할지를 정해야 한다.

API 쪽에서 예외를 던졌을 때 API 사용자 쪽에서 예외 상황을 복구 할 수 있다면 checked 예외를 사용한다.
checked 예외는 사용자에게 문제를 해결할 기회를 주는 것이면서 예외처리를 강제하는 것이다.
하지만 checked 예외를 너무 자주 사용하면 API 사용자를 몹시 힘들게 할 수 있기 때문에 적정선을 찾는 것이 중요하다.

사용자가 API의 사용방법을 어겨서 발생하는 문제거나 예외 상황이 이미 발생한 시점에서
그냥 프로그램을 종료하는 것이 덜 위험 할 때는 unchecked를 사용한다.

기존 ArithmeticException을 직접 만든 Exception으로 바꿔보겠다.
 */

package org.opentutorials.javatutorials.exception;
import java.io.IOException;

class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }

    //추가된 부분 시작
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        //추가된 부분 끝

        throw new IOException();
    }
}