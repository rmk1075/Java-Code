package main.oop.abstracts;

/**
 * Interface
 * 
 * 인터페이스는 일종의 추상 클래스이다.
 * 추상 클래스보다 추상화 정도가 높아서 추상 클래스와 달리 구현부를 가진 일반 메서드는 가질 수 없다.
 * 
 * 인터페이스는 class 가 아닌 interface 키워드를 통해 선언된다. 그리고 접근제어자로 public 또는 default 를 사용할 수 있다.
 * 인터페이스의 멤버들도 선언시에 제약사항을 가지는데, 모든 멤버 변수는 상수, 메서드는 추상 메서드가 되어야 한다.
 * 단 메서드의 경우 static 메서드와 default 메서드는 예외이다.
 */
public interface Interfaces {
    // 멤버 변수는 모두 상수로 선언되어야 하기 때문에 public static final 의 키워드로 선언되어야 한다.
    public static final int CONSTANT_NUM = 10;

    // 메서드는 static, default 메서드이거나 추상 메서드 (public abstract) 형태이어야 한다.
    public abstract void abstractMethod1();
    void abstractMethod2(); // 메서드의 경우 public abstract 를 생략해도된다.

    static void staticMethod() {
        System.out.println("static method of interface");
    }

    /**
     * default 메서드는 추상 메서드가 아닌 기본적인 구현이 되어있는 메서드로, 추상 메서드가 아니기 때문에 인터페이스를 구현한 클래스에서 필수적으로 구현하지 않아도 된다.
     * default 키워드를 선언부에 붙여서 작성하며, 디폴트 메서드 역시 public 을 접근제어자로 가진다.
     * 
     * 디폴트 메서드를 인터페이스에 추가하는 경우, 기존의 메서드와 이름이 중복되는 문제가 발생할 수 있는데, 이러한 경우 다음 규칙을 따른다.
     * - 여러 인터페이스의 디폴트 메서드 간의 충돌: 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩 해야한다.
     * - 디폴트 메서드와 조상 클래스의 메서드 간의 충돌: 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.
     */
    default void defaultMthod() {
        System.out.println("default method of interface");
    }
}

interface ParentInterface {
    void parentAbstractMethod();
}

/**
 * 인터페이스도 클래스와 같이 상속을 할 수 있다.
 * 이때 클래스와 달리 다중 상속을 허용한다.
 */
interface ChildInterface extends Interfaces, ParentInterface {

}

class Parent {
    public long id;
    public String name;

    public Parent(long id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 인터페이스 구현
 * 
 * 인터페이스는 추상 클래스의 상속과 같이 다른 클래스가 구현을 함으로써 사용된다.
 * 이때는 구현을 의미하는 implements 키워드를 사용하여 구현할 인터페이스를 상속받는다.
 * 
 * 상속받은 클래스는 인터페이스의 추상 메서드들을 무조건 오버라이딩 하여서 구현해야 한다.
 * 이때 메서드의 접근제어자를 유의해야 하는데, 오버라이딩을 할 때는 항상 원래 메서드의 접근제어자와 같거나 더 넓은 영역을 허용하도록 지정해야 한다.
 * 
 * 인터페이스의 상속은 다중 상속이 가능하다. 여러개의 인터페이스를 구현하도록 선언이 가능하다.
 * 또한 상속과 구현을 같이 사용할 수 있기 때문에 하나의 클래스만 상속받도록 하는 제약사항을 떠나서 다형성을 적용할 수 있다.
 */
class ImplementedClass1 extends Parent implements Interfaces, ParentInterface {

    public ImplementedClass1(long id, String name) {
        super(id, name);
    }

    @Override
    public void abstractMethod1() {
       System.out.println("implemented method abstractMethod1() from Interfaces"); 
    }

    @Override
    public void abstractMethod2() {
        System.out.println("implemented method abstractMethod2() from Interfaces");
    }

    @Override
    public void parentAbstractMethod() {
        System.out.println("implemented method parentAbstractMethod() from ParentInterface");
    }
}

class ImplementedClass2 implements Interfaces, ParentInterface {
    @Override
    public void parentAbstractMethod() {
        
    }

    @Override
    public void abstractMethod1() {
        
    }

    @Override
    public void abstractMethod2() {
        
    }
}

class ImplementedTest {
    public void testPolymorphismOfImplementedClass() {
        /**
         * 자바에서 인터페이스를 사용해서도 다형성을 적용할 수 있다.
         * 인터페이스 타입의 참조변수는 해당 인터페이스를 구현한 클래스 타입의 객체를 모두 참조할 수 있다.
         */
        Interfaces iex = (Interfaces) new ImplementedClass1(123L, "ic1");
        iex = (Interfaces) new ImplementedClass2();
    }
}