package main.oop.common;

/**
 * Anonymous Class
 * 
 * 익명 클래스는 이름이 없는 내부 클래스이다.
 * 클래스의 선언과 객체 생성을 동시에 하기 때문에 객체 생성시에 단 한번만 사용될 수 있다.
 * 
 * 따로 이름이 없기 때문에 생성자도 가질 수 없고, 구현하고자 하는 클래스나 인터페이스의 이름을 사용하여 정의하기 때문에
 * 단 하나의 클래스 또는 인터페이스 만을 상속받아 구현할 수 있다.
 */
public class AnonymousClass {
    // Object 클래스를 상속받아 만든 익명 클래스이다.
    Object obj1 = new Object() {
        void method() {
            System.out.println("instance of anonymous class created by Object class");
        }
    };

    static Object obj2 = new Object() {
        void method() {
            System.out.println("instance of static anonymous class created by Object class");
        }
    };

    void localMethod() {
        Object obj3 = new Object() {
            void method() {
                System.out.println("instance of local anonymous class created by Object class");
            }
        };
    }
}
