package main.oop.polymorphism;

/**
 * Inner Class
 * 
 * 내부클래스는 클래스 내부에 선언된 클래스이다.
 * 서로 관련있는 클래스들에 대해서 한 클래스의 내부에 다른 클래스를 선언하여
 * 내부에서는 쉽게 접근하고, 외부에서는 해당 클래스에 불필요한 접근을 감충으로 코드의 복잡성을 줄일 수 있다.
 * 
 * 내부클래스는 선언 위치에 따라서 종류가 달라지는데, 이는 멤버 변수의 선언 위치에 따른 종류와 같다.
 * 내부클래스는 인스턴스 클래스, static 클래스, 지역 클래스, 익명 클래스 등으로 나뉘어진다.
 * 
 * 내부클래스들 또한 abstract, final 을 비롯하여 public, private, protected 와 같은 제어자를 사용할 수 있다.
 * 내부클래스의 멤버들을 선언할 때, static 멤버의 경우는 static 클래스만 가질 수 있다.
 * 다만 static final 로 상수로 선언하는 경우에는 모든 클래스에서 정의할 수 있다.
 * 
 * 인스턴스 클래스는 외부의 인스턴스 멤버들을 객체생성 없이 바로 사용할 수 있지만,
 * static 클래스는 외부 클래스의 인스턴스 멤버를 객체 생성 없이 사용할 수 없다.
 * 
 * 이와 마찬가지로 인스턴스 클래스는 static 클래스의 멤버들을 객체 생성 없이 사용할 수 있지만,
 * static 클래스에서는 인스턴스 클래스의 멤버들을 객체생성 없이 사용할 수 없다.
 * 
 * 그 이유는 static 클래스와 인스턴스 클래스가 메모리에 올라가는 시점의 차이이기 때문인데,
 * static 영역은 클래스 로드시에 이미 메모리에 올라가는 반면, 인스턴스 영역은 객체가 생성될 때 메모리에 실제 할당되기 때문이다.
 * 
 * - instance -> static.static: 접근 가능
 * - static -> instance: 객체 생성없이 접근 불가능
 */
public class InnerClass {
    int outerInstanceVar = 0;
    static int outerStaticVar = 1;

    // 인스턴스 클래스: 외부 클래스의 멤버변수 선언 위치에 선언되는 클래스로 인스턴스 멤버처럼 다루어진다. 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용된다.
    class InstanceClass {
        int var1 = outerInstanceVar;
        int var2 = outerStaticVar;
        
        void accessToStaticMemberOfStaticClass() {
            // 인스턴스 클래스는 static 클래스의 static 멤버에 접근 가능하다.
            System.out.println(StaticClass.var3);
        }
    }

    // static 클래스: 외부 클래스의 멤버변수 선언 위치에 static 으로 선언되어서 static 멤버처럼 다루어진다. 주로 외부 클래스의 static 멤버, 특히 static 메서드에서 사용된다.
    static class StaticClass {
        // static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
        // int var1 = outerInstanceVar;
        int var1 = new InnerClass().outerInstanceVar; // 객체 생성하여 접근할 수 있다.
        int var2 = outerStaticVar;
        static int var3 = 2;
    }

    void methodEX() {
        int localVar = 3;

        // 지역 클래스: 외부 클래스의 메서드나 초기화 블럭 등의 내부에 선언되어서, 해당 선언된 영역에서만 사용될 수 있다.
        class LocalClass {
            int var1 = outerInstanceVar;
            int var2 = outerStaticVar;
            int var3 = localVar;
        }
    }
}