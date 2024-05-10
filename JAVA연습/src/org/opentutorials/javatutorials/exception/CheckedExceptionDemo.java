/*
예외는 폭탄과도 같다.
예외라고 하는 폭탄(문제)를 다른 사람에게 던질 수도, 본인이 해결할 수도 있다
설명은 아래와 같다.
 */

/*
package org.opentutorials.javatutorials.exception;
import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);
    }
}

위 코드를 실행하면 new FileReader("out.txt")에 대한 예외처리가 필요하기에 오류가 발생한다.


API의 사용자 쪽에서는 예외에 대한 처리를 반드시 해야 한다는 의미다.
따라서 아래와 같이 해야 FileReader 클래스를 사용할 수 있다.
 */




package org.opentutorials.javatutorials.exception;
import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(input);
    }
}