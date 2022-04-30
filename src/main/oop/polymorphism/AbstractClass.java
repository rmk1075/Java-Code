package main.oop.polymorphism;

/**
 * Abstract Class
 * 
 * 추상 클래스는 추상 메서드를 포함하고 있는 클래스이다.
 * 추상 메서드는 메서드의 내용이 구현되어 있지 않은 메서드로 상속을 통해서 메서드를 구현해주어야 한다.
 * 그렇기 때문에 추상 클래스를 통해서는 인스턴스를 생성할 수 없다.
 * 
 * 추상 클래스는 인스턴스를 직접 생성하기 보다는 새로운 클래스를 위한 설계의 기반이 되는 조상 클래스로 역할을 주로 수행한다.
 * 
 * 추상 클래스는 클래스 선언부에 abstract 키워드를 붙여서 선언한다.
 * 
 * 추상 클래스는 추상 메서드를 포함할 수 있다는 것을 제외하고는 일반 클래스와 동일하다. 생성자를 비롯해서 멤버 변수와 메서드 등을 가질 수 있다.
 * 추상 클래스가 무조건 추상 메서드를 가질 필요는 없지만, 추상 메서드로 선언되면 추상 메서드가 없어도 인스턴스를 생성할 수는 없다.
 */
public abstract class AbstractClass {
    // 추상 메서드는 상속을 통해 구현한다.
    public abstract void abstractMethod();
}

class ImplementClass extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("implemented abstract method");
    }

}