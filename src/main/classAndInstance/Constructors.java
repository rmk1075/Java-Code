package main.classAndInstance;

/**
 * Constructor
 * 
 * 생성자는 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드이다.
 * 주로 인스턴스 변수의 초기화와 같이 인스턴스 생성 시에 실행되어야 할 작업들이 구현되어 있는 메서드이다.
 * 
 * 생성자는 클래스 내에 선언되며, 반환 타입 (리턴값) 을 따로 표시하지 않는다. 또한 생성자를 포함하고 있는 클래스의 이름과 동일해야한다.
 * 
 * 생성자 또한 메서드이기 때문에 오버로딩이 가능하다.
 */
public class Constructors {
    int a = 0;
    int b = 1;

    // 기본 생성자이다. 만약 아무 생성자도 구현되어 있지 않으면 아래와 같은 기본 생성자를 컴파일러가 자동으로 추가하여 컴파일한다.
    public Constructors() {}

    public Constructors(int a) {
        // 메서드에서 현재 인스턴스 내부의 멤버들을 호출하기 위해서는 this 키워드를 사용한다.
        this.a = a;
    }

    public Constructors(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 이미 만들어진 인스턴스의 값을 복사할 때도 사용할 수 있다.
    public Constructors(Constructors cons) {
        this(cons.a, cons.b);
    }
}
