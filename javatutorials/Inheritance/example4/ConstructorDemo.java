    /*
    public static void main(String[] args) {
        ConstructorDemo  c = new ConstructorDemo();
    }
    자기 자신을 인스턴스화 시키는 것도 가능함.


    public ConstructorDemo(int param1) {}
    public static void main(String[] args) {
        ConstructorDemo  c = new ConstructorDemo();
    }

    자바는 자동으로 기본 생성자를 만들어주고
    클래스의 이름과 같으며 매개변수가 없는 메소드가 기본 생성자임

    하지만 이 코드는 기본 생성자가 아닌, 매개변수가 있는 생성자를 정의하고 있음
    명시적으로 생성자가 만들어지면 자바는 기본생성자를 만들어주지 않음

    그상태에서 new ConstructorDemo를 인스턴스에 넣었기에 ConstructorDemo가 호출되어야 하는데
    이는 인자가 없지만 ConstructorDemo는 인자를 갖고있고 자바는 이를 자동생성한 것이 아니기에 에러가 발생하게 됨.
     */

    package org.opentutorials.javatutorials.Inheritance.example4;
    public class ConstructorDemo {
        public ConstructorDemo(){} //기본 생성자 추가
        public ConstructorDemo(int param1) {}
        public static void main(String[] args) {
            ConstructorDemo  c = new ConstructorDemo();
        }
    }
    /*
    이를 해결하려면 인자가 없는 기본 생성자를 명시적으로 선언하면 new ConstructorDemo라는 생성자가 호출 될 때
    인자가 없는 생성자를 통해 실행되어 에러가 발생되지 않음.
     */
