package main.oop;

/**
 * Inheritance
 * 
 * 상속은 기존 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
 * 상속은 extends 키워드를 사용하여 구현할 수 있는데, 이 키워드를 사용하면 조상 클래스의 모든 멤버를 자손 클래스가 상속받게된다.
 * 자손 클래스는 상속받은 모든 멤버, 변수와 함수들을 사용할 수 있다.
 * 다만 생성자와 초기화 블럭은 상속되지 않는다.
 * 
 * C++ 에서는 여러 조상 클래스를 상속받을 수 있지만, 자바에서는 단일 상속만을 지원한다.
 * 그렇기 때문에 extends 키워드 뒤에 하나의 조상 클래스만 위치할 수 있다.
 */
public class Inheritance {
    public void createParentAndChildren() {
        Child child = new Child(0, "jamie", "worker");
        child.show();

        // Child 타입의 객체는 조상 클래스 Parent 에 정의된 멤버 id, name 등을 사용할 수 있다.
        child.id = 1;
        child.name = "jin";
        child.show();
    }
}

class Parent {
    public long id;
    public String name;

    public Parent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.printf("%d %s\n", id, name);
    }

    @Override
    public String toString() {
        return String.format("id=%d name=%s", id, name);
    }
}

// extends 키워드를 사용하여 Parent 클래스를 상속받는다.
class Child extends Parent {
    public String type;

    public Child(long id, String name, String type) {
        super(id, name); // super 키워드를 사용하여 조상 클래스의 멤버를 사용할 수 있다. 이 경우에는 생성자 Parent(long id, String name) 를 사용한 경우이다.
        this.type = type;
    }

    /**
     * Overriding
     * 
     * 오버라이딩은 조상 클래스로부터 상속받은 메서드의 내용을 변경하여 사용하는 것이다.
     * 상속받은 메서드의 이름은 유지하면서 메서드의 내용을 자손 클래스가 새로 정의하여 덮어씌우는 것이다.
     * 
     * 아래의 show() 메서드의 경우 부모 클래스인 Parent 에도 정의되어 있지만
     * 실제로 Child 타입의 객체가 show() 메서드를 호출하면 Parent 클래스가 아닌 Child 클래스의 메서드가 호출된다.
     * 
     * 오버라이딩을 구현하기 위해서는 메서드의 이름과 매개변수, 반환 타입이 모두 같아야 한다.
     * 다만 접근 제어자는 변경할 수 있는데, 이때 조상 클래스의 메서드보다 좁은 범위로만 변경할 수 있다.
     */
    @Override
    public void show() {
        // Parent 의 멤버 id, name 을 사용할 수 있다.
        System.out.printf("%d %s %s\n", id, name, type);
    }

    @Override
    public String toString() {
        // super 키워드를 사용하여 부모 클래스의 메서드 toString() 을 호출할 수 있다.
        return super.toString() + String.format(" type=%s", type);
    }
}
