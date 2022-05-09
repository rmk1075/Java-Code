package main.oop;

/**
 * Modifier
 * 
 * 제어자는 클래스, 변수 또는 메서드의 선언부에 사용되는 키워드로 접근 제어자와 그 외의 제어자들로 구분된다.
 * 접근 제어자는 public, protected, default, private 으로 구성되며 해당 리소스에 접근할 수 있는 영역을 제한한다.
 * 그 외에는 static, final, abstract, native, transient, synchronized, volatile 등 각각의 기능을 가지고 있는 제어자들이 있다.
 */
public class Modifiers {
    /**
     * access modifiers
     * 
     * 접근 제어자는 public, protected, default, private 의 4가지가 존재한다.
     * - public: 해당 리소스에 대한 접근에 제한이 없다.
     * - protected: 같은 패키지 내부, 다른 패키지에서 해당 클래스를 상속한 자손 클래스에서 접근이 가능하다.
     * - default: 같은 패키지 내무에서만 접근이 가능하다.
     * - private: 같은 클래스 내부에서만 접근이 가능하다.
     * 
     * 해당 제어자에 따른 접근 예제는 main.oop.encapsulation 에 작성되어있다.
     */
    public int publicVar = 0;
    protected int protectedVar = 1;
    int defaultVar = 2; // default 제어자는 명시적으로 default 를 붙이지 않는다.
    private int privateVar = 3;

    /**
     * static
     * 
     * static 은 이전에 클래스 변수나 클래스 메서드를 선언할 때 사용했던 것과 같이 '클래스의', '공통적인' 개념으로 사용된다.
     * 인스턴스 멤버들은 하나의 클래스로부터 생성되어도 각기 다른 공간에 저장되지만 클래스 멤버들은 인스턴스에 관계없이 같은 공간을 참조한다.
     * 
     * static 멤버 변수는 클래스가 메모리에 로드될 때 생성된다.
     * 이와 같이 static 초기화 블럭도 클래스가 메모리에 로드될 때 단 한번만 수행되며 주로 클래스 변수를 초기화 하는데 사용된다.
     */
    static int staticInt;

    // 초기화 블럭은 생성자가 호출되기 전에 호출된다. static 이 붙은 초기화 블럭은 일반 초기화 블럭과 달리 메모리에 올라갈 때 단 한번만 호출된다.
    static {
        staticInt = 0;
    }

    /**
     * final
     * 
     * final 은 변경될 수 없는 특징을 가지고 있는 키워드이다. 
     * 각각 final 이 키워드가 붙는 위치에 따라 의미가 조금씩 달라진다.
     * 
     * - 클래스: 변경될 수 없는 클래스. 확장될 수 없는 클래스가 되어 상속에서 조상 클래스로 사용할 수 없다.
     * - 메서드: 변경될 수 없는 메서드. 오버라이딩을 통해 재정의 할 수 없다.
     * - 변수: 변수의 값을 변경할 수 없다. 상수가 된다.
     */
    static final int NUM1 = 1;
    final int NUM2 = 2;
    final int NUM3; // final 인스턴스 변수는 생성자에서 초기화 해주어야 한다.

    public Modifiers(int number) {
        NUM3 = number; // 초기화 해주지 않으면 컴파일 오류가 발생한다.
    }
}

/**
 * abstract
 * 
 * abstract 는 추상 개념을 구현할 때 사용된다.
 * 추상 메서드는 선언부만 작성하고 구현부는 작성하지 않는 메서드를 의미한다.
 * 추상 클래스는 이러한 추상 메서드를 포함하고 있는 클래스를 의미한다.
 */
abstract class AbstractClass {
    // static + abstract 조합은 사용할 수 없다. static 은 구현부가 있는 메서드에만 사용할 수 있기 때문이다.
    // static abstract void staticAbstractMethod();

    // private + abstract method 는 사용할 수 없다. abstract 메서드는 상속을 통해 구현해주어야 하는데, private 의 경우 자손 클래스에서 해당 메서드에 접근할 수 없기 때문이다.
    // private abstract void privateAbstractMethod();

    // abstract 메서드는 구현부가 존재하지 않는다. 상속받은 클래스에서 해당 메서드의 구현부를 구현하여 사용할 수 있다.
    abstract void abstractMethod();
}

// abstract + final class 는 사용할 수 없다. abstract 는 상속을 통해 구현부가 추가된다는 의미를 내포하고 있고 final 은 반대로 확장을 제한한다는 의미를 가지기 때문이다.
// abstract final class AbstractFinalClass {}