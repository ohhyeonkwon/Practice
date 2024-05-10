/*
this는 인스턴스를 생성하면 인스턴스 자신을 의미하는 것을 말한다.
this가 붙게되면 전역에 대한 의미를 갖게 되어 전역변수가 된다.
*/

package org.opentutorials.javatutorials.scope;

class C1 {
    int v = 10;

    void m() {
        int v = 20;
        System.out.println(this.v);
    }
}

public class ScopeDemo2 {

    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.m();
    }

}
