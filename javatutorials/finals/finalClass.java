/*
final로 지정된 class C를 상속하려는 class D도 에러가 발생함
final로 지정된 클래스를 상속받을 수 없기 때문
 */

package org.opentutorials.javatutorials.finals;

final class finalClass {
    final void b(){}
}
//class D extends C{}