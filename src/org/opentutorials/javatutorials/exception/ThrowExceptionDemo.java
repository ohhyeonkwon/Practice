/*
FileNotFoundException, IOException을 catch헀지만
다음 사용자인 class C에게 throw 할 수 있음

그리고 FileNotFoundException을 throw하기 위해
run 메소드 뒤에 throws FileNotFoundException 하니
class C의 b.run 메소드에 오류가 뜨는 것을 볼 수 있다

그 이후는 FileNotFoundException이 발생할 수 있다는 것을
run 메소드 사용자에게 암시를 주며 대응할 것을 강제하기에 오류가 발생함

이 에러를 해결하려면 class C의 b.run을 try catch문으로 수정해주면 됨

이제 class B에서 new FileReader를 하는 과정에서 예외에 대한 책임을 지지 않아도 되기에
try문을 삭제해도 아무런 문제가 없음

IOException 예외도 마찬가지로 진행
 */

package org.opentutorials.javatutorials.exception;
import java.io.*;
class B{
    void run() throws  FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
        //try { try, catch문 삭제
            bReader = new BufferedReader
                    (new FileReader("out.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } try, catch문 삭제
       //try{
            input = bReader.readLine();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
        System.out.println(input);
    }
}

class C{
    void run() throws  FileNotFoundException, IOException{
        // 두 개의 예외를 다음 사용자에게 또 던짐.
        //b.run(); 아래의 try, catch문으로 수정
        B b = new B();
//        try {
            b.run();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        } 또 다시 던짐으로 인해 작성되었던 try, catch문은 삭제
    }
}

public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 예외를 받았으므로 try, catch문을 통해 c.run()에 발생된
        // 오류를 해결

    }
}